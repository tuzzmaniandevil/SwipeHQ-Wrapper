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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class LivePaymentNotificationTest {

    public LivePaymentNotificationTest() {
    }

    /**
     * Test of parseLpn method, of class LivePaymentNotification.
     */
    @Test
    public void testParseLpn() {
        Map<String, String> params = new HashMap<>();
        params.put("status", "accepted");
        params.put("identifier_id", "12345");
        params.put("transaction_id", "67890");
        params.put("amount", "20.5");
        params.put("name_on_card", "Peter Simon");
        params.put("customer_email", "peter@simon.com");
        params.put("currency", "NZD");
        params.put("td_user_data", "some_data");
        params.put("token", "some_token");

        LivePaymentNotification lpn = LivePaymentNotification.parseLpn(params);

        Assert.assertEquals("accepted", lpn.getStatus());
        Assert.assertEquals("12345", lpn.getIdentifierId());
        Assert.assertEquals("67890", lpn.getTransactionId());
        Assert.assertEquals(BigDecimal.valueOf(20.5), lpn.getAmount());
        Assert.assertEquals("Peter Simon", lpn.getNameOnCard());
        Assert.assertEquals("peter@simon.com", lpn.getCustomerEmail());
        Assert.assertEquals("some_data", lpn.getUserData());
        Assert.assertEquals("some_token", lpn.getToken());
        Assert.assertEquals(Currency.NewZealandDollars, lpn.getCurrency());
    }

    @Test
    public void testParseLpn2() {
        Map<String, String> params = new HashMap<>();
        params.put("status", "accepted");
        params.put("identifier_id", "12345");
        params.put("transaction_id", "67890");
        params.put("amount", "0.1");
        params.put("name_on_card", "Peter Simon");
        params.put("customer_email", "peter@simon.com");
        params.put("currency", "AUD");
        params.put("td_user_data", "some_data");
        params.put("token", "some_token");

        LivePaymentNotification lpn = LivePaymentNotification.parseLpn(params);

        Assert.assertEquals("accepted", lpn.getStatus());
        Assert.assertEquals("12345", lpn.getIdentifierId());
        Assert.assertEquals("67890", lpn.getTransactionId());
        Assert.assertEquals(BigDecimal.valueOf(0.1), lpn.getAmount());
        Assert.assertEquals("Peter Simon", lpn.getNameOnCard());
        Assert.assertEquals("peter@simon.com", lpn.getCustomerEmail());
        Assert.assertEquals("some_data", lpn.getUserData());
        Assert.assertEquals("some_token", lpn.getToken());
        Assert.assertEquals(Currency.AustralianDollars, lpn.getCurrency());
    }

    @Test
    public void testParseLpn3() {
        Map<String, String> params = new HashMap<>();
        params.put("status", "declined");
        params.put("identifier_id", "12345");
        params.put("transaction_id", "67890");
        params.put("amount", null);
        params.put("name_on_card", "Peter Simon");
        params.put("customer_email", "peter@simon.com");
        params.put("currency", null);
        params.put("td_user_data", "some_data");
        params.put("token", null);

        LivePaymentNotification lpn = LivePaymentNotification.parseLpn(params);

        Assert.assertEquals("declined", lpn.getStatus());
        Assert.assertEquals("12345", lpn.getIdentifierId());
        Assert.assertEquals("67890", lpn.getTransactionId());
        Assert.assertNull(lpn.getAmount());
        Assert.assertEquals("Peter Simon", lpn.getNameOnCard());
        Assert.assertEquals("peter@simon.com", lpn.getCustomerEmail());
        Assert.assertEquals("some_data", lpn.getUserData());
        Assert.assertNull(lpn.getToken());
        Assert.assertNull(lpn.getCurrency());
    }
}
