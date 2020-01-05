package com.journaldev.spring.exceptions;

/**
 * @author Accenture
 */
public class GboException extends Exception {

	public static final String ERROR_NO_AUTENTICATION = "ERROR_NO_AUTENTICATION";
	public static final String ERROR_ACCESS_DENIED = "ERROR_ACCESS_DENIED";
	public static final String ERROR_SEQUENCE_NEXT_VALUE = "ERROR_SEQUENCE_NEXT_VALUE";
	public static final String ERROR_IN_REQUEST_PARAMETERS = "ERROR_IN_REQUEST_PARAMETERS";
	
	public static final String ERROR_NO_RESULTS = "ERROR_NO_RESULTS";
	public static final String ERROR_NO_UPDATE = "ERROR_NO_UPDATE";
	public static final String ERROR_NO_INSERT = "ERROR_NO_INSERT";
	public static final String ERROR_NO_DELETE = "ERROR_NO_DELETE";
	
	public static final String ERROR_NULL_EMPTY_ELEMENT = "ERROR_NULL_EMPTY_ELEMENT";
	public static final String ERROR_NULL_EMPTY_FIELD = "ERROR_NULL_EMPTY_FIELD";
	public static final String ERROR_INVALID_FIELD = "ERROR_INVALID_FIELD";
	
	public static final String TYPE_ERROR = "erro";
	public static final String TYPE_WARNING = "alerta";

	protected String error;
	protected String errorType;

	/**
	 * Constructs a new exception with the specified error, errorType and 
	 * detail message.  The cause is not initialized, and may subsequently be 
	 * initialized by a call to {@link #initCause}.
	 *
	 * @param	error the error type. Static string declared in exception 
	 * 			that describes the type of error. Can be used by catch block 
	 * 			for exception comparisons. Used by {@link #toString()} to 
	 * 			display detail error in a more user friendly way by the Logger.
	 * @param 	errorType the error sub type. Can be a static string declared
	 * 			in exception or any other string describing furthermore the error 
	 * 			motive, depending on error type. Used by {@link #toString()} to 
	 * 			display detail error in a more user friendly way by the Logger.
	 * @param	message   the detail message. The detail message is saved for
	 * 			later retrieval by the {@link #getMessage()} method. In a specific
	 * 			application exception, it stores the message to be displayed to the
	 * 			end user.
	 */
	public GboException( String error, String errorType, String message ) {
		super(message);
		this.error = error;
		this.errorType = errorType;
	}

	/**
	 * Constructs a new exception with the specified error, errorType,
	 * detail message and cause.  <p>Note that the detail message associated 
	 * with {@code cause} is <i>not</i> automatically incorporated in
	 * this exception's detail message.
	 *
	 * @param	error the error type. Static string declared in exception 
	 * 			that describes the type of error. Can be used by catch block 
	 * 			for exception comparisons. Used by {@link #toString()} to 
	 * 			display detail error in a more user friendly way by the Logger.
	 * @param 	errorType the error sub type. Can be a static string declared
	 * 			in exception or any other string describing furthermore the error 
	 * 			motive, depending on error type. Used by {@link #toString()} to 
	 * 			display detail error in a more user friendly way by the Logger.
	 * @param	message   the detail message. The detail message is saved for
	 * 			later retrieval by the {@link #getMessage()} method. In a specific
	 * 			application exception, it stores the message to be displayed to the
	 * 			end user.
	 * @param	cause the cause (which is saved for later retrieval by the
	 * 			{@link #getCause()} method).  (A <tt>null</tt> value is
	 *			permitted, and indicates that the cause is nonexistent or
	 * 			unknown.)
	 */
	public GboException( String error, String errorType, String message, Throwable cause ) {
		super(message, cause);
		this.error = error;
		this.errorType = errorType;
	}

    /**
     * Returns a short description of this Exception.
     * The result is the concatenation of:
     * <ul>
     * <li> the {@linkplain Class#getName() name} of the class of this object
     * <li> "[ error: " + the error type description
     * <li> " | " + error sub type description if any
     * <li> " ] : " (a colon and a space)
     * <li> the result of invoking this object's {@link #getLocalizedMessage}
     *      method
     * </ul>
     * If {@code getLocalizedMessage} returns {@code null}, then just
     * the class name is returned.
     *
     * @return a string representation of this exception.
     */
	@Override
	public String toString(){

		StringBuilder message = new StringBuilder("\n\t" + this.getClass().getName());
		if ( error != null ) {
			message.append(" [error: "+error);
			if ( errorType != null )
				message.append(" | "+errorType);
			message.append("] ");
		}
		String localizedMessage = this.getLocalizedMessage();

		return (localizedMessage != null) ? (message.append(": " + localizedMessage).toString() ) : message.toString();
	}

	public String getError() {
		return error;
	}

	public String getErrorType() {
		return errorType;
	}

	private static final long serialVersionUID = 1L;
}
