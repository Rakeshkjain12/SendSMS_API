package com.rakesh.sendsms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.sendsms.config.TwilioConfig;
import com.rakesh.sendsms.model.SMS;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;


@Service
public class SmsSenderServiceImpl implements SmsSenderService {
	
	@Autowired
	private TwilioConfig twiloConfig;

	
	
	@Override
	public void sendSms(SMS sms) {
		
		if(isPhoneNumberVaild(sms.getPhoneNumber() )) {
		     PhoneNumber to = new PhoneNumber(sms.getPhoneNumber());
		     PhoneNumber from = new PhoneNumber(TwilioConfig.getTrialnumber());
		     String message = sms.getMessage();
             MessageCreator creator=Message.creator(to, from, message);
		     creator.create();
		}else {
			throw new IllegalArgumentException("PhoneNumber [ " +sms.getPhoneNumber()+ "] is not valid");
		}
	}



	private boolean isPhoneNumberVaild(String phoneNumber) {
		// TODO :Implement phone number validation code 
		return true;
	}

}
