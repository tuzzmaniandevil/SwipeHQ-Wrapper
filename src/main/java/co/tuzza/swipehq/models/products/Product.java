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
import java.math.BigDecimal;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class Product {

    @JsonProperty(value = "product_id", required = false)
    private String product_id;

    @JsonProperty(value = "prod_attribute", required = false)
    private String prod_attribute;

    @JsonProperty(value = "prod_button_code", required = false)
    private String prod_button_code;

    @JsonProperty(value = "prod_button_type", required = false)
    private String prod_button_type;

    @JsonProperty(value = "prod_category", required = false)
    private String prod_category;

    @JsonProperty(value = "prod_accepted_url", required = false)
    private String prod_accepted_url;

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
    private Long prod_minimum_purchase;

    @JsonProperty(value = "prod_name", required = false)
    private String prod_name;

    @JsonProperty(value = "prod_rrp", required = false)
    private BigDecimal prod_rrp;

    @JsonProperty(value = "prod_sale_price", required = false)
    private BigDecimal prod_sale_price;

    @JsonProperty(value = "prod_shipping", required = false)
    private String prod_shipping;

    @JsonProperty(value = "prod_status", required = false)
    private String prod_status;

    @JsonProperty(value = "prod_stock", required = false)
    private Long prod_stock;

    @JsonProperty(value = "prod_stock_enabled", required = false)
    private String prod_stock_enabled;

    @JsonProperty(value = "prod_tnc", required = false)
    private String prod_tnc;

    @JsonProperty(value = "prod_sale_price_aud", required = false)
    private BigDecimal prod_sale_price_aud;

    @JsonProperty(value = "prod_sale_price_cad", required = false)
    private BigDecimal prod_sale_price_cad;

    @JsonProperty(value = "prod_sale_price_cny", required = false)
    private BigDecimal prod_sale_price_cny;

    @JsonProperty(value = "prod_sale_price_eur", required = false)
    private BigDecimal prod_sale_price_eur;

    @JsonProperty(value = "prod_sale_price_gbp", required = false)
    private BigDecimal prod_sale_price_gbp;

    @JsonProperty(value = "prod_sale_price_hkd", required = false)
    private BigDecimal prod_sale_price_hkd;

    @JsonProperty(value = "prod_sale_price_jpy", required = false)
    private BigDecimal prod_sale_price_jpy;

    @JsonProperty(value = "prod_sale_price_krw", required = false)
    private BigDecimal prod_sale_price_krw;

    @JsonProperty(value = "prod_sale_price_nzd", required = false)
    private BigDecimal prod_sale_price_nzd;

    @JsonProperty(value = "prod_sale_price_sgd", required = false)
    private BigDecimal prod_sale_price_sgd;

    @JsonProperty(value = "prod_sale_price_usd", required = false)
    private BigDecimal prod_sale_price_usd;

    @JsonProperty(value = "prod_sale_price_zar", required = false)
    private BigDecimal prod_sale_price_zar;

    public String getProductId() {
        return product_id;
    }

    public String getAttribute() {
        return prod_attribute;
    }

    public String getButtonCode() {
        return prod_button_code;
    }

    public String getButtonType() {
        return prod_button_type;
    }

    public String getCategory() {
        return prod_category;
    }

    public String getAcceptedUrl() {
        return prod_accepted_url;
    }

    public String getDeclinedUrl() {
        return prod_declined_url;
    }

    public String getDescription() {
        return prod_description;
    }

    public String getDetail() {
        return prod_detail;
    }

    public String getFeature() {
        return prod_feature;
    }

    public String getImage() {
        return prod_image;
    }

    public String getKeyword() {
        return prod_keyword;
    }

    public String getLastUpdated() {
        return prod_last_updated;
    }

    public String getMcid() {
        return prod_mcid;
    }

    public Long getMinimumPurchase() {
        return prod_minimum_purchase;
    }

    public String getName() {
        return prod_name;
    }

    public BigDecimal getRecommendedRetailPrice() {
        return prod_rrp;
    }

    public String getShipping() {
        return prod_shipping;
    }

    public String getStatus() {
        return prod_status;
    }

    public Long getStock() {
        return prod_stock;
    }

    public String getStockEnabled() {
        return prod_stock_enabled;
    }

    public String getTnc() {
        return prod_tnc;
    }

    public BigDecimal getSalePrice() {
        return prod_sale_price;
    }

    public BigDecimal getSalePriceAUD() {
        return prod_sale_price_aud;
    }

    public BigDecimal getSalePriceCAD() {
        return prod_sale_price_cad;
    }

    public BigDecimal getSalePriceCNY() {
        return prod_sale_price_cny;
    }

    public BigDecimal getSalePriceEUR() {
        return prod_sale_price_eur;
    }

    public BigDecimal getSalePriceGBP() {
        return prod_sale_price_gbp;
    }

    public BigDecimal getSalePriceHKD() {
        return prod_sale_price_hkd;
    }

    public BigDecimal getSalePriceJPY() {
        return prod_sale_price_jpy;
    }

    public BigDecimal getSalePriceKRW() {
        return prod_sale_price_krw;
    }

    public BigDecimal getSalePriceNZD() {
        return prod_sale_price_nzd;
    }

    public BigDecimal getSalePriceSGD() {
        return prod_sale_price_sgd;
    }

    public BigDecimal getSalePriceUSD() {
        return prod_sale_price_usd;
    }

    public BigDecimal getSalePriceZAR() {
        return prod_sale_price_zar;
    }
}
