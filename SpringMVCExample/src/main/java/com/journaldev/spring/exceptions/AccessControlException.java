package com.journaldev.spring.exceptions;

import com.journaldev.spring.exceptions.GboException;

public class AccessControlException extends GboException {

	private static final long serialVersionUID = 6492142001027391954L;

	public AccessControlException(String error, String errorType, String message,
			Throwable cause) {
		super(error, errorType, message, cause);
	}

	public AccessControlException(String error, String errorType, String message) {
		super(error, errorType, message);
	}

}
