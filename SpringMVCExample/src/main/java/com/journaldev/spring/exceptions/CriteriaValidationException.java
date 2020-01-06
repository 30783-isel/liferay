package com.journaldev.spring.exceptions;

import com.journaldev.spring.exceptions.GboException;

public class CriteriaValidationException extends GboException {

	public static final String ERROR_INVALID_SIZE = "ERROR_INVALID_SIZE";
	
	public static final String ERROR_UNSUPPORTED_ENCODING = "ERROR_UNSUPPORTED_ENCODING";
	public static final String ILLEGAL_ARGUMENT_OR_ACCESS = "ILLEGAL_ARGUMENT_OR_ACCESS";

	public static final String ERROR_NUMBER_FORMAT_EXCEPTION = "ERROR_NUMBER_FORMAT_EXCEPTION";
	public static final String ERROR_PATTERN_FORMAT_EXCEPTION = "ERROR_PATTERN_FORMAT_EXCEPTION";
	
	public static final String ERROR_VALUE_OUT_OF_RANGE = "ERROR_VALUE_OUT_OF_RANGE";
	public static final String VALTYPE_CHECK_MANDATORY = "VALTYPE_CHECK_MANDATORY";
	
	public static final String MSG_NO_CRITERIA = "There were no criteria in input !";
	public static final String MSG_INVALID_CRITERIA = "The criteria sent is invalid!";
	public static final String MSG_EMPTY_OR_NULL = "The scoped Object is null or empty!";	

	
	public static final String MISSING_MANDATORY_ATTRIBUTES = "MISSING_MANDATORY_ATTRIBUTES";
	public static final String MISSING_OPTIONAL_ATTRIBUTES = "MISSING_OPTIONAL_ATTRIBUTES";
	public static final String MISSING_LAST_USER_ID = "MISSING_LAST_USER_ID";
	
	public static final String MSG_MISSING_MANDATORY_ATTRIBUTES = "Mandatory criterias cant be null!";
	public static final String MSG_MISSING_OPTIONAL_ATTRIBUTES = "Must have at least one optional attribute not null";
	public static final String MSG_MISSING_LAST_USER_ID = "Cannot perform operation without user id.";
	

	
	public static final String EMPTY_WHERE_CLAUSE = "EMPTY_WHERE_CLAUSE";
	public static final String EMPTY_UPDATE_CLAUSE = "EMPTY_UPDATE_CLAUSE";
	public static final String EMPTY_DELETE_CLAUSE = "EMPTY_DELETE_CLAUSE";
	public static final String EMPTY_INSERT_CLAUSE = "EMPTY_INSERT_CLAUSE";
	
	public static final String MSG_EMPTY_WHERE_CLAUSE = "Unable to execute query without WHERE CLAUSE!";
	public static final String MSG_EMPTY_UPDATE_CLAUSE = "Unable to execute query without UPDATE PARAMETERS or WHERE CLAUSE!";
	public static final String MSG_EMPTY_DELETE_CLAUSE = "Unable to execute delete query without WHERE CLAUSE!";
	public static final String MSG_EMPTY_INSERT_CLAUSE = "Unable to execute query without all mandatory INSERT PARAMETERS!";
	
	
	public CriteriaValidationException(String error, String errorType,
			String message, Throwable cause) {
		super(error, errorType, message, cause);
	}
	public CriteriaValidationException(String error, String errorType,
			String message) {
		super(error, errorType, message);
	}
	
	private static final long serialVersionUID = 1L;
}
