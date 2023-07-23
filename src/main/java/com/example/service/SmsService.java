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
	
	private final String Account_SID="AC52c772e453d4e50488c6d8c06f0f3f45";
	
	private final String Auth_Token="75186e77967f225b80c31616ba23b532";
	
	private final String Twilio_phone_number="+14847397994";
	
	public void send(OtpRequest sms) throws ParseException{
		Twilio.init(Account_SID,Auth_Token);
		int min=100000;
		int max=999999;
		int number=(int)(Math.random()*(max-min+1)+min);
		
		String msg="Your OTP is"+number+".";
		Message message=Message.creator(new PhoneNumber(sms.getPhoneNo()), new  PhoneNumber(Twilio_phone_number), msg).create();
		StoreOTP.setOtp(number);
		
	}
	
	public void receive(MultiValueMap<String,String> smscallback) {
		
	}

	

}
