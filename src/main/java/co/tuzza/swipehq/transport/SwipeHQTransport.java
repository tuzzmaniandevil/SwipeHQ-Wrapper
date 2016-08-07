package co.tuzza.swipehq.transport;

import com.fasterxml.jackson.databind.ObjectMapper;
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
 *
 * @author dylan
 */
public class SwipeHQTransport {

    private static final Logger log = LoggerFactory.getLogger(SwipeHQTransport.class);

    private final ObjectMapper mapper = new ObjectMapper();
    private final AsyncHttpClient client;

    public SwipeHQTransport() {
        client = new AsyncHttpClient(new AsyncHttpClientConfig.Builder().build());
    }

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
                T o = mapper.readValue(responseBody, c);

                return o;
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

    public <T> T doPost(String url, Map<String, String> params, Class<T> c) throws InterruptedException, ExecutionException, IOException {
        try {
            AsyncHttpClient.BoundRequestBuilder requestBuilder = client.preparePost(url);

            if (params != null && !params.isEmpty()) {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    requestBuilder.addFormParam(entry.getKey(), entry.getValue());
                }
            }

            ListenableFuture<Response> exec = requestBuilder.execute();

            Response resp = exec.get();
            int statusCode = resp.getStatusCode();
            if (statusCode == 200) {
                String responseBody = resp.getResponseBody();
                T o = mapper.readValue(responseBody, c);

                return o;
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
