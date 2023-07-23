package com.example.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Response;
import com.example.model.OtpRequest;
import com.example.model.OtpResponse;
import com.example.service.SmsService;

@RestController
public class OtpController {

	@Autowired
	SmsService service;

	@Autowired
	private SimpMessagingTemplate webSocket;

	private final String Topic_Destination = "/lesson/sms";

	@PostMapping("/phoneNo")
	public Response<OtpResponse> sendOtp(@RequestBody OtpRequest phoneNo){
		try {
			System.out.println(phoneNo.getPhoneNo());
			service.send(phoneNo);
		}catch(Exception e) {
			return new Response<OtpResponse>(500, "something is wrong with number",new OtpResponse("failure") );
		}
		webSocket.convertAndSend(Topic_Destination,getTimeStamp()+": sms has been sent"+ phoneNo.getPhoneNo());
		return new Response<OtpResponse>(200, "OTP is successfully send",new OtpResponse("success"));
	}

	/*
	 * @PostMapping("/smscallback") public void smsCallBack(@RequestBody
	 * MultiValueMap<String, String> map) {
	 * 
	 * service.receive(map);
	 * webSocket.convertAndSend(Topic_Destination,getTimeStamp()
	 * +": Twilio has resend this message"+map.toString());
	 * 
	 * }
	 */

	private String getTimeStamp() {
		// TODO Auto-generated method stub
		return DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS").format(LocalDateTime.now());
	}
}
