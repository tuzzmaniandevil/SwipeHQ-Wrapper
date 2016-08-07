package co.tuzza.swipehq;

import co.tuzza.swipehq.models.BaseRequest;
import co.tuzza.swipehq.models.CreateTransactionRequest;
import co.tuzza.swipehq.models.CreateTransactionResponse;
import co.tuzza.swipehq.models.VerifyTransactionRequest;
import co.tuzza.swipehq.models.VerifyTransactionResponse;
import co.tuzza.swipehq.transport.SwipeHQTransport;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author dylan
 */
public class SwipeHQClient {

    private final Map<String, String> params = new LinkedHashMap();
    private final SwipeHQTransport transport;

    public SwipeHQClient(String merchantId, String apiKey) {
        params.put("merchant_id", merchantId);
        params.put("api_key", apiKey);
        this.transport = new SwipeHQTransport();
    }

    /**
     * This API is used to create ad-hoc transactions, where you pass in the
     * relevant payment details generated on your system.
     *
     * @param createTransactionRequest
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws IOException
     */
    public CreateTransactionResponse createTransaction(CreateTransactionRequest createTransactionRequest)
            throws InterruptedException, ExecutionException, IOException {
        return doRequest(createTransactionRequest, CreateTransactionResponse.class, "POST");
    }

    /**
     * The Verify Transaction API is used to check the status and verify a
     * particular transaction
     *
     * @param verifyTransactionRequest
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws IOException
     */
    public VerifyTransactionResponse verifyTransaction(VerifyTransactionRequest verifyTransactionRequest)
            throws InterruptedException, ExecutionException, IOException {
        return doRequest(verifyTransactionRequest, VerifyTransactionResponse.class, "GET");
    }

    private <T> T doRequest(BaseRequest request, Class<T> responseClass, String type) throws InterruptedException, ExecutionException, IOException {
        Map<String, String> reqParams = new LinkedHashMap();
        reqParams.putAll(params);

        Map<String, String> toParams = request.toParams();
        if (toParams != null) {
            reqParams.putAll(toParams);
        }

        if ("POST".equalsIgnoreCase(type)) {
            return transport.doPost(request.url(), params, responseClass);
        } else if ("GET".equalsIgnoreCase(type)) {
            return transport.doGet(request.url(), params, responseClass);
        }
        return null;
    }
}
