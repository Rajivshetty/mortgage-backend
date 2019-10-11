package com.bank.mortgage.exception;

public class CommonException extends Exception{
	 private String message;
	 
	 public CommonException(String message){
		 super();
	  this.message = message;
	 }
	}