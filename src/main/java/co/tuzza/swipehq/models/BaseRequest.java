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
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Wesley
 */
public interface BaseRequest {

    public static void addIfhasValue(String key, String value, Map<String, String> params) {
        if (StringUtils.isNotBlank(value)) {
            params.put(key, value);
        }
    }

    public static void addIfhasValue(String key, Currency value, Map<String, String> params) {
        if (value != null) {
            params.put(key, value.getSymbol());
        }
    }

    public static void addIfhasValue(String key, Country value, Map<String, String> params) {
        if (value != null) {
            params.put(key, value.getName());
        }
    }

    public static void addIfhasValue(String key, AmountType value, Map<String, String> params) {
        if (value != null) {
            params.put(key, value.getName());
        }
    }

    public static void addIfhasValue(String key, BigDecimal value, Map<String, String> params) {
        if (value != null) {
            params.put(key, value.toString());
        }
    }

    public static void addIfhasValue(String key, Long value, Map<String, String> params) {
        if (value != null) {
            params.put(key, value.toString());
        }
    }

    public Map<String, String> toParams();

    public String url();
}
