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
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The CreateProducts API is used to make new products to be avaliable for
 * customers to purchase. After a product has been made it may then be used with
 * the payments page, where the the Product ID is required.
 *
 * @author Wesley
 */
public class CreateProductRequest implements BaseRequest {

    private String prod_name;
    private BigDecimal prod_rrp;
    private Long prod_quantity;
    private BigDecimal prod_sale_price;
    private String prod_description;
    private Long prod_minimum_purchase;
    private BigDecimal prod_sale_price_aud;
    private BigDecimal prod_sale_price_cad;
    private BigDecimal prod_sale_price_cny;
    private BigDecimal prod_sale_price_eur;
    private BigDecimal prod_sale_price_gbp;
    private BigDecimal prod_sale_price_hkd;
    private BigDecimal prod_sale_price_jpy;
    private BigDecimal prod_sale_price_sgd;
    private BigDecimal prod_sale_price_zar;
    private BigDecimal prod_sale_price_krw;
    private BigDecimal prod_sale_price_usd;
    private String prod_accepted_url;
    private String prod_declined_url;

    /**
     * Product name (Compulsory)
     *
     * @return
     */
    public String getProductName() {
        return prod_name;
    }

    /**
     * Product name (Compulsory)
     *
     * @param prod_name
     */
    public void setProductName(String prod_name) {
        this.prod_name = prod_name;
    }

    /**
     * Product name (Compulsory)
     *
     * @param prod_name
     * @return
     */
    public CreateProductRequest withProductName(String prod_name) {
        this.prod_name = prod_name;

        return this;
    }

    /**
     * Product recommended sale price (Compulsory)
     *
     * @return
     */
    public BigDecimal getRecommendedSalePrice() {
        return prod_rrp;
    }

    public void setRecommendedSalePrice(BigDecimal prod_rrp) {
        this.prod_rrp = prod_rrp;
    }

    public CreateProductRequest withRecommendedSalePrice(BigDecimal prod_rrp) {
        this.prod_rrp = prod_rrp;

        return this;
    }

    /**
     * Product quantity (Compulsory)
     *
     * @return
     */
    public Long getQuantity() {
        return prod_quantity;
    }

    /**
     * Product quantity (Compulsory)
     *
     * @param prod_quantity
     */
    public void setQuantity(Long prod_quantity) {
        this.prod_quantity = prod_quantity;
    }

    /**
     * Product quantity (Compulsory)
     *
     * @param prod_quantity
     * @return
     */
    public CreateProductRequest withQuantity(Long prod_quantity) {
        this.prod_quantity = prod_quantity;

        return this;
    }

    /**
     * Product sale price in New Zealand Dollars (Compulsory)
     *
     * @return
     */
    public BigDecimal getSalePrice() {
        return prod_sale_price;
    }

    /**
     * Product sale price in New Zealand Dollars (Compulsory)
     *
     * @param prod_sale_price
     */
    public void setSalePrice(BigDecimal prod_sale_price) {
        this.prod_sale_price = prod_sale_price;
    }

    /**
     * Product sale price in New Zealand Dollars (Compulsory)
     *
     * @param prod_sale_price
     * @return
     */
    public CreateProductRequest withSalePrice(BigDecimal prod_sale_price) {
        this.prod_sale_price = prod_sale_price;

        return this;
    }

    /**
     * The minimum number of products that need to be purchased to get it at
     * this price. The default number usually chosen will be one. (Compulsory)
     *
     * @return
     */
    public Long getMinimumPurchase() {
        return prod_minimum_purchase;
    }

    /**
     * The minimum number of products that need to be purchased to get it at
     * this price. The default number usually chosen will be one. (Compulsory)
     *
     * @param prod_minimum_purchase
     */
    public void setMinimumPurchase(Long prod_minimum_purchase) {
        this.prod_minimum_purchase = prod_minimum_purchase;
    }

