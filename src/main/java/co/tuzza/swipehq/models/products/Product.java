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
package co.tuzza.swipehq.models.products;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class Product {

    @JsonProperty(value = "prod_accepted_url", required = false)
    private String prod_accepted_url;

    @JsonProperty(value = "prod_attribute", required = false)
    private String prod_attribute;

    @JsonProperty(value = "prod_button_code", required = false)
    private String prod_button_code;

    @JsonProperty(value = "prod_button_type", required = false)
    private String prod_button_type;

    @JsonProperty(value = "prod_category", required = false)
    private String prod_category;

    @JsonProperty(value = "prod_declined_url", required = false)
    private String prod_declined_url;

    @JsonProperty(value = "prod_description", required = false)
    private String prod_description;

    @JsonProperty(value = "prod_detail", required = false)
    private String prod_detail;

    @JsonProperty(value = "prod_feature", required = false)
    private String prod_feature;

    @JsonProperty(value = "prod_image", required = false)
    private String prod_image;

    @JsonProperty(value = "prod_keyword", required = false)
    private String prod_keyword;

    @JsonProperty(value = "prod_last_updated", required = false)
    private String prod_last_updated;

    @JsonProperty(value = "prod_mcid", required = false)
    private String prod_mcid;

    @JsonProperty(value = "prod_minimum_purchase", required = false)
    private String prod_minimum_purchase;

    @JsonProperty(value = "prod_name", required = false)
    private String prod_name;

    @JsonProperty(value = "prod_rrp", required = false)
    private String prod_rrp;

    @JsonProperty(value = "prod_sale_price", required = false)
    private String prod_sale_price;

    @JsonProperty(value = "prod_shipping", required = false)
    private String prod_shipping;

    @JsonProperty(value = "prod_status", required = false)
    private String prod_status;

    @JsonProperty(value = "prod_stock", required = false)
    private String prod_stock;

    @JsonProperty(value = "prod_stock_enabled", required = false)
    private String prod_stock_enabled;

    @JsonProperty(value = "prod_tnc", required = false)
    private String prod_tnc;

    @JsonProperty(value = "product_id", required = false)
    private String product_id;
}
