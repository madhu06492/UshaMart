package com.example;

public class OtpVerificationResponse {

	boolean isValidOTP;
	String message;
	
	public OtpVerificationResponse(boolean b, String message) {
		this.isValidOTP=b;
		this.message=message;
		
	}
	public boolean isValidOTP() {
		return isValidOTP;
	}
	public void setValidOTP(boolean isValidOTP) {
		this.isValidOTP = isValidOTP;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
