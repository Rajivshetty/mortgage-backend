package com.bank.mortagage.exception;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class ErrorResponse implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private Integer statusCode;
	private String message;
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorResponse(Integer statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
	
	
	

}
