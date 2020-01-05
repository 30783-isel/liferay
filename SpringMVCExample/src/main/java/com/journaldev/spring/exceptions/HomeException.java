package com.journaldev.spring.exceptions;

public class HomeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public static final String ERROR_NO_RESULTS = "ERROR_NO_AUTENTICATION";
	public static final String TYPE_ERROR = "ERROR_ACCESS_DENIED";

	protected String error;
	protected String errorType;
	
	public HomeException( String error, String errorType, String message ) {
		super(message);
		this.error = error;
		this.errorType = errorType;
	}
	
}
