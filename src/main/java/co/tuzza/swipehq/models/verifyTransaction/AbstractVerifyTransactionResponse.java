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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class AbstractVerifyTransactionResponse {

    @JsonProperty(value = "transaction_id", required = false)
    private String transaction_id;
    @JsonProperty(value = "status", required = false)
    private String status;
    @JsonProperty(value = "transaction_approved", required = false)
    private String transaction_approved;
    @JsonProperty(value = "transaction_fee", required = false)
    private String transaction_fee;

    /**
     * A unique identifier for this completed transaction (note: this is a NOT
     * the same as identifier_id)
     *
     * @return
     */
    public String getTransactionId() {
        return transaction_id;
    }

    /**
     * This will always be either "accepted" or "declined"
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * This will always be either "yes" or "no"
     *
     * @return
     */
    public String getTransactionApproved() {
        return transaction_approved;
    }

    /**
     * This response field will only appear if the transaction is accepted and
     * will always be either an amount or "Error" or "Not yet available"
     *
     * @return
     */
    public String getTransactionFee() {
        return transaction_fee;
    }
}
