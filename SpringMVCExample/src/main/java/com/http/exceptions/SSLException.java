package com.http.exceptions;

public class SSLException extends Exception {
  private static final long serialVersionUID = 5368194079273907590L;
  
  public static final String TYPE_ERROR = "ERROR";
  
  public static final String TYPE_WARNING = "WARNING";
  
  public static final String ERROR_KS_EMPTY = "ERROR_KS_EMPTY";
  
  public static final String ERROR_KS_OPEN = "ERROR_KS_OPEN";
  
  public static final String ERROR_KS_INSTANCE = "ERROR_KS_INSTANCE";
  
  public static final String ERROR_CERT_DONT_EXISTS = "ERROR_CERT_DONT_EXISTS";
  
  public static final String ERROR_SSL_INSTANCE = "ERROR_SSL_INSTANCE";
  
  public static final String ERROR_SSL_CONTEXT = "ERROR_SSL_CONTEXT";
  
  public static final String ERROR_CONN_URL = "ERROR_CONN_URL";
  
  public static final String ERROR_CONN_HOST = "ERROR_CONN_HOST";
  
  public static final String ERROR_CONN_INIT = "ERROR_CONN_INIT";
  
  protected String error;
  
  protected String errorType;
  
  public SSLException(String errorType, String error, String message) {
    super(message);
    this.errorType = errorType;
    this.error = error;
  }
  
  public String getError() {
    return this.error;
  }
  
  public void setError(String error) {
    this.error = error;
  }
  
  public String getErrorType() {
    return this.errorType;
  }
  
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }
}

