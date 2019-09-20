package com.dev.exceptions;

public class CustomException extends Exception{
	public CustomException() {
		System.out.println("Exception occured");
	}
	public CustomException(int i) {
		System.out.println("Exception occured for interger");
	}
	public CustomException(String str) {
		System.out.println("Exception occured for string");
	}
	/*
	 * @Override public String getMessage() { return "/ by zero"; }
	 */
	@Override
	public String getLocalizedMessage() {
		return "Exception in NegativeArraySizeException";
	}
}
