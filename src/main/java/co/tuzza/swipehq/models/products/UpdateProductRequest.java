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

import co.tuzza.swipehq.models.BaseRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class UpdateProductRequest implements BaseRequest {

    private String product_id;
    private String prod_name;
    private String prod_rrp;
    private String prod_quantity;
    private String prod_sale_price;
    private String prod_description;
    private String prod_minimum_purchase;
    private String prod_sale_price_aud;
    private String prod_sale_price_cad;
    private String prod_sale_price_cny;
    private String prod_sale_price_eur;
    private String prod_sale_price_gbp;
    private String prod_sale_price_hkd;
    private String prod_sale_price_jpy;
    private String prod_sale_price_sgd;
    private String prod_sale_price_zar;
    private String prod_sale_price_krw;
    private String prod_sale_price_usd;
    private String prod_accepted_url;
    private String prod_declined_url;

    /**
     * Product ID (Compulsory)
     *
     * @return
     */
    public String getProductId() {
        return product_id;
    }

    public void setProductId(String product_id) {
        this.product_id = product_id;
    }

    public UpdateProductRequest withProductId(String product_id) {
        this.product_id = product_id;

        return this;
    }

    /**
     * Product name (Optional)
     *
     * @return
     */
    public String getProductName() {
        return prod_name;
    }

    /**
     * Product name (Optional)
     *
     * @param prod_name
     */
    public void setProductName(String prod_name) {
        this.prod_name = prod_name;
    }

    /**
     * Product name (Optional)
     *
     * @param prod_name
     * @return
     */
    public UpdateProductRequest withProductName(String prod_name) {
        this.prod_name = prod_name;

        return this;
    }

    /**
     * Product recommended sale price (Optional)
     *
     * @return
     */
    public String getRecommendedSalePrice() {
        return prod_rrp;
    }

    public void setRecommendedSalePrice(String prod_rrp) {
        this.prod_rrp = prod_rrp;
    }

    public UpdateProductRequest withRecommendedSalePrice(String prod_rrp) {
        this.prod_rrp = prod_rrp;

        return this;
    }

    /**
     * Product quantity (Optional)
     *
     * @return
     */
    public String getQuantity() {
        return prod_quantity;
    }

    /**
     * Product quantity (Optional)
     *
     * @param prod_quantity
     */
    public void setQuantity(String prod_quantity) {
        this.prod_quantity = prod_quantity;
    }

    /**
     * Product quantity (Optional)
     *
     * @param prod_quantity
     * @return
     */
    public UpdateProductRequest withQuantity(String prod_quantity) {
        this.prod_quantity = prod_quantity;

        return this;
    }

    /**
     * Product sale price in New Zealand Dollars (Optional)
     *
     * @return
     */
    public String getSalePrice() {
        return prod_sale_price;
    }

    /**
     * Product sale price in New Zealand Dollars (Optional)
     *
     * @param prod_sale_price
     */
    public void setSalePrice(String prod_sale_price) {
        this.prod_sale_price = prod_sale_price;
    }

    /**
     * Product sale price in New Zealand Dollars (Optional)
     *
     * @param prod_sale_price
     * @return
     */
    public UpdateProductRequest withSalePrice(String prod_sale_price) {
        this.prod_sale_price = prod_sale_price;

        return this;
    }

    /**
     * The minimum number of products that need to be purchased to get it at
     * this price. The default number usually chosen will be one. (Optional)
     *
     * @return
     */
    public String getMinimumPurchase() {
        return prod_minimum_purchase;
    }

    /**
     * The minimum number of products that need to be purchased to get it at
     * this price. The default number usually chosen will be one. (Optional)
     *
     * @param prod_minimum_purchase
     */
    public void setMinimumPurchase(String prod_minimum_purchase) {
        this.prod_minimum_purchase = prod_minimum_purchase;
    }

    /**
     * The minimum number of products that need to be purchased to get it at
     * this price. The default number usually chosen will be one. (Optional)
     *
     * @param prod_minimum_purchase
     * @return
     */
    public UpdateProductRequest withMinimumPurchase(String prod_minimum_purchase) {
        this.prod_minimum_purchase = prod_minimum_purchase;

        return this;
    }

    /**
     * Product subscription (Optional)
     *
     * @return
     */
    public String getDescription() {
        return prod_description;
    }

    /**
     * Product subscription (Optional)
     *
     * @param prod_description
     */
    public void setDescription(String prod_description) {
        this.prod_description = prod_description;
    }

    /**
     * Product subscription (Optional)
     *
     * @param prod_description
     * @return
     */
    public UpdateProductRequest withDescription(String prod_description) {
        this.prod_description = prod_description;

        return this;
    }

    /**
     * Product sale price in AUD (Optional)
     *
     * @return
     */
    public String getSalePriceAUD() {
        return prod_sale_price_aud;
    }

    /**
     * Product sale price in AUD (Optional)
     *
     * @param prod_sale_price_aud
     */
    public void setSalePriceAUD(String prod_sale_price_aud) {
        this.prod_sale_price_aud = prod_sale_price_aud;
    }

    /**
     * Product sale price in AUD (Optional)
     *
     * @param prod_sale_price_aud
     * @return
     */
    public UpdateProductRequest withSalePriceAUD(String prod_sale_price_aud) {
        this.prod_sale_price_aud = prod_sale_price_aud;

        return this;
    }

    /**
     * Product sale price in CAD (Optional)
     *
     * @return
     */
    public String getSalePriceCAD() {
        return prod_sale_price_cad;
    }

    /**
     * Product sale price in CAD (Optional)
     *
     * @param prod_sale_price_cad
     */
    public void setSalePriceCAD(String prod_sale_price_cad) {
        this.prod_sale_price_cad = prod_sale_price_cad;
    }

    /**
     * Product sale price in CAD (Optional)
     *
     * @param prod_sale_price_cad
     * @return
     */
    public UpdateProductRequest withSalePriceCAD(String prod_sale_price_cad) {
        this.prod_sale_price_cad = prod_sale_price_cad;

        return this;
    }

    /**
     * Product sale price in CNY (Optional)
     *
     * @return
     */
    public String getSalePriceCNY() {
        return prod_sale_price_cny;
    }

    /**
     * Product sale price in CNY (Optional)
     *
     * @param prod_sale_price_cny
     */
    public void setSalePriceCNY(String prod_sale_price_cny) {
        this.prod_sale_price_cny = prod_sale_price_cny;
    }

    /**
     * Product sale price in CNY (Optional)
     *
     * @param prod_sale_price_cny
     * @return
     */
    public UpdateProductRequest withSalePriceCNY(String prod_sale_price_cny) {
        this.prod_sale_price_cny = prod_sale_price_cny;

        return this;
    }

    /**
     * Product sale price in EUR (Optional)
     *
     * @return
     */
    public String getSalePriceEUR() {
        return prod_sale_price_eur;
    }

    /**
     * Product sale price in EUR (Optional)
     *
     * @param prod_sale_price_eur
     */
    public void setSalePriceEUR(String prod_sale_price_eur) {
        this.prod_sale_price_eur = prod_sale_price_eur;
    }

    /**
     * Product sale price in EUR (Optional)
     *
     * @param prod_sale_price_eur
     * @return
     */
    public UpdateProductRequest withSalePriceEUR(String prod_sale_price_eur) {
        this.prod_sale_price_eur = prod_sale_price_eur;

        return this;
    }

    /**
     * Product sale price in GBP (Optional)
     *
     * @return
     */
    public String getSalePriceGBP() {
        return prod_sale_price_gbp;
    }

    /**
     * Product sale price in GBP (Optional)
     *
     * @param prod_sale_price_gbp
     */
    public void setSalePriceGBP(String prod_sale_price_gbp) {
        this.prod_sale_price_gbp = prod_sale_price_gbp;
    }

    /**
     * Product sale price in GBP (Optional)
     *
     * @param prod_sale_price_gbp
     * @return
     */
    public UpdateProductRequest withSalePriceGBP(String prod_sale_price_gbp) {
        this.prod_sale_price_gbp = prod_sale_price_gbp;

        return this;
    }

    /**
     * Product sale price in HKD (Optional)
     *
     * @return
     */
    public String getSalePriceHKD() {
        return prod_sale_price_hkd;
    }

    /**
     * Product sale price in HKD (Optional)
     *
     * @param prod_sale_price_hkd
     */
    public void setSalePriceHKD(String prod_sale_price_hkd) {
        this.prod_sale_price_hkd = prod_sale_price_hkd;
    }

    /**
     * Product sale price in HKD (Optional)
     *
     * @param prod_sale_price_hkd
     * @return
     */
    public UpdateProductRequest withSalePriceHKD(String prod_sale_price_hkd) {
        this.prod_sale_price_hkd = prod_sale_price_hkd;

        return this;
    }

    /**
     * Product sale price in JPY (Optional)
     *
     * @return
     */
    public String getSalePriceJPY() {
        return prod_sale_price_jpy;
    }

    /**
     * Product sale price in JPY (Optional)
     *
     * @param prod_sale_price_jpy
     */
    public void setSalePriceJPY(String prod_sale_price_jpy) {
        this.prod_sale_price_jpy = prod_sale_price_jpy;
    }

    /**
     * Product sale price in JPY (Optional)
     *
     * @param prod_sale_price_jpy
     * @return
     */
    public UpdateProductRequest withSalePriceJPY(String prod_sale_price_jpy) {
        this.prod_sale_price_jpy = prod_sale_price_jpy;

        return this;
    }

    /**
     * Product sale price in SGD (Optional)
     *
     * @return
     */
    public String getSalePriceSGD() {
        return prod_sale_price_sgd;
    }

    /**
     * Product sale price in SGD (Optional)
     *
     * @param prod_sale_price_sgd
     */
    public void setSalePriceSGD(String prod_sale_price_sgd) {
        this.prod_sale_price_sgd = prod_sale_price_sgd;
    }

    /**
     * Product sale price in SGD (Optional)
     *
     * @param prod_sale_price_sgd
     * @return
     */
    public UpdateProductRequest withSalePriceSGD(String prod_sale_price_sgd) {
        this.prod_sale_price_sgd = prod_sale_price_sgd;

        return this;
    }

    /**
     * Product sale price in ZAR (Optional)
     *
     * @return
     */
    public String getSalePriceZAR() {
        return prod_sale_price_zar;
    }

    /**
     * Product sale price in ZAR (Optional)
     *
     * @param prod_sale_price_zar
     */
    public void setSalePriceZAR(String prod_sale_price_zar) {
        this.prod_sale_price_zar = prod_sale_price_zar;
    }

    /**
     * Product sale price in ZAR (Optional)
     *
     * @param prod_sale_price_zar
     * @return
     */
    public UpdateProductRequest withSalePriceZAR(String prod_sale_price_zar) {
        this.prod_sale_price_zar = prod_sale_price_zar;

        return this;
    }

    /**
     * Product sale price in KRW (Optional)
     *
     * @return
     */
    public String getSalePriceKRW() {
        return prod_sale_price_krw;
    }

    /**
     * Product sale price in KRW (Optional)
     *
     * @param prod_sale_price_krw
     */
    public void setSalePriceKRW(String prod_sale_price_krw) {
        this.prod_sale_price_krw = prod_sale_price_krw;
    }

    /**
     * Product sale price in KRW (Optional)
     *
     * @param prod_sale_price_krw
     * @return
     */
    public UpdateProductRequest withSalePriceKRW(String prod_sale_price_krw) {
        this.prod_sale_price_krw = prod_sale_price_krw;

        return this;
    }

    /**
     * Product sale price in USD (Optional)
     *
     * @return
     */
    public String getSalePriceUSD() {
        return prod_sale_price_usd;
    }

    /**
     * Product sale price in USD (Optional)
     *
     * @param prod_sale_price_usd
     */
    public void setSalePriceUSD(String prod_sale_price_usd) {
        this.prod_sale_price_usd = prod_sale_price_usd;
    }

    /**
     * Product sale price in USD (Optional)
     *
     * @param prod_sale_price_usd
     * @return
     */
    public UpdateProductRequest withSalePriceUSD(String prod_sale_price_usd) {
        this.prod_sale_price_usd = prod_sale_price_usd;

        return this;
    }

    /**
     * A URL to redirect to after a customer has made a successful payment
     * (Optional)
     *
     * @return
     */
    public String getAcceptedUrl() {
        return prod_accepted_url;
    }

    /**
     * A URL to redirect to after a customer has made a successful payment
     * (Optional)
     *
     * @param prod_accepted_url
     */
    public void setAcceptedUrl(String prod_accepted_url) {
        this.prod_accepted_url = prod_accepted_url;
    }

    /**
     * A URL to redirect to after a customer has made a successful payment
     * (Optional)
     *
     * @param prod_accepted_url
     * @return
     */
    public UpdateProductRequest withAcceptedUrl(String prod_accepted_url) {
        this.prod_accepted_url = prod_accepted_url;

        return this;
    }

    /**
     * A URL to redirect to after a customer has made a unsuccessful payment
     * (Optional)
     *
     * @return
     */
    public String getDeclinedUrl() {
        return prod_declined_url;
    }

    /**
     * A URL to redirect to after a customer has made a unsuccessful payment
     * (Optional)
     *
     * @param prod_declined_url
     */
    public void setDeclinedUrl(String prod_declined_url) {
        this.prod_declined_url = prod_declined_url;
    }

    /**
     * A URL to redirect to after a customer has made a unsuccessful payment
     * (Optional)
     *
     * @param prod_declined_url
     * @return
     */
    public UpdateProductRequest withDeclinedUrl(String prod_declined_url) {
        this.prod_declined_url = prod_declined_url;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new LinkedHashMap();

        BaseRequest.addIfhasValue("product_id", product_id, params);
        BaseRequest.addIfhasValue("prod_name", prod_name, params);
        BaseRequest.addIfhasValue("prod_rrp", prod_rrp, params);
        BaseRequest.addIfhasValue("prod_quantity", prod_quantity, params);
        BaseRequest.addIfhasValue("prod_sale_price", prod_sale_price, params);
        BaseRequest.addIfhasValue("prod_minimum_purchase", prod_minimum_purchase, params);
        BaseRequest.addIfhasValue("prod_description", prod_description, params);
        BaseRequest.addIfhasValue("prod_sale_price_aud", prod_sale_price_aud, params);
        BaseRequest.addIfhasValue("prod_sale_price_cad", prod_sale_price_cad, params);
        BaseRequest.addIfhasValue("prod_sale_price_cny", prod_sale_price_cny, params);
        BaseRequest.addIfhasValue("prod_sale_price_eur", prod_sale_price_eur, params);
        BaseRequest.addIfhasValue("prod_sale_price_gbp", prod_sale_price_gbp, params);
        BaseRequest.addIfhasValue("prod_sale_price_hkd", prod_sale_price_hkd, params);
        BaseRequest.addIfhasValue("prod_sale_price_jpy", prod_sale_price_jpy, params);
        BaseRequest.addIfhasValue("prod_sale_price_sgd", prod_sale_price_sgd, params);
        BaseRequest.addIfhasValue("prod_sale_price_zar", prod_sale_price_zar, params);
        BaseRequest.addIfhasValue("prod_sale_price_krw", prod_sale_price_krw, params);
        BaseRequest.addIfhasValue("prod_sale_price_usd", prod_sale_price_usd, params);
        BaseRequest.addIfhasValue("prod_accepted_url", prod_accepted_url, params);
        BaseRequest.addIfhasValue("prod_declined_url", prod_declined_url, params);

        return params;
    }

    @Override
    public String url() {
        return "https://api.swipehq.com/updateProduct.php";
    }

}
