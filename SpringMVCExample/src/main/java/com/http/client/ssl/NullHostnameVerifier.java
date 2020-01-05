package com.http.client.ssl;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class NullHostnameVerifier implements HostnameVerifier {
  public boolean verify(String hostname, SSLSession session) {
    return true;
  }
}
