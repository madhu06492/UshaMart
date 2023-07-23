package com.example;
public class Response<T> {
	private int statusCode = 500;
	private String message = "Something went wrong.";
	private T data;

	public Response(int statusCode, String message,T data) {
		this.statusCode = statusCode;
		this.message = message;
		this.data=data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}