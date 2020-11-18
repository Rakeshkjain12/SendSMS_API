package com.rakesh.sendsms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

@Configuration
public class TwilioInitilizer {
    @Autowired
	private TwilioConfig twilioConfig;

	public TwilioInitilizer(TwilioConfig twilioConfig) {
		super();
		this.twilioConfig = twilioConfig;
		Twilio.init(
                 twilioConfig.getAccountsid(),
				 twilioConfig.getAuthtoken()
		);
	}
	
	
}
