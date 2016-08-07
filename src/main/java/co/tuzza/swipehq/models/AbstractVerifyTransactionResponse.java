package co.tuzza.swipehq.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author dylan
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
