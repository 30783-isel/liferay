package com.http.client;


import java.util.Map;
import java.util.TreeMap;
import javax.ws.rs.core.MediaType;

public class HttpService {
  private HttpClient client;
  
  private String baseUrl;
  
  private String path;
  
  private String type;
  
  private MediaType accept;
  
  private Map<String, String> headers;
  
  public HttpClient getClient() {
    return this.client;
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
  
  private HttpService(Builder builder) {
    this.client = builder.client;
    this.baseUrl = builder.baseUrl;
    this.path = builder.path;
    this.type = builder.type;
    this.accept = builder.accept;
    this.headers = builder.headers;
  }
  
  public static class Builder {
    private HttpClient client;
    
    private String baseUrl;
    
    private String path;
    
    private String type;
    
    private MediaType accept;
    
    private Map<String, String> headers = new TreeMap<>();
    
    public Builder(HttpClient client) {
      this.client = client;
      this.baseUrl = client.getBaseUrl();
      this.headers.putAll(client.getHeaders());
    }
    
    public Builder path(String path) {
      this.path = path;
      this.baseUrl += path;
      return this;
    }
    
    public Builder type(String type) {
      this.type = type;
      return this;
    }
    
    public Builder accept(MediaType accept) {
      this.accept = accept;
      return this;
    }
    
    public Builder header(String name, String value) {
      this.headers.put(name, value);
      return this;
    }
    
    public HttpService build() {
      return new HttpService(this);
    }
  }
}
