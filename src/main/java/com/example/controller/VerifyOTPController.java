package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OtpVerificationResponse;
import com.example.Response;
import com.example.model.StoreOTP;
import com.example.model.TempOtp;

@RestController
public class VerifyOTPController {
	
	@PostMapping("/verifyOtp")
	public Response<OtpVerificationResponse> verifyOTP(@RequestBody TempOtp sms) {
		
		if(sms.getOtp()==StoreOTP.getOtp()) {
			
			return new Response<OtpVerificationResponse>(200,"success",new OtpVerificationResponse("verification successful") );
		}else {
			return new Response<OtpVerificationResponse>(500,"failure",new OtpVerificationResponse("verification failed") );
		}
		
	}

}
