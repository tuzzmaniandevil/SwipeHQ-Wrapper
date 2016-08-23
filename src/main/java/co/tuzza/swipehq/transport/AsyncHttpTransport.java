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

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.ListenableFuture;
import com.ning.http.client.Response;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * an HttpTransport using AsyncHttpClient. see
 * <a href="https://github.com/AsyncHttpClient/async-http-client">https://github.com/AsyncHttpClient/async-http-client</a>
 *
 * @author Wesley
 */
public class AsyncHttpTransport implements HttpTransport {

    private static final Logger log = LoggerFactory.getLogger(AsyncHttpTransport.class);

    private final AsyncHttpClient client;

    public AsyncHttpTransport() {
        client = new AsyncHttpClient(new AsyncHttpClientConfig.Builder().build());
    }

    @Override
    public <T> T doGet(String url, Map<String, String> params, Class<T> c) throws InterruptedException, ExecutionException, IOException {
        try {
            AsyncHttpClient.BoundRequestBuilder requestBuilder = client.prepareGet(url);

            if (params != null && !params.isEmpty()) {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    requestBuilder.addQueryParam(entry.getKey(), entry.getValue());
                }
            }

            ListenableFuture<Response> exec = requestBuilder.execute();

            Response resp = exec.get();
            int statusCode = resp.getStatusCode();
            if (statusCode == 200) {
                String responseBody = resp.getResponseBody();

                return ResponseParser.parseResponse(responseBody, c);
            } else {
                log.error("Error doing get | Status Code {} | Status Text {}", statusCode, resp.getStatusText());
            }
        } catch (InterruptedException | ExecutionException | IOException ex) {
            log.error("Error doing GET | Msg: {}", ex.getMessage(), ex);
            throw ex;
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (Exception ex) {
                    log.warn("Error closing connection: {}", ex.getMessage(), ex);
                }
            }
        }
        return null;
    }

    @Override
    public <T> T doPost(String url, Map<String, String> params, Class<T> c) throws InterruptedException, ExecutionException, IOException {
        try {
            AsyncHttpClient.BoundRequestBuilder requestBuilder = client.preparePost(url);

            if (params != null && !params.isEmpty()) {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    requestBuilder.addFormParam(entry.getKey(), entry.getValue());
                }
                requestBuilder.addHeader("Content-Type", "application/x-www-form-urlencoded");
            }

            ListenableFuture<Response> exec = requestBuilder.execute();

            Response resp = exec.get();
            int statusCode = resp.getStatusCode();
            if (statusCode == 200) {
                String responseBody = resp.getResponseBody();

                return ResponseParser.parseResponse(responseBody, c);
            } else {
                log.error("Error doing POST | Status Code {} | Status Text {}", statusCode, resp.getStatusText());
            }
        } catch (InterruptedException | ExecutionException | IOException ex) {
            log.error("Error doing POST | Msg: {}", ex.getMessage(), ex);
            throw ex;
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (Exception ex) {
                    log.warn("Error closing connection: {}", ex.getMessage(), ex);
                }
            }
        }
        return null;
    }
}
