package co.tuzza.swipehq.models;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The Verify Transaction API is used to check the status and verify a
 * particular transaction
 *
 * @author dylan
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
