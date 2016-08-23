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
import co.tuzza.swipehq.models.products.CreateProductRequest;
import co.tuzza.swipehq.models.products.CreateProductResponse;
import co.tuzza.swipehq.models.products.FetchProductsRequest;
import co.tuzza.swipehq.models.products.FetchProductsResponse;
import co.tuzza.swipehq.models.products.UpdateProductRequest;
import co.tuzza.swipehq.models.products.UpdateProductResponse;
import co.tuzza.swipehq.models.subscription.CreateSubscriptionRequest;
import co.tuzza.swipehq.models.subscription.CreateSubscriptionResponse;
import co.tuzza.swipehq.models.tokenization.ChargeTokenRequest;
import co.tuzza.swipehq.models.tokenization.ChargeTokenResponse;
import co.tuzza.swipehq.models.tokenization.CreateTokenRequest;
import co.tuzza.swipehq.models.tokenization.CreateTokenResponse;
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
 * @author Wesley
 */
public class SwipeHQClient {

    public static final String VERSION = "1.6";

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

    /**
     * The fetchProducts API returns products from your merchant account.
     *
     * @param fetchProductsRequest
     * @return
     * @throws Exception
     */
    public FetchProductsResponse fetchProducts(FetchProductsRequest fetchProductsRequest)
            throws Exception {
        return doRequest(fetchProductsRequest, FetchProductsResponse.class, "GET");
    }

    /**
     * The CreateProducts API is used to make new products to be avaliable for
     * customers to purchase. After a product has been made it may then be used
     * with the payments page, where the the Product ID is required.
     *
     * @param createProductRequest
     * @return
     * @throws Exception
     */
    public CreateProductResponse createProduct(CreateProductRequest createProductRequest)
            throws Exception {
        return doRequest(createProductRequest, CreateProductResponse.class, "POST");
    }

    /**
     * The UpdateProduct API allows the calling server to update products
     * without the need of going into the merchant console. From here the server
     * may then fetch the new records if required.
     *
     * @param updateProductRequest
     * @return
     * @throws Exception
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest)
            throws Exception {
        return doRequest(updateProductRequest, UpdateProductResponse.class, "POST");
    }

    /**
     * The fetchUpdateCardUrl API is used to return the url of a page that a
     * user can use to update their credit card details. The API authenticates
     * with merchant_id and API key, and loads the subscribers data based off a
     * contract_id that must be passed in.
     *
     * @param fetchProductsRequest
     * @return
     * @throws Exception
     */
    public FetchProductsResponse fetchUpdateCardUrl(FetchProductsRequest fetchProductsRequest)
            throws Exception {
        return doRequest(fetchProductsRequest, FetchProductsResponse.class, "GET");
    }

    /**
     * This API will securely store a credit card and customer details then
     * return a unique token for that card. After creating a token this may then
     * be passed into chargeToken, where the calling server can charge the card
     * one or more times.
     *
     * @param createTokenRequest
     * @return
     * @throws Exception
     */
    public CreateTokenResponse createToken(CreateTokenRequest createTokenRequest)
            throws Exception {
        return doRequest(createTokenRequest, CreateTokenResponse.class, "POST");
    }

    /**
     * This API will take a token generated by the createToken API and charge
     * the associated card. A unique ID and outcome for this transaction is
     * returned as seen below.
     *
     * @param chargeTokenRequest
     * @return
     * @throws Exception
     */
    public ChargeTokenResponse chargeToken(ChargeTokenRequest chargeTokenRequest)
            throws Exception {
        return doRequest(chargeTokenRequest, ChargeTokenResponse.class, "POST");
    }

    private <T> T doRequest(BaseRequest request, Class<T> responseClass, String type) throws Exception {
        Map<String, String> reqParams = new LinkedHashMap();
        reqParams.putAll(params);

        Map<String, String> toParams = request.toParams();
        if (toParams != null) {
            reqParams.putAll(toParams);
        }

        if ("POST".equalsIgnoreCase(type)) {
            return transport.doPost(request.url(), reqParams, responseClass);
        } else if ("GET".equalsIgnoreCase(type)) {
            return transport.doGet(request.url(), reqParams, responseClass);
        }
        return null;
    }
}
