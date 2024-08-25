package com.example.service;

import java.text.ParseException;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.example.model.OtpRequest;
import com.example.model.StoreOTP;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class SmsService {
	
	private final String Account_SID="AC59b72df32afb2981abea208751d0ed2f";
	
	private final String Auth_Token="172bd30adfbd687b96c6b8c83e1455a1";
	
	private final String Twilio_phone_number="+16612634841";
	
	public void send(OtpRequest sms) throws ParseException{
		Twilio.init(Account_SID,Auth_Token);
		int min=100000;
		int max=999999;
		int number=(int)(Math.random()*(max-min+1)+min);
		
		String msg="Your OTP is "+number+".";
		Message message=Message.creator(new PhoneNumber(sms.getPhoneNo()), new  PhoneNumber(Twilio_phone_number), msg).create();
		StoreOTP.setOtp(number);
		
	}
	
	public void receive(MultiValueMap<String,String> smscallback) {
		
	}

	

}
