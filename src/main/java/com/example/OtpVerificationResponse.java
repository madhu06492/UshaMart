package com.example;

public class OtpVerificationResponse {


	String message;
	
	public OtpVerificationResponse( String message) {
		this.message=message;
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
