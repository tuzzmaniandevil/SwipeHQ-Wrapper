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
package co.tuzza.swipehq;

import co.tuzza.swipehq.models.BaseRequest;
import co.tuzza.swipehq.models.cart.CreateCartRequest;
import co.tuzza.swipehq.models.cart.CreateCartResponse;
import co.tuzza.swipehq.models.subscription.CreateSubscriptionRequest;
import co.tuzza.swipehq.models.subscription.CreateSubscriptionResponse;
import co.tuzza.swipehq.models.transaction.CreateTransactionRequest;
import co.tuzza.swipehq.models.transaction.CreateTransactionResponse;
import co.tuzza.swipehq.models.verifyTransaction.VerifyTransactionRequest;
import co.tuzza.swipehq.models.verifyTransaction.VerifyTransactionResponse;
import co.tuzza.swipehq.transport.AsyncHttpTransport;
import co.tuzza.swipehq.transport.HttpTransport;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class SwipeHQClient {

    private final Map<String, String> params = new LinkedHashMap();
    private final HttpTransport transport;

    public SwipeHQClient(HttpTransport transport, String merchantId, String apiKey) {
        params.put("merchant_id", merchantId);
        params.put("api_key", apiKey);
        this.transport = transport;
    }

    public SwipeHQClient(String merchantId, String apiKey) {
        params.put("merchant_id", merchantId);
        params.put("api_key", apiKey);
        this.transport = new AsyncHttpTransport();
    }

    /**
     * This API is used to create ad-hoc transactions, where you pass in the
     * relevant payment details generated on your system.
     *
     * @param createTransactionRequest
     * @return
     * @throws java.lang.Exception
     */
    public CreateTransactionResponse createTransaction(CreateTransactionRequest createTransactionRequest)
            throws Exception {
        return doRequest(createTransactionRequest, CreateTransactionResponse.class, "POST");
    }

    /**
     * The Verify Transaction API is used to check the status and verify a
     * particular transaction
     *
     * @param verifyTransactionRequest
     * @return
     * @throws java.lang.Exception
     */
    public VerifyTransactionResponse verifyTransaction(VerifyTransactionRequest verifyTransactionRequest)
            throws Exception {
        return doRequest(verifyTransactionRequest, VerifyTransactionResponse.class, "GET");
    }

    /**
     * The Verify Transaction API is used to check the status and verify a
     * particular transaction
     *
     * @param transaction_id
     * @param identifier_id
     * @return
     * @throws java.lang.Exception
     */
    public VerifyTransactionResponse verifyTransaction(String transaction_id, String identifier_id)
            throws Exception {
        VerifyTransactionRequest req = new VerifyTransactionRequest()
                .withIdentifierId(identifier_id)
                .withTransactionId(transaction_id);

        return verifyTransaction(req);
    }

    /**
     * This API is used to create ad-hoc subscriptions, where you pass in the
     * relevant subscription details generated on your system.
     *
     * @param createSubscriptionRequest
     * @return
     * @throws java.lang.Exception
     */
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest createSubscriptionRequest)
            throws Exception {
        return doRequest(createSubscriptionRequest, CreateSubscriptionResponse.class, "POST");
    }

    /**
     * This API is used to create a transaction with multiple products which set
     * up in merchant console, where you pass in the product IDs to create a
     * cart transaction.
     *
     * @param createCartRequest
     * @return
     * @throws Exception
     */
    public CreateCartResponse createCart(CreateCartRequest createCartRequest)
            throws Exception {
        return doRequest(createCartRequest, CreateCartResponse.class, "POST");
    }

    private <T> T doRequest(BaseRequest request, Class<T> responseClass, String type) throws Exception {
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
