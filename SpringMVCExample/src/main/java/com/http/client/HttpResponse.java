package com.http.client;


import com.sun.jersey.api.client.ClientResponse;

public class HttpResponse {
  private ClientResponse response;
  
  public HttpResponse(ClientResponse response) {
    this.response = response;
  }
  
  public Integer getStatus() {
    return Integer.valueOf(this.response.getStatus());
  }
  
  public <T> T getEntity(Class<T> entityType) throws Exception {
    return (T)this.response.getEntity(entityType);
  }
}
