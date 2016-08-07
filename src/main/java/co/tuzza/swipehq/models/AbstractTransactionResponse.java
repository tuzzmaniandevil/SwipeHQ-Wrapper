package co.tuzza.swipehq.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author dylan
 */
public class AbstractTransactionResponse {

    @JsonProperty(value = "identifier", required = false)
    private String identifier;

    /**
     * The 'identifier' is the ID of the transaction identifier now setup in the
     * Swipe Checkout system. When this ID is passed to the Payments page via
     * the 'identifier_id' parameter, the item details will be displayed.
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }
}
