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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/**
 *
 * @author Wesley
 */
public class BasicHttpTransport implements HttpTransport {

    private final SSLContext sslContext;

    public BasicHttpTransport() throws NoSuchAlgorithmException {
        sslContext = SSLContext.getInstance("TLSv1.2");
    }

    @Override
    public <T> T doGet(String URL, Map<String, String> params, Class<T> c) throws Exception {
        return doRequest(URL, params, c, "GET");
    }

    @Override
    public <T> T doPost(String URL, Map<String, String> params, Class<T> c) throws Exception {
        return doRequest(URL, params, c, "POST");
    }

    private <T> T doRequest(String URL, Map<String, String> params, Class<T> c, String requestMethod) throws Exception {
        URL url = new URL(URL);
        String responseString;
        String outputString = "";

        URLConnection connection = url.openConnection();
        HttpURLConnection httpConn = (HttpURLConnection) connection;
        httpConn.setUseCaches(false);
        httpConn.setRequestMethod(requestMethod);
        httpConn.setDoInput(true);
        httpConn.setDoOutput(true);
        httpConn.setRequestProperty("User-Agent", "SwipeHQClient " + SwipeHQClient.VERSION);

        if (httpConn instanceof HttpsURLConnection) {
            HttpsURLConnection httpsConn = (HttpsURLConnection) httpConn;
            httpsConn.setSSLSocketFactory(sslContext.getSocketFactory());
        }

        OutputStream os = httpConn.getOutputStream();
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(os, "UTF-8"));
        writer.write(getQuery(params));
        writer.flush();
        writer.close();
        os.close();

        InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
        BufferedReader in = new BufferedReader(isr);

        while ((responseString = in.readLine()) != null) {
            outputString = outputString + responseString;
        }

        return ResponseParser.parseResponse(outputString, c);
    }

    private String getQuery(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (first) {
                first = false;
            } else {
                result.append("&");
            }

            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }

        return result.toString();
    }
}
