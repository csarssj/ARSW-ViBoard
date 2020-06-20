package edu.escuelaing.eci.arsw.viboard.models;

import javax.persistence.Entity;

@Entity
public class Chat {
	private String message;
	private String sender;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	

}
