package com.areyes.junit.svc;

public class MessageService {

	private String message;

	public MessageService(String message) {
		super();
		this.message = message;
	}
	
	public String printMessage() {
		return message;
	}
	
	public String salutationMessage() {
		message = "Hi!" + message;
		return message;
	}
	
	public String salutationMessageForExecutives() {
		return "this is not yet implemented";
	}
}
