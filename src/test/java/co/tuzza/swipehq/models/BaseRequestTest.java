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
package co.tuzza.swipehq.models;

import co.tuzza.swipehq.fields.AmountType;
import co.tuzza.swipehq.fields.Country;
import co.tuzza.swipehq.fields.Currency;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class BaseRequestTest {

    public BaseRequestTest() {
    }

    /**
     * Test of addIfhasValue method, of class BaseRequest.
     */
    @Test
    public void testAddIfhasValue_3args_1() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("key", "val", params);

        Assert.assertEquals("val", params.get("key"));
    }

    /**
     * Test of addIfhasValue method, of class BaseRequest.
     */
    @Test
    public void testAddIfhasValue_3args_2() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("key", Currency.NewZealandDollars, params);

        Assert.assertEquals("NZD", params.get("key"));
    }

    /**
     * Test of addIfhasValue method, of class BaseRequest.
     */
    @Test
    public void testAddIfhasValue_3args_3() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("key", Country.New_Zealand, params);

        Assert.assertEquals("New Zealand", params.get("key"));
    }

    /**
     * Test of addIfhasValue method, of class BaseRequest.
     */
    @Test
    public void testAddIfhasValue_3args_4() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("key", AmountType.Percent, params);

        Assert.assertEquals("percent", params.get("key"));
    }

    /**
     * Test of addIfhasValue method, of class BaseRequest.
     */
    @Test
    public void testAddIfhasValue_3args_5() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("key", BigDecimal.valueOf(25), params);
        BaseRequest.addIfhasValue("key1", BigDecimal.valueOf(0), params);
        BaseRequest.addIfhasValue("key2", BigDecimal.valueOf(0.5), params);
        BaseRequest.addIfhasValue("key3", BigDecimal.valueOf(100.95), params);

        Assert.assertEquals("25", params.get("key"));
        Assert.assertEquals("0", params.get("key1"));
        Assert.assertEquals("0.5", params.get("key2"));
        Assert.assertEquals("100.95", params.get("key3"));
    }

    /**
     * Test of addIfhasValue method, of class BaseRequest.
     */
    @Test
    public void testAddIfhasValue_3args_6() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("key", 25l, params);
        BaseRequest.addIfhasValue("key1", 0l, params);
        BaseRequest.addIfhasValue("key2", 50l, params);
        BaseRequest.addIfhasValue("key3", 101l, params);

        Assert.assertEquals("25", params.get("key"));
        Assert.assertEquals("0", params.get("key1"));
        Assert.assertEquals("50", params.get("key2"));
        Assert.assertEquals("101", params.get("key3"));
    }

}
