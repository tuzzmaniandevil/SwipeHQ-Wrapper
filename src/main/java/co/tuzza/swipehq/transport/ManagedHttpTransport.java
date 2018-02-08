/*
 * Copyright 2016 Tuzza.co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.tuzza.swipehq.transport;

import co.tuzza.swipehq.SwipeHQClient;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;

/**
 * This transport uses an http connection manager instead of opening a new
 * connection for each request.
 *
 * @author Wesley
 */
public class ManagedHttpTransport implements HttpTransport {

    private final int connectionTimeout;
    private final int socketTimeout;
    private final PoolingHttpClientConnectionManager clientConnectionManager;
    private final static Map<String, ManagedHttpTransport> INSTANCES = new HashMap<>();

    /**
     * Gets an instance with the default connection timeout of 5000 and the
     * default socket timeout of 30000
     *
     * @return an instance of ManagedHttpTransport
     */
    public static ManagedHttpTransport getInstance() {
        return getInstance(5000, 30000);
    }

    /**
     * Gets an instance with the values passed in.
     *
     * @param connectionTimeout The connection timeout in milliseconds
     * @param socketTimeout The socket timeout in milliseconds
     * @return an instance of ManagedHttpTransport
     */
    public static ManagedHttpTransport getInstance(int connectionTimeout, int socketTimeout) {
        String key = "ct-" + connectionTimeout + "-st-" + socketTimeout;
        ManagedHttpTransport instance = INSTANCES.get(key);
        if (instance == null) {
            instance = new ManagedHttpTransport(connectionTimeout, socketTimeout);
            INSTANCES.put(key, instance);
        }
        return instance;
    }

    protected ManagedHttpTransport(int connectionTimeout, int socketTimeout) {
        this.connectionTimeout = connectionTimeout;
        this.socketTimeout = socketTimeout;

        this.clientConnectionManager = new PoolingHttpClientConnectionManager();
        this.clientConnectionManager.setDefaultMaxPerRoute(200);
        this.clientConnectionManager.setMaxTotal(200);
    }

    @Override
    public <T> T doGet(String url, Map<String, String> params, Class<T> c) throws Exception {
        URIBuilder uriBuilder = new URIBuilder(url);
        uriBuilder.addParameters(parseParams(params));

        HttpUriRequest method;
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        method = httpGet;

        HttpClient client = getHttpClient();

        HttpResponse httpResponse = client.execute(method);
        String response = new BasicResponseHandler().handleResponse(httpResponse);

        return ResponseParser.parseResponse(response, c);
    }

    @Override
    public <T> T doPost(String url, Map<String, String> params, Class<T> c) throws Exception {
        HttpUriRequest method;
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new UrlEncodedFormEntity(parseParams(params), "UTF-8"));
        method = httpPost;

        HttpClient client = getHttpClient();
        HttpResponse httpResponse = client.execute(method);
        String response = new BasicResponseHandler().handleResponse(httpResponse);

        return ResponseParser.parseResponse(response, c);
    }

    private List<NameValuePair> parseParams(Map<String, String> params) {
        List<NameValuePair> list = new ArrayList<>();

        if (params != null && !params.isEmpty()) {
            params.entrySet().stream().forEach((entry) -> {
                list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            });
        }

        return list;
    }

    private RequestConfig getRequestConfig() {
        RequestConfig.Builder builder = RequestConfig.custom();

        builder.setSocketTimeout(socketTimeout);
        builder.setConnectTimeout(connectionTimeout);

        return builder.build();
    }

    private HttpClient getHttpClient() throws NoSuchAlgorithmException {
        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");

        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        httpClientBuilder.setUserAgent("SwipeHQClient " + SwipeHQClient.VERSION);
        httpClientBuilder.setConnectionManager(clientConnectionManager);
        httpClientBuilder.setDefaultRequestConfig(getRequestConfig());
        httpClientBuilder.setSSLContext(sslContext);

        return httpClientBuilder.build();

    }
}
