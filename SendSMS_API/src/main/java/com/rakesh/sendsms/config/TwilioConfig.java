package com.rakesh.sendsms.config;

import org.springframework.context.annotation.Configuration;

@Configuration

public class TwilioConfig {
     
	private static final String accountSid = "AC7769431f00a44f7bc59fce7c41bff160";
	private static final String authToken ="cc441dfc37ac8fbf09ec134f47c792d4";
	private static final String trialNumber ="+12017012903";
	
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
