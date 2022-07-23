package com.eduPortal.EduPortalWeb.Entity;

public class MessageBody {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public MessageBody(String message){
		this.message = message;
	}
}