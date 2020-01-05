package com.http.client;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.IOException;
import java.util.Map;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.codehaus.jackson.map.ObjectMapper;

public class HttpRequest extends HttpBaseRequest {
  public HttpResponse get() {
    return new HttpResponse((ClientResponse)webResourceBuilder().get(ClientResponse.class));
  }
  
  public HttpResponse post(Object requestEntity) {
    String input = "";
    ObjectMapper mapper = new ObjectMapper();
    try {
      input = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestEntity);
    } catch (IOException iOException) {}
    return new HttpResponse((ClientResponse)webResourceBuilder().post(ClientResponse.class, input));
  }
  
  public HttpResponse put(Object requestEntity) {
    String input = new String();
    ObjectMapper mapper = new ObjectMapper();
    try {
      input = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestEntity);
    } catch (IOException iOException) {}
    return new HttpResponse((ClientResponse)webResourceBuilder().put(ClientResponse.class, input));
  }
  
  public HttpResponse delete() {
    return new HttpResponse((ClientResponse)webResourceBuilder().delete(ClientResponse.class));
  }
  
  public HttpResponse delete(Object requestEntity) {
    String input = new String();
    ObjectMapper mapper = new ObjectMapper();
    try {
      input = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestEntity);
    } catch (IOException iOException) {}
    return new HttpResponse((ClientResponse)webResourceBuilder().delete(ClientResponse.class, input));
  }
  
  public HttpResponse patch(Object requestEntity) {
    String input = new String();
    ObjectMapper mapper = new ObjectMapper();
    try {
      input = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestEntity);
    } catch (IOException iOException) {}
    return new HttpResponse((ClientResponse)webResourceBuilder().method("PATCH", ClientResponse.class, input));
  }
  
  private WebResource.Builder webResourceBuilder() {
    UriBuilder uriBuilder = UriBuilder.fromPath(getBaseUrl());
    uriBuilder = addQueryParameters(uriBuilder, getQueryParameters());
    WebResource resource = getService().getClient().getClient().resource(uriBuilder.buildFromMap(getPathParameters()));
    WebResource.Builder resourceBuilder = resource.getRequestBuilder();
    if (getAccept() != null)
      resourceBuilder.accept(new MediaType[] { getAccept() }); 
    if (getType() != null)
      resourceBuilder.type(getType()); 
    addHeaders(resourceBuilder, getHeaders());
    return resourceBuilder;
  }
  
  private WebResource.Builder addHeaders(WebResource.Builder resourceBuilder, Map<String, String> headers) {
    for (Map.Entry<String, String> header : headers.entrySet())
      resourceBuilder.header(header.getKey(), header.getValue()); 
    return resourceBuilder;
  }
  
  private UriBuilder addQueryParameters(UriBuilder uriBuilder, Map<String, String> queryParameters) {
    for (Map.Entry<String, String> parameter : queryParameters.entrySet()) {
      uriBuilder.replaceQueryParam(parameter.getKey(), new Object[] { parameter.getValue() });
    } 
    return uriBuilder;
  }
  
  protected HttpRequest(Builder builder) {
    super(builder);
  }
  
  public static class Builder extends HttpBaseRequest.Builder<Builder> {
    public Builder(HttpService service) {
      super(service);
    }
    
    public HttpRequest build() {
      return new HttpRequest(this);
    }
    
    public Builder getThis() {
      return this;
    }
  }
}