    /**
     * The minimum number of products that need to be purchased to get it at
     * this price. The default number usually chosen will be one. (Compulsory)
     *
     * @param prod_minimum_purchase
     * @return
     */
    public CreateProductRequest withMinimumPurchase(Long prod_minimum_purchase) {
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
    public CreateProductRequest withDescription(String prod_description) {
        this.prod_description = prod_description;

        return this;
    }

    /**
     * Product sale price in AUD (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceAUD() {
        return prod_sale_price_aud;
    }

    /**
     * Product sale price in AUD (Optional)
     *
     * @param prod_sale_price_aud
     */
    public void setSalePriceAUD(BigDecimal prod_sale_price_aud) {
        this.prod_sale_price_aud = prod_sale_price_aud;
    }

    /**
     * Product sale price in AUD (Optional)
     *
     * @param prod_sale_price_aud
     * @return
     */
    public CreateProductRequest withSalePriceAUD(BigDecimal prod_sale_price_aud) {
        this.prod_sale_price_aud = prod_sale_price_aud;

        return this;
    }

    /**
     * Product sale price in CAD (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceCAD() {
        return prod_sale_price_cad;
    }

    /**
     * Product sale price in CAD (Optional)
     *
     * @param prod_sale_price_cad
     */
    public void setSalePriceCAD(BigDecimal prod_sale_price_cad) {
        this.prod_sale_price_cad = prod_sale_price_cad;
    }

    /**
     * Product sale price in CAD (Optional)
     *
     * @param prod_sale_price_cad
     * @return
     */
    public CreateProductRequest withSalePriceCAD(BigDecimal prod_sale_price_cad) {
        this.prod_sale_price_cad = prod_sale_price_cad;

        return this;
    }

    /**
     * Product sale price in CNY (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceCNY() {
        return prod_sale_price_cny;
    }

    /**
     * Product sale price in CNY (Optional)
     *
     * @param prod_sale_price_cny
     */
    public void setSalePriceCNY(BigDecimal prod_sale_price_cny) {
        this.prod_sale_price_cny = prod_sale_price_cny;
    }

    /**
     * Product sale price in CNY (Optional)
     *
     * @param prod_sale_price_cny
     * @return
     */
    public CreateProductRequest withSalePriceCNY(BigDecimal prod_sale_price_cny) {
        this.prod_sale_price_cny = prod_sale_price_cny;

        return this;
    }

    /**
     * Product sale price in EUR (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceEUR() {
        return prod_sale_price_eur;
    }

    /**
     * Product sale price in EUR (Optional)
     *
     * @param prod_sale_price_eur
     */
    public void setSalePriceEUR(BigDecimal prod_sale_price_eur) {
        this.prod_sale_price_eur = prod_sale_price_eur;
    }

    /**
     * Product sale price in EUR (Optional)
     *
     * @param prod_sale_price_eur
     * @return
     */
    public CreateProductRequest withSalePriceEUR(BigDecimal prod_sale_price_eur) {
        this.prod_sale_price_eur = prod_sale_price_eur;

        return this;
    }

    /**
     * Product sale price in GBP (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceGBP() {
        return prod_sale_price_gbp;
    }

    /**
     * Product sale price in GBP (Optional)
     *
     * @param prod_sale_price_gbp
     */
    public void setSalePriceGBP(BigDecimal prod_sale_price_gbp) {
        this.prod_sale_price_gbp = prod_sale_price_gbp;
    }

    /**
     * Product sale price in GBP (Optional)
     *
     * @param prod_sale_price_gbp
     * @return
     */
    public CreateProductRequest withSalePriceGBP(BigDecimal prod_sale_price_gbp) {
        this.prod_sale_price_gbp = prod_sale_price_gbp;

        return this;
    }

    /**
     * Product sale price in HKD (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceHKD() {
        return prod_sale_price_hkd;
    }

    /**
     * Product sale price in HKD (Optional)
     *
     * @param prod_sale_price_hkd
     */
    public void setSalePriceHKD(BigDecimal prod_sale_price_hkd) {
        this.prod_sale_price_hkd = prod_sale_price_hkd;
    }

    /**
     * Product sale price in HKD (Optional)
     *
     * @param prod_sale_price_hkd
     * @return
     */
    public CreateProductRequest withSalePriceHKD(BigDecimal prod_sale_price_hkd) {
        this.prod_sale_price_hkd = prod_sale_price_hkd;

        return this;
    }

    /**
     * Product sale price in JPY (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceJPY() {
        return prod_sale_price_jpy;
    }

    /**
     * Product sale price in JPY (Optional)
     *
     * @param prod_sale_price_jpy
     */
    public void setSalePriceJPY(BigDecimal prod_sale_price_jpy) {
        this.prod_sale_price_jpy = prod_sale_price_jpy;
    }

    /**
     * Product sale price in JPY (Optional)
     *
     * @param prod_sale_price_jpy
     * @return
     */
    public CreateProductRequest withSalePriceJPY(BigDecimal prod_sale_price_jpy) {
        this.prod_sale_price_jpy = prod_sale_price_jpy;

        return this;
    }

    /**
     * Product sale price in SGD (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceSGD() {
        return prod_sale_price_sgd;
    }

    /**
     * Product sale price in SGD (Optional)
     *
     * @param prod_sale_price_sgd
     */
    public void setSalePriceSGD(BigDecimal prod_sale_price_sgd) {
        this.prod_sale_price_sgd = prod_sale_price_sgd;
    }

    /**
     * Product sale price in SGD (Optional)
     *
     * @param prod_sale_price_sgd
     * @return
     */
    public CreateProductRequest withSalePriceSGD(BigDecimal prod_sale_price_sgd) {
        this.prod_sale_price_sgd = prod_sale_price_sgd;

        return this;
    }

    /**
     * Product sale price in ZAR (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceZAR() {
        return prod_sale_price_zar;
    }

    /**
     * Product sale price in ZAR (Optional)
     *
     * @param prod_sale_price_zar
     */
    public void setSalePriceZAR(BigDecimal prod_sale_price_zar) {
        this.prod_sale_price_zar = prod_sale_price_zar;
    }

    /**
     * Product sale price in ZAR (Optional)
     *
     * @param prod_sale_price_zar
     * @return
     */
    public CreateProductRequest withSalePriceZAR(BigDecimal prod_sale_price_zar) {
        this.prod_sale_price_zar = prod_sale_price_zar;

        return this;
    }

    /**
     * Product sale price in KRW (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceKRW() {
        return prod_sale_price_krw;
    }

    /**
     * Product sale price in KRW (Optional)
     *
     * @param prod_sale_price_krw
     */
    public void setSalePriceKRW(BigDecimal prod_sale_price_krw) {
        this.prod_sale_price_krw = prod_sale_price_krw;
    }

    /**
     * Product sale price in KRW (Optional)
     *
     * @param prod_sale_price_krw
     * @return
     */
    public CreateProductRequest withSalePriceKRW(BigDecimal prod_sale_price_krw) {
        this.prod_sale_price_krw = prod_sale_price_krw;

        return this;
    }

    /**
     * Product sale price in USD (Optional)
     *
     * @return
     */
    public BigDecimal getSalePriceUSD() {
        return prod_sale_price_usd;
    }

    /**
     * Product sale price in USD (Optional)
     *
     * @param prod_sale_price_usd
     */
    public void setSalePriceUSD(BigDecimal prod_sale_price_usd) {
        this.prod_sale_price_usd = prod_sale_price_usd;
    }

    /**
     * Product sale price in USD (Optional)
     *
     * @param prod_sale_price_usd
     * @return
     */
    public CreateProductRequest withSalePriceUSD(BigDecimal prod_sale_price_usd) {
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
    public CreateProductRequest withAcceptedUrl(String prod_accepted_url) {
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
    public CreateProductRequest withDeclinedUrl(String prod_declined_url) {
        this.prod_declined_url = prod_declined_url;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new LinkedHashMap();

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
        return "https://api.swipehq.com/createProduct.php";
    }

}
