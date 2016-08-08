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
package co.tuzza.swipehq.models.verifyTransaction;

import co.tuzza.swipehq.models.BaseRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The Verify Transaction API is used to check the status and verify a
 * particular transaction
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class VerifyTransactionRequest implements BaseRequest {

    private final static String URL = "https://api.swipehq.com/verifyTransaction.php";

    private String transaction_id;
    private String identifier_id;

    public String getTransactionId() {
        return transaction_id;
    }

    public void setTransactionId(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public VerifyTransactionRequest withTransactionId(String transaction_id) {
        this.transaction_id = transaction_id;

        return this;
    }

    public String getIdentifierId() {
        return identifier_id;
    }

    public void setIdentifierId(String identifier_id) {
        this.identifier_id = identifier_id;
    }

    public VerifyTransactionRequest withIdentifierId(String identifier_id) {
        this.identifier_id = identifier_id;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new LinkedHashMap();

        BaseRequest.addIfhasValue("transaction_id", transaction_id, params);
        BaseRequest.addIfhasValue("identifier_id", identifier_id, params);

        return params;
    }

    @Override
    public String url() {
        return URL;
    }
}
