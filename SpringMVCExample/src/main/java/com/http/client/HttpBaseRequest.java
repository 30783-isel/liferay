package com.http.client;

import java.util.Map;
import java.util.TreeMap;
import javax.ws.rs.core.MediaType;

public class HttpBaseRequest {
  private HttpService service;
  
  private String baseUrl;
  
  private String path;
  
  private String type;
  
  private MediaType accept;
  
  private Map<String, String> headers;
  
  private Map<String, String> pathParameters;
  
  private Map<String, String> queryParameters;
  
  protected HttpBaseRequest() {}
  
  public HttpService getService() {
    return this.service;
  }
  
  public String getBaseUrl() {
    return this.baseUrl;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public String getType() {
    return this.type;
  }
  
  public MediaType getAccept() {
    return this.accept;
  }
  
  public Map<String, String> getHeaders() {
    return this.headers;
  }
  
  public Map<String, String> getPathParameters() {
    return this.pathParameters;
  }
  
  public Map<String, String> getQueryParameters() {
    return this.queryParameters;
  }
  
  protected HttpBaseRequest(Builder<?> builder) {
    this.service = builder.service;
    this.baseUrl = builder.baseUrl;
    this.path = builder.path;
    this.type = builder.type;
    this.accept = builder.accept;
    this.headers = builder.headers;
    this.pathParameters = builder.pathParameters;
    this.queryParameters = builder.queryParameters;
  }
  
  public static abstract class Builder<T extends Builder<T>> {
    private HttpService service;
    
    private String baseUrl;
    
    private String path;
    
    private String type;
    
    private MediaType accept;
    
    private Map<String, String> headers = new TreeMap<>();
    
    private Map<String, String> pathParameters = new TreeMap<>();
    
    private Map<String, String> queryParameters = new TreeMap<>();
    
    public Builder(HttpService service) {
      this.service = service;
      this.baseUrl = service.getBaseUrl();
      this.type = service.getType();
      this.accept = service.getAccept();
      this.headers.putAll(service.getHeaders());
    }
    
    public T path(String path) {
      this.path = path;
      this.baseUrl += path;
      return getThis();
    }
    
    public T type(String type) {
      this.type = type;
      return getThis();
    }
    
    public T accept(MediaType accept) {
      this.accept = accept;
      return getThis();
    }
    
    public T header(String name, String value) {
      this.headers.put(name, value);
      return getThis();
    }
    
    public T pathParameter(String name, String value) {
      this.pathParameters.put(name, value);
      return getThis();
    }
    
    public T queryParameter(String name, String value) {
      this.queryParameters.put(name, value);
      return getThis();
    }
    
    public HttpBaseRequest build() {
      return new HttpBaseRequest(this);
    }
    
    public abstract T getThis();
  }
}
