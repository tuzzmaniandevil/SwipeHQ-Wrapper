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
package co.tuzza.swipehq.models.lpn;

import co.tuzza.swipehq.fields.Currency;
import co.tuzza.swipehq.fields.CurrencyConverter;
import co.tuzza.swipehq.transport.ResponseParser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.util.Map;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Wesley
 */
public class LivePaymentNotification {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(LivePaymentNotification.class);

    public static LivePaymentNotification parseLpn(Map<String, String> params) {
        LivePaymentNotification lpn = new LivePaymentNotification();

        if (params != null) {
            try {
                ObjectMapper om = new ObjectMapper();
                String json = om.writeValueAsString(params);
                return ResponseParser.parseResponse(json, LivePaymentNotification.class);
            } catch (Exception ex) {
                log.error("Error parsing LivePaymentNotification: {}", ex.getMessage(), ex);
            }
        }

        return lpn;
    }

    @JsonProperty("status")
    private String status;

    @JsonProperty("identifier_id")
    private String identifier_id;

    @JsonProperty("transaction_id")
    private String transaction_id;

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("name_on_card")
    private String name_on_card;

    @JsonProperty("customer_email")
    private String customer_email;

    @JsonProperty("currency")
    @JsonDeserialize(converter = CurrencyConverter.class)
    private Currency currency;

    @JsonProperty("td_user_data")
    private String td_user_data;

    @JsonProperty("token")
    private String token;

    public String getStatus() {
        return status;
    }

    public String getIdentifierId() {
        return identifier_id;
    }

    public String getTransactionId() {
        return transaction_id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getNameOnCard() {
        return name_on_card;
    }

    public String getCustomerEmail() {
        return customer_email;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getUserData() {
        return td_user_data;
    }

    public String getToken() {
        return token;
    }
}
