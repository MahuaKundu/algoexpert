package com.java.exception.concept;

public class IncorrectFileNameException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public IncorrectFileNameException() {
		// TODO Auto-generated constructor stub
	}
	
	 public IncorrectFileNameException(String errorMessage) {
	        super(errorMessage);
	    }
	 
	 
	 public IncorrectFileNameException(String errorMessage, Throwable te) {
	        super(errorMessage,te);
	    }
}
