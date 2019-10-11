package com.bank.mortagage.exception;

public class CommonException extends RuntimeException{

	private String message;

	public CommonException(String message) {
		this.message = message;
	}
	
	
}
