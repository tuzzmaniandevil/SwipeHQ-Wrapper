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
package co.tuzza.swipehq.models.cart;

import co.tuzza.swipehq.fields.AmountType;
import co.tuzza.swipehq.fields.Country;
import co.tuzza.swipehq.fields.Currency;
import co.tuzza.swipehq.models.BaseRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A transaction identifier is a temporary record held in the Swipe Checkout
 * system that identifies transactions sent to the Payments page for particular
 * item(s) being sold. You simply pass the product IDs to this API and the API
 * will return the identifier for this cart transaction. Then when a user clicks
 * to buy an item, the corresponding identifier is sent to the Payments page,
 * where the items details (price etc) are displayed. The advantage of the using
 * this API is that a identifier can be setup for multiple products on your
 * website.
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class CreateCartRequest implements BaseRequest {

    private String crt_product_data;
    private Currency crt_currency;
    private String crt_discount;
    private AmountType crt_discount_type;
    private String crt_tip;
    private AmountType crt_tip_type;
    private String td_user_data;
    private String td_token;
    private String td_callback_url;
    private String td_lpn_url;
    private String td_email;
    private String td_first_name;
    private String td_last_name;
    private Country td_country;
    private String td_state;
    private String td_city;
    private String td_company;
    private String td_post_code;
    private String td_phone;
    private String td_mobile;
    private String td_address;
    private String td_suburb;
    private String td_reference;

    /**
     * A JSON encoded format containing the product ID and quantity of each
     * product.
     *
     * @return
     */
    public String getProductData() {
        return crt_product_data;
    }

    /**
     * A JSON encoded format containing the product ID and quantity of each
     * product. (Compulsory)
     *
     * @param crt_product_data
     */
    public void setProductData(String crt_product_data) {
        this.crt_product_data = crt_product_data;
    }

    /**
     * A JSON encoded format containing the product ID and quantity of each
     * product. (Compulsory)
     *
     * @param crt_product_data
     * @return
     */
    public CreateCartRequest withProductData(String crt_product_data) {
        this.crt_product_data = crt_product_data;

        return this;
    }

    /**
     * The currency for the cart transaction, if not passed or passed
     * incorrectly, default currency will be used (Optional)
     *
     * @return
     */
    public Currency getCurrency() {
        return crt_currency;
    }

    /**
     * The currency for the cart transaction, if not passed or passed
     * incorrectly, default currency will be used (Optional)
     *
     * @param crt_currency
     */
    public void setCurrency(String crt_currency) {
        this.crt_currency = Currency.findByAny(crt_currency);
    }

    /**
     * The currency for the cart transaction, if not passed or passed
     * incorrectly, default currency will be used (Optional)
     *
     * @param crt_currency
     */
    public void setCurrency(Currency crt_currency) {
        this.crt_currency = crt_currency;
    }

    /**
     * The currency for the cart transaction, if not passed or passed
     * incorrectly, default currency will be used (Optional)
     *
     * @param crt_currency
     * @return
     */
    public CreateCartRequest withCurrency(String crt_currency) {
        this.setCurrency(crt_currency);

        return this;
    }

    /**
     * The currency for the cart transaction, if not passed or passed
     * incorrectly, default currency will be used (Optional)
     *
     * @param crt_currency
     * @return
     */
    public CreateCartRequest withCurrency(Currency crt_currency) {
        this.setCurrency(crt_currency);

        return this;
    }

    /**
     * Discount amount for the cart transaction, can be a fixed amount or
     * percentage, e.g. 100 for one hundred dollars discount, and 20 for 20
     * percent discount. (Optional)
     *
     * @return
     */
    public String getDiscount() {
        return crt_discount;
    }

    /**
     * Discount amount for the cart transaction, can be a fixed amount or
     * percentage, e.g. 100 for one hundred dollars discount, and 20 for 20
     * percent discount. (Optional)
     *
     * @param crt_discount
     */
    public void setDiscount(String crt_discount) {
        this.crt_discount = crt_discount;
    }

    /**
     * Discount amount for the cart transaction, can be a fixed amount or
     * percentage, e.g. 100 for one hundred dollars discount, and 20 for 20
     * percent discount. (Optional)
     *
     * @param crt_discount
     * @return
     */
    public CreateCartRequest withDiscount(String crt_discount) {
        this.crt_discount = crt_discount;

        return this;
    }

    /**
     * Discount type for the cart transaction, either 'fixed' or 'percent',
     * default is 'fixed'. (Optional)
     *
     * @return
     */
    public AmountType getDiscountType() {
        return crt_discount_type;
    }

    /**
     * Discount type for the cart transaction, either 'fixed' or 'percent',
     * default is 'fixed'. (Optional)
     *
     * @param crt_discount_type
     */
    public void setDiscountType(AmountType crt_discount_type) {
        this.crt_discount_type = crt_discount_type;
    }

    /**
     * Discount type for the cart transaction, either 'fixed' or 'percent',
     * default is 'fixed'. (Optional)
     *
     * @param crt_discount_type
     */
    public void setDiscountType(String crt_discount_type) {
        this.crt_discount_type = AmountType.findByName(crt_discount_type);
    }

    /**
     * Discount type for the cart transaction, either 'fixed' or 'percent',
     * default is 'fixed'. (Optional)
     *
     * @param crt_discount_type
     * @return
     */
    public CreateCartRequest withDiscountType(AmountType crt_discount_type) {
        this.setDiscountType(crt_discount_type);

        return this;
    }

    /**
     * Discount type for the cart transaction, either 'fixed' or 'percent',
     * default is 'fixed'. (Optional)
     *
     * @param crt_discount_type
     * @return
     */
    public CreateCartRequest withDiscountType(String crt_discount_type) {
        this.setDiscountType(crt_discount_type);

        return this;
    }

    /**
     * Tip amount for the cart transaction, can be a fixed amount or percentage,
     * e.g. 100 for one hundred dollars tip, and 20 for 20 percent tip.
     * (Optional)
     *
     * @return
     */
    public String getTip() {
        return crt_tip;
    }

    /**
     * Tip amount for the cart transaction, can be a fixed amount or percentage,
     * e.g. 100 for one hundred dollars tip, and 20 for 20 percent tip.
     * (Optional)
     *
     * @param crt_tip
     */
    public void setTip(String crt_tip) {
        this.crt_tip = crt_tip;
    }

    /**
     * Tip amount for the cart transaction, can be a fixed amount or percentage,
     * e.g. 100 for one hundred dollars tip, and 20 for 20 percent tip.
     * (Optional)
     *
     * @param crt_tip
     * @return
     */
    public CreateCartRequest withTip(String crt_tip) {
        this.crt_tip = crt_tip;

        return this;
    }

    /**
     * Tip type for the cart transaction, either 'fixed' or 'percent', default
     * is 'fixed'. (Optional)
     *
     * @return
     */
    public AmountType getTipType() {
        return crt_tip_type;
    }

    /**
     * Tip type for the cart transaction, either 'fixed' or 'percent', default
     * is 'fixed'. (Optional)
     *
     * @param crt_tip_type
     */
    public void setTypeType(AmountType crt_tip_type) {
        this.crt_tip_type = crt_tip_type;
    }

    /**
     * Tip type for the cart transaction, either 'fixed' or 'percent', default
     * is 'fixed'. (Optional)
     *
     * @param crt_tip_type
     */
    public void setTypeType(String crt_tip_type) {
        this.crt_tip_type = AmountType.findByName(crt_tip_type);
    }

    /**
     * Tip type for the cart transaction, either 'fixed' or 'percent', default
     * is 'fixed'. (Optional)
     *
     * @param crt_tip_type
     * @return
     */
    public CreateCartRequest withTipType(AmountType crt_tip_type) {
        this.setTypeType(crt_tip_type);

        return this;
    }

    /**
     * Tip type for the cart transaction, either 'fixed' or 'percent', default
     * is 'fixed'. (Optional)
     *
     * @param crt_tip_type
     * @return
     */
    public CreateCartRequest withTipType(String crt_tip_type) {
        this.setTypeType(crt_tip_type);

        return this;
    }

    /**
     * Any user data you would like to pass. (Optional)
     *
     * @return
     */
    public String getUserData() {
        return td_user_data;
    }

    /**
     * Any user data you would like to pass. (Optional)
     *
     * @param td_user_data
     */
    public void setUserData(String td_user_data) {
        this.td_user_data = td_user_data;
    }

    /**
     * Any user data you would like to pass. (Optional)
     *
     * @param td_user_data
     * @return
     */
    public CreateCartRequest withUserData(String td_user_data) {
        this.td_user_data = td_user_data;

        return this;
    }

    /**
     * This is the token relating back to the customer's card data that is
     * securely stored on our system. Passing this into the API will put the
     * payment page into 'token' mode. This will fetch the users card data, so
     * they don't have to enter it again. If the token passed is incorrect, the
     * page will load as per usual. (Optional)
     *
     * @return
     */
    public String getToken() {
        return td_token;
    }

    /**
     * This is the token relating back to the customer's card data that is
     * securely stored on our system. Passing this into the API will put the
     * payment page into 'token' mode. This will fetch the users card data, so
     * they don't have to enter it again. If the token passed is incorrect, the
     * page will load as per usual. (Optional)
     *
     * @param td_token
     */
    public void setToken(String td_token) {
        this.td_token = td_token;
    }

    /**
     * This is the token relating back to the customer's card data that is
     * securely stored on our system. Passing this into the API will put the
     * payment page into 'token' mode. This will fetch the users card data, so
     * they don't have to enter it again. If the token passed is incorrect, the
     * page will load as per usual. (Optional)
     *
     * @param td_token
     * @return
     */
    public CreateCartRequest withToken(String td_token) {
        this.td_token = td_token;

        return this;
    }

    /**
     * This field can be used to dynamically set your call back URL for
     * individual transactions. (Optional)
     *
     * @return
     */
    public String getCallbackUrl() {
        return td_callback_url;
    }

    /**
     * This field can be used to dynamically set your call back URL for
     * individual transactions. (Optional)
     *
     * @param td_callback_url
     */
    public void setCallbackUrl(String td_callback_url) {
        this.td_callback_url = td_callback_url;
    }

    /**
     * This field can be used to dynamically set your call back URL for
     * individual transactions. (Optional)
     *
     * @param td_callback_url
     * @return
     */
    public CreateCartRequest withCallbackUrl(String td_callback_url) {
        this.td_callback_url = td_callback_url;

        return this;
    }

    /**
     * This field can be used to dynamically set your LPN URL for individual
     * transactions. (Optional)
     *
     * @return
     */
    public String getLpnUrl() {
        return td_lpn_url;
    }

    /**
     * This field can be used to dynamically set your LPN URL for individual
     * transactions. (Optional)
     *
     * @param td_lpn_url
     */
    public void setLpnUrl(String td_lpn_url) {
        this.td_lpn_url = td_lpn_url;
    }

    /**
     * This field can be used to dynamically set your LPN URL for individual
     * transactions. (Optional)
     *
     * @param td_lpn_url
     * @return
     */
    public CreateCartRequest withLpnUrl(String td_lpn_url) {
        this.td_lpn_url = td_lpn_url;

        return this;
    }

    /**
     * The customer's email address. This will automatically set the 'email'
     * field on the payment page. (Optional)
     *
     * @return
     */
    public String getEmail() {
        return td_email;
    }

    /**
     * The customer's email address. This will automatically set the 'email'
     * field on the payment page. (Optional)
     *
     * @param td_email
     */
    public void setEmail(String td_email) {
        this.td_email = td_email;
    }

    /**
     * The customer's email address. This will automatically set the 'email'
     * field on the payment page. (Optional)
     *
     * @param td_email
     * @return
     */
    public CreateCartRequest withEmail(String td_email) {
        this.td_email = td_email;

        return this;
    }

    /**
     * The customer's first name. This will automatically set the 'First Name'
     * field on the payment page. (Optional)
     *
     * @return
     */
    public String getFirstName() {
        return td_first_name;
    }

    /**
     * The customer's first name. This will automatically set the 'First Name'
     * field on the payment page. (Optional)
     *
     * @param td_first_name
     */
    public void setFirstName(String td_first_name) {
        this.td_first_name = td_first_name;
    }

    /**
     * The customer's first name. This will automatically set the 'First Name'
     * field on the payment page. (Optional)
     *
     * @param td_first_name
     * @return
     */
    public CreateCartRequest withFirstName(String td_first_name) {
        this.td_first_name = td_first_name;

        return this;
    }

    /**
     * The customer's last name. This will automatically set the 'Last Name'
     * field on the payment page. (Optional)
     *
     * @return
     */
    public String getLastName() {
        return td_last_name;
    }

    /**
     * The customer's last name. This will automatically set the 'Last Name'
     * field on the payment page. (Optional)
     *
     * @param td_last_name
     */
    public void setLastName(String td_last_name) {
        this.td_last_name = td_last_name;
    }

    /**
     * The customer's last name. This will automatically set the 'Last Name'
     * field on the payment page. (Optional)
     *
     * @param td_last_name
     * @return
     */
    public CreateCartRequest withLastName(String td_last_name) {
        this.td_last_name = td_last_name;

        return this;
    }

    /**
     * The credit card's billing country. This will automatically set the
     * Billing Country field on the payment page.
     *
     * @return
     */
    public Country getCountry() {
        return td_country;
    }

    /**
     * The credit card's billing country. This will automatically set the
     * Billing Country field on the payment page.
     *
     * @param td_country
     */
    public void setCountry(String td_country) {
        this.td_country = Country.valueOf(td_country);
    }

    /**
     * The credit card's billing country. This will automatically set the
     * Billing Country field on the payment page.
     *
     * @param country
     */
    public void setCountry(Country country) {
        this.td_country = country;
    }

    /**
     * The credit card's billing country. This will automatically set the
     * Billing Country field on the payment page.
     *
     * @param td_country
     * @return
     */
    public CreateCartRequest withCountry(String td_country) {
        this.setCountry(td_country);

        return this;
    }

    /**
     * The credit card's billing country. This will automatically set the
     * Billing Country field on the payment page.
     *
     * @param country
     * @return
     */
    public CreateCartRequest withCountry(Country country) {
        this.setCountry(country);

        return this;
    }

    /**
     * The credit card's billing state. This will automatically set the Billing
     * State field on the payment page. (Optional)
     *
     * @return
     */
    public String getState() {
        return td_state;
    }

    /**
     * The credit card's billing state. This will automatically set the Billing
     * State field on the payment page. (Optional)
     *
     * @param td_state
     */
    public void setState(String td_state) {
        this.td_state = td_state;
    }

    /**
     * The credit card's billing state. This will automatically set the Billing
     * State field on the payment page. (Optional)
     *
     * @param td_state
     * @return
     */
    public CreateCartRequest withState(String td_state) {
        this.td_state = td_state;

        return this;
    }

    /**
     * The credit card's billing city. This will automatically set the Billing
     * City field on the payment page. (Optional)
     *
     * @return
     */
    public String getCity() {
        return td_city;
    }

    /**
     * The credit card's billing city. This will automatically set the Billing
     * City field on the payment page. (Optional)
     *
     * @param td_city
     */
    public void setCity(String td_city) {
        this.td_city = td_city;
    }

    /**
     * The credit card's billing city. This will automatically set the Billing
     * City field on the payment page. (Optional)
     *
     * @param td_city
     * @return
     */
    public CreateCartRequest withCity(String td_city) {
        this.td_city = td_city;

        return this;
    }

    /**
     * The customer's business or individual name. This will automatically set
     * the Business / Individual name field on the payment page. (Optional)
     *
     * @return
     */
    public String getCompany() {
        return td_company;
    }

    /**
     * The customer's business or individual name. This will automatically set
     * the Business / Individual name field on the payment page. (Optional)
     *
     * @param td_company
     */
    public void setCompany(String td_company) {
        this.td_company = td_company;
    }

    /**
     * The customer's business or individual name. This will automatically set
     * the Business / Individual name field on the payment page. (Optional)
     *
     * @param td_company
     * @return
     */
    public CreateCartRequest withCompany(String td_company) {
        this.td_company = td_company;

        return this;
    }

    /**
     * The credit card's billing postal code. This will automatically set the
     * Post code field on the payment page. (Optional)
     *
     * @return
     */
    public String getPostcode() {
        return td_post_code;
    }

    /**
     * The credit card's billing postal code. This will automatically set the
     * Post code field on the payment page. (Optional)
     *
     * @param td_post_code
     */
    public void setPostcode(String td_post_code) {
        this.td_post_code = td_post_code;
    }

    /**
     * The credit card's billing postal code. This will automatically set the
     * Post code field on the payment page. (Optional)
     *
     * @param td_post_code
     * @return
     */
    public CreateCartRequest withPostcode(String td_post_code) {
        this.td_post_code = td_post_code;

        return this;
    }

    /**
     * The customer's phone number. This will automatically set the Phone number
     * field on the payment page. (Optional)
     *
     * @return
     */
    public String getPhone() {
        return td_phone;
    }

    /**
     * The customer's phone number. This will automatically set the Phone number
     * field on the payment page. (Optional)
     *
     * @param td_phone
     */
    public void setPhone(String td_phone) {
        this.td_phone = td_phone;
    }

    /**
     * The customer's phone number. This will automatically set the Phone number
     * field on the payment page. (Optional)
     *
     * @param td_phone
     * @return
     */
    public CreateCartRequest withPhone(String td_phone) {
        this.td_phone = td_phone;

        return this;
    }

    /**
     * The customer's mobile number. (Optional)
     *
     * @return
     */
    public String getMobile() {
        return td_mobile;
    }

    /**
     * The customer's mobile number. (Optional)
     *
     * @param td_mobile
     */
    public void setMobile(String td_mobile) {
        this.td_mobile = td_mobile;
    }

    /**
     * The customer's mobile number. (Optional)
     *
     * @param td_mobile
     * @return
     */
    public CreateCartRequest withMobile(String td_mobile) {
        this.td_mobile = td_mobile;

        return this;
    }

    /**
     * The credit card's billing address. This will automatically set the
     * Billing Address field on the payment page. (Optional)
     *
     * @return
     */
    public String getAddress() {
        return td_address;
    }

    /**
     * The credit card's billing address. This will automatically set the
     * Billing Address field on the payment page. (Optional)
     *
     * @param td_address
     */
    public void setAddress(String td_address) {
        this.td_address = td_address;
    }

    /**
     * The credit card's billing address. This will automatically set the
     * Billing Address field on the payment page. (Optional)
     *
     * @param td_address
     * @return
     */
    public CreateCartRequest withAddress(String td_address) {
        this.td_address = td_address;

        return this;
    }

    /**
     * The credit card's billing suburb. This will automatically set the Billing
     * Suburb field on the payment page. (Optional)
     *
     * @return
     */
    public String getSuburb() {
        return td_suburb;
    }

    /**
     * The credit card's billing suburb. This will automatically set the Billing
     * Suburb field on the payment page. (Optional)
     *
     *
     * @param td_suburb
     */
    public void setSuburb(String td_suburb) {
        this.td_suburb = td_suburb;
    }

    /**
     * The credit card's billing suburb. This will automatically set the Billing
     * Suburb field on the payment page. (Optional)
     *
     * @param td_suburb
     * @return
     */
    public CreateCartRequest withSuburb(String td_suburb) {
        this.td_suburb = td_suburb;

        return this;
    }

    /**
     * This field can be used to pass through a reference code for
     * reconciliation purposes. The data can be viewed on the transaction
     * details page. (Optional)
     *
     * @return
     */
    public String getReference() {
        return td_reference;
    }

    /**
     * This field can be used to pass through a reference code for
     * reconciliation purposes. The data can be viewed on the transaction
     * details page. (Optional)
     *
     * @param td_reference
     */
    public void setReference(String td_reference) {
        this.td_reference = td_reference;
    }

    /**
     * This field can be used to pass through a reference code for
     * reconciliation purposes. The data can be viewed on the transaction
     * details page. (Optional)
     *
     * @param td_reference
     * @return
     */
    public CreateCartRequest withReference(String td_reference) {
        this.td_reference = td_reference;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new LinkedHashMap<>();

        BaseRequest.addIfhasValue("crt_product_data", crt_product_data, params);
        BaseRequest.addIfhasValue("crt_currency", crt_currency, params);
        BaseRequest.addIfhasValue("crt_discount", crt_discount, params);
        BaseRequest.addIfhasValue("crt_discount_type", crt_discount_type, params);
        BaseRequest.addIfhasValue("crt_tip", crt_tip, params);
        BaseRequest.addIfhasValue("crt_tip_type", crt_tip_type, params);
        BaseRequest.addIfhasValue("td_user_data", td_user_data, params);
        BaseRequest.addIfhasValue("td_token", td_token, params);
        BaseRequest.addIfhasValue("td_callback_url", td_callback_url, params);
        BaseRequest.addIfhasValue("td_lpn_url", td_lpn_url, params);
        BaseRequest.addIfhasValue("td_email", td_email, params);
        BaseRequest.addIfhasValue("td_first_name", td_first_name, params);
        BaseRequest.addIfhasValue("td_last_name", td_last_name, params);
        BaseRequest.addIfhasValue("td_country", td_country, params);
        BaseRequest.addIfhasValue("td_state", td_state, params);
        BaseRequest.addIfhasValue("td_city", td_city, params);
        BaseRequest.addIfhasValue("td_company", td_company, params);
        BaseRequest.addIfhasValue("td_post_code", td_post_code, params);
        BaseRequest.addIfhasValue("td_phone", td_phone, params);
        BaseRequest.addIfhasValue("td_mobile", td_mobile, params);
        BaseRequest.addIfhasValue("td_address", td_address, params);
        BaseRequest.addIfhasValue("td_suburb", td_suburb, params);
        BaseRequest.addIfhasValue("td_reference", td_reference, params);

        return params;
    }

    @Override
    public String url() {
        return "https://api.swipehq.com/createCart.php";
    }

}
