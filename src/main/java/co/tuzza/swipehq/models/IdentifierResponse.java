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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Wesley
 */
public class IdentifierResponse {

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
