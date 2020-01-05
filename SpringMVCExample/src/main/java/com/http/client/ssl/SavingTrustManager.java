package com.http.client.ssl;


import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class SavingTrustManager implements X509TrustManager {
  private final X509TrustManager tm;
  
  private X509Certificate[] chain;
  
  public SavingTrustManager(X509TrustManager tm) {
    this.tm = tm;
  }
  
  public X509Certificate[] getChain() {
    return this.chain;
  }
  
  public X509TrustManager getTm() {
    return this.tm;
  }
  
  public X509Certificate[] getAcceptedIssuers() {
    return this.tm.getAcceptedIssuers();
  }
  
  public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
    this.tm.checkClientTrusted(chain, authType);
  }
  
  public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
    this.chain = chain;
    this.tm.checkServerTrusted(chain, authType);
  }
}

