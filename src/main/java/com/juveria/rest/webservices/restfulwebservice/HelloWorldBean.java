package com.juveria.rest.webservices.restfulwebservice;

public class HelloWorldBean {
	
	private String message;
	
	public HelloWorldBean(String message) {
		this.setMessage(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
}
