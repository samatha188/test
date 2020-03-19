package com.example.restservice;

import java.io.Serializable;

public class ResponseValue implements Serializable {

	public void setReversed(String reversed) {
		this.reversed = reversed;
	}

	private  String reversed;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;

	public String getReversed() {
		return reversed;
	}
}
