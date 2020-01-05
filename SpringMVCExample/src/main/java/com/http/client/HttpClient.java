package com.http.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.http.client.ssl.NullHostnameVerifier;
import com.http.client.ssl.SavingTrustManager;
import com.http.exceptions.SSLException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;


public class HttpClient {
  private static HttpClient instance;
  
  private Client client;
  
  private String baseUrl;
  
  private Map<String, String> headers;
  
  public static synchronized HttpClient getInstance() {
    return instance;
  }
  
  public static synchronized HttpClient getInstance(HttpClient client) {
    return instance = client;
  }
  
  public Client getClient() {
    return this.client;
  }
  
  public String getBaseUrl() {
    return this.baseUrl;
  }
  
  public Map<String, String> getHeaders() {
    return this.headers;
  }
  
  private HttpClient(Builder builder) {
    this.client = builder.client;
    this.baseUrl = builder.baseUrl;
    this.headers = builder.headers;
  }
  
  public static class Builder {
    private Client client;
    
    private String baseUrl;
    
    private String keystoreFile;
    
    private String keyStorePass;
    
    private SSLContext sslContext;
    
    private KeyStore ks;
    
    protected SavingTrustManager tm;
    
    private Map<String, String> headers = new TreeMap<>();
    
    public Builder(String baseUrl) {
      this.baseUrl = baseUrl;
    }
    
    public Builder client(Client client) {
      this.client = client;
      return this;
    }
    
    public Builder header(String name, String value) {
      this.headers.put(name, value);
      return this;
    }
    
    public String getKeystoreFile() {
      return this.keystoreFile;
    }
    
    public void setKeystoreFile(String keystoreFile) {
      this.keystoreFile = keystoreFile;
    }
    
    public String getKeyStorePass() {
      return this.keyStorePass;
    }
    
    public void setKeyStorePass(String keyStorePass) {
      this.keyStorePass = keyStorePass;
    }
    
    public HttpClient build() throws SSLException {
      if (this.client == null)
        this.client = createClient(); 
      return new HttpClient(this);
    }
    
    private Client createClient() throws SSLException {
      DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
      defaultClientConfig.getClasses().add(JacksonJsonProvider.class);
      if (this.baseUrl.toLowerCase().startsWith("https"))
        try {
          initSSL((ClientConfig)defaultClientConfig);
        } catch (SSLException ex) {
          throw ex;
        }  
      return Client.create((ClientConfig)defaultClientConfig);
    }
    
    private void initSSL(ClientConfig config) throws SSLException {
      try {
        this.sslContext = SSLContext.getInstance("SSL");
        this.tm = createTrustManager();
        this.sslContext.init(null, new TrustManager[] { (TrustManager)this.tm }, null);
        config.getProperties().put("com.sun.jersey.client.impl.urlconnection.httpsProperties", new HTTPSProperties(createHostnameVerifier(), this.sslContext));
        SSLSocketFactory factory = this.sslContext.getSocketFactory();
        URL url = new URL(this.baseUrl);
        String host = url.getHost();
        int port = url.getPort();
        SSLSocket socket = (SSLSocket)factory.createSocket(host, port);
        socket.setSoTimeout(10000);
        socket.startHandshake();
        socket.close();
      } catch (NoSuchAlgorithmException e) {
        throw new SSLException("ERROR", "ERROR_SSL_INSTANCE", "Unnable to get a SSL instance.");
      } catch (KeyManagementException e) {
        throw new SSLException("ERROR", "ERROR_SSL_CONTEXT", "Unnable to init the SSL context.");
      } catch (UnknownHostException e) {
        throw new SSLException("ERROR", "ERROR_CONN_HOST", "Unknown Host");
      } catch (MalformedURLException e) {
        throw new SSLException("ERROR", "ERROR_CONN_URL", "Malformed URL.");
      } catch (IOException e) {
        throw new SSLException("ERROR", "ERROR_CONN_INIT", "Unnable to init the connection to server.");
      } 
    }
    
    private SavingTrustManager createTrustManager() throws SSLException {
      InputStream in = null;
      SavingTrustManager tm = null;
      try {
        in = new FileInputStream(this.keystoreFile);
      } catch (Exception e) {
        throw new SSLException("ERROR", "ERROR_KS_OPEN", "Unnable to open certificates keystore.");
      } 
      try {
        this.ks = KeyStore.getInstance(KeyStore.getDefaultType());
        this.ks.load(in, this.keyStorePass.toCharArray());
        in.close();
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(this.ks);
        X509TrustManager defaultTrustManager = (X509TrustManager)tmf.getTrustManagers()[0];
        tm = new SavingTrustManager(defaultTrustManager);
      } catch (KeyStoreException e) {
        if (in != null)
          try {
            in.close();
          } catch (IOException iOException) {} 
        throw new SSLException("ERROR", "ERROR_KS_INSTANCE", "Unnable to get a keystore instance.");
      } catch (NoSuchAlgorithmException|CertificateException|IOException e) {
        throw new SSLException("ERROR", "ERROR_KS_OPEN", "Unnable to load the keystore.");
      } 
      try {
        in.close();
      } catch (IOException iOException) {}
      return tm;
    }
    
    private HostnameVerifier createHostnameVerifier() {
      return (HostnameVerifier)new NullHostnameVerifier();
    }
    
    private void installCertificates() throws Exception {
      System.out.println("START - Install certificates...");
      URL url = new URL(this.baseUrl);
      String host = url.getHost();
      X509Certificate[] chain = null;
      try {
        chain = this.tm.getChain();
      } catch (Exception ex) {
        System.out.println("error getting the chain certificate");
      } 
      if (chain == null)
        throw new Exception("Could not obtain server certificate chain."); 
      System.out.println("the server chain certificate have " + chain.length + " elements.");
      System.out.println("openning keystore file " + this.keystoreFile + " to write.");
      OutputStream out = new FileOutputStream(this.keystoreFile);
      for (int i = 0; i < chain.length; i++) {
        X509Certificate cert = chain[i];
        System.out.println("cert.getIssuerDN().getName(): " + cert.getSubjectDN().getName() + " .");
        StringTokenizer st = new StringTokenizer(cert.getSubjectDN().getName(), ",");
        String alias = "";
        while (st.hasMoreTokens()) {
          String token = st.nextToken();
          if (token.toLowerCase().startsWith("cn="))
            alias = token.trim().substring(token.indexOf("=") + 1).toLowerCase(); 
        } 
        if (alias.equals(""))
          alias = host; 
        int cnt = 0;
        while (this.ks.containsAlias(alias)) {
          alias = host + "-" + (cnt + 1);
          cnt++;
        } 
        System.out.println("Adding certificate to keystore with alias. " + alias);
        this.ks.setCertificateEntry(alias, cert);
        this.ks.store(out, this.keyStorePass.toCharArray());
      } 
      out.close();
      System.out.println("END - Install certificates...");
    }
    
    private void createKeyStore() throws NoSuchAlgorithmException, CertificateException, IOException, KeyStoreException {
      this.ks = KeyStore.getInstance(KeyStore.getDefaultType());
      this.ks.load(null, this.keyStorePass.toCharArray());
      this.ks.store(new FileOutputStream(this.keystoreFile), this.keyStorePass.toCharArray());
    }
  }
}
