package com.rakesh.sendsms.config;

import org.springframework.context.annotation.Configuration;

@Configuration

public class TwilioConfig {
     
	private static final String accountSid = ""; //enter twillo account sid
	private static final String authToken =""; //enter authtoken
	private static final String trialNumber =""; //trail number provide by twillo
	
	public TwilioConfig() {
		
	}

	public static String getAccountsid() {
		return accountSid;
	}

	public static String getAuthtoken() {
		return authToken;
	}

	public static String getTrialnumber() {
		return trialNumber;
	}

	
	
	
	
}
