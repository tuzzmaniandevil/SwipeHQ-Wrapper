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
package co.tuzza.swipehq.models.transaction;

import co.tuzza.swipehq.fields.Country;
import co.tuzza.swipehq.fields.Currency;
import co.tuzza.swipehq.models.BaseRequest;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * A transaction identifier is a temporary record held in the Swipe Checkout
 * system that identifies transactions sent to the Payments page for a
 * particular item being sold. Identifiers are setup for sale items using the
 * createTransactionIdentifier API. You simply pass the item's details and the
 * API will return the item's identifier. Then when a user clicks to buy an
 * item, the corresponding identifier is sent to the Payments page, where the
 * items details (price etc) are displayed. The advantage of the using this API
 * is that a identifier can be setup for any item on your website, even if it is
 * unknown to Swipe Checkout.
 *
 * @author Wesley
 */
public class CreateTransactionRequest implements BaseRequest {

    private static final String URL = "https://api.swipehq.com/createTransactionIdentifier.php";

    private String td_item;
    private String td_description;
    private BigDecimal td_amount;
    private String td_duration;
    private String td_default_quantity;
    private String td_user_data;
    private Currency td_currency;
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
    private String td_address;
    private String td_suburb;
    private String td_dob;
    private String td_ssn;
    private String td_reference;

    public String getItem() {
        return td_item;
    }

    /**
     * Set item to set up the identifier for (Compulsory)
     *
     * @param td_item
     */
    public void setItem(String td_item) {
        this.td_item = td_item;
    }

    public CreateTransactionRequest withItem(String td_item) {
        this.td_item = td_item;

        return this;
    }

    public String getDescription() {
        return td_description;
    }

    /**
     * Description of item or items. This data is displayed under the price on
     * the payments page when the parameter "checkout" is set to true. HTML tags
     * can be passed with this parameter to format the displayed data.
     * (Optional)
     *
     * @param td_description
     */
    public void setDescription(String td_description) {
        this.td_description = td_description;
    }

    public CreateTransactionRequest withDescription(String td_description) {
        this.td_description = td_description;

        return this;
    }

    public BigDecimal getAmount() {
        return td_amount;
    }

    /**
     * Item price (Compulsory)
     *
     * @param td_amount
     */
    public void setAmount(BigDecimal td_amount) {
        this.td_amount = td_amount;
    }

    public CreateTransactionRequest withAmount(BigDecimal td_amount) {
        this.td_amount = td_amount;

        return this;
    }

    public String getDuration() {
        return td_duration;
    }

    /**
     * Sets the lifetime of the transaction identifier in number of seconds, any
     * payment for this transaction identifier will not be processed when the
     * transaction identifier is expired. If not set, it will not expire.
     * (Optional)
     *
     * @param td_duration
     */
    public void setDuration(String td_duration) {
        this.td_duration = td_duration;
    }

    public CreateTransactionRequest withDuration(String td_duration) {
        this.td_duration = td_duration;

        return this;
    }

    public String getDefaultQuantity() {
        return td_default_quantity;
    }

    /**
     * Quantity of items. This can be manually over-ridden by passing the
     * 'item_quantity' parameter directly to the payments page. (Optional,
     * default is 1)
     *
     * @param td_default_quantity
     */
    public void setDefaultQuantity(String td_default_quantity) {
        this.td_default_quantity = td_default_quantity;
    }

    public CreateTransactionRequest withDefaultQuantity(String td_default_quantity) {
        this.td_default_quantity = td_default_quantity;

        return this;
    }

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
    public CreateTransactionRequest withUserData(String td_user_data) {
        this.td_user_data = td_user_data;

        return this;
    }

    public Currency getCurrency() {
        return td_currency;
    }

    /**
     * the currency the transaction is in. (Optional, if not passed the system
     * defaults to your default currency. This parameter accepts the currency
     * symbol. Eg: td_currency=aud.)
     *
     * @param td_currency
     */
    public void setCurrency(String td_currency) {
        this.td_currency = Currency.findByAny(td_currency);
    }

    /**
     * the currency the transaction is in. (Optional, if not passed the system
     * defaults to your default currency.)
     *
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.td_currency = currency;
    }

    /**
     * the currency the transaction is in. (Optional, if not passed the system
     * defaults to your default currency. This parameter accepts the currency
     * symbol. Eg: td_currency=aud.)
     *
     * @param td_currency
     * @return
     */
    public CreateTransactionRequest withCurrency(String td_currency) {
        this.setCurrency(td_currency);

        return this;
    }

    /**
     * the currency the transaction is in. (Optional, if not passed the system
     * defaults to your default currency.)
     *
     * @param currency
     * @return
     */
    public CreateTransactionRequest withCurrency(Currency currency) {
        this.setCurrency(currency);

        return this;
    }

    public String getToken() {
        return td_token;
    }

    /**
     * This is the token relating back to the customer's card data that is
     * securely stored on our system. Passing this into the API will put the
     * payment page into 'token' mode. This will fetch the users card data, so
     * they don't have to enter it again. If the token passed is incorrect, the
     * page will load as per usual.
     *
     * @param td_token
     */
    public void setToken(String td_token) {
        this.td_token = td_token;
    }

    public CreateTransactionRequest withToken(String td_token) {
        this.td_token = td_token;

        return this;
    }

    public String getCallbackUrl() {
        return td_callback_url;
    }

    /**
     * This field can be used to dynamically set your call back URL for
     * individual transactions. This functionality replaces the deprecated
     * 'setCallback' API
     *
     * @param td_callback_url
     */
    public void setCallbackUrl(String td_callback_url) {
        this.td_callback_url = td_callback_url;
    }

    public CreateTransactionRequest withCallbackUrl(String td_callback_url) {
        this.td_callback_url = td_callback_url;

        return this;
    }

    public String getLpnUrl() {
        return td_lpn_url;
    }

    /**
     * This field can be used to dynamically set your LPN URL for individual
     * transactions. This functionality replaces the deprecated 'setLpn' API
     *
     * @param td_lpn_url
     */
    public void setLpnUrl(String td_lpn_url) {
        this.td_lpn_url = td_lpn_url;
    }

    public CreateTransactionRequest withLpnUrl(String td_lpn_url) {
        this.td_lpn_url = td_lpn_url;

        return this;
    }

    public String getEmail() {
        return td_email;
    }

    /**
     * The customer's email address. This will automatically set the 'email'
     * field on the payment page.
     *
     * @param td_email
     */
    public void setEmail(String td_email) {
        this.td_email = td_email;
    }

    public CreateTransactionRequest withEmail(String td_email) {
        this.td_email = td_email;

        return this;
    }

    public String getFirstName() {
        return td_first_name;
    }

    /**
     * The customer's first name. This will automatically set the 'First Name'
     * field on the payment page.
     *
     * @param td_first_name
     */
    public void setFirstName(String td_first_name) {
        this.td_first_name = td_first_name;
    }

    public CreateTransactionRequest withFirstName(String td_first_name) {
        this.td_first_name = td_first_name;

        return this;
    }

    public String getLastName() {
        return td_last_name;
    }

    /**
     * The customer's last name. This will automatically set the 'Last Name'
     * field on the payment page.
     *
     * @param td_last_name
     */
    public void setLastName(String td_last_name) {
        this.td_last_name = td_last_name;
    }

    public CreateTransactionRequest withLastName(String td_last_name) {
        this.td_last_name = td_last_name;

        return this;
    }

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
        this.td_country = Country.findByName(td_country);
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
    public CreateTransactionRequest withCountry(String td_country) {
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
    public CreateTransactionRequest withCountry(Country country) {
        this.setCountry(country);

        return this;
    }

    public String getState() {
        return td_state;
    }

    /**
     * The credit card's billing state. This will automatically set the Billing
     * State field on the payment page.
     *
     * @param td_state
     */
    public void setState(String td_state) {
        this.td_state = td_state;
    }

    public CreateTransactionRequest withState(String td_state) {
        this.td_state = td_state;

        return this;
    }

    public String getCity() {
        return td_city;
    }

    /**
     * The credit card's billing city. This will automatically set the Billing
     * City field on the payment page.
     *
     * @param td_city
     */
    public void setCity(String td_city) {
        this.td_city = td_city;
    }

    public CreateTransactionRequest withCity(String td_city) {
        this.td_city = td_city;

        return this;
    }

    public String getCompany() {
        return td_company;
    }

    /**
     * The customer's business or individual name. This will automatically set
     * the Business / Individual name field on the payment page.
     *
     * @param td_company
     */
    public void setCompany(String td_company) {
        this.td_company = td_company;
    }

    public CreateTransactionRequest withCompany(String td_company) {
        this.td_company = td_company;

        return this;
    }

    public String getPostcode() {
        return td_post_code;
    }

    /**
     * The credit card's billing postal code. This will automatically set the
     * Post code field on the payment page.
     *
     * @param td_post_code
     */
    public void setPostcode(String td_post_code) {
        this.td_post_code = td_post_code;
    }

    public CreateTransactionRequest withPostcode(String td_post_code) {
        this.td_post_code = td_post_code;

        return this;
    }

    public String getPhone() {
        return td_phone;
    }

    /**
     * The customer's phone number. This will automatically set the Phone number
     * field on the payment page.
     *
     * @param td_phone
     */
    public void setPhone(String td_phone) {
        this.td_phone = td_phone;
    }

    public CreateTransactionRequest withPhone(String td_phone) {
        this.td_phone = td_phone;

        return this;
    }

    public String getAddress() {
        return td_address;
    }

    /**
     * The credit card's billing address. This will automatically set the
     * Billing Address field on the payment page.
     *
     * @param td_address
     */
    public void setAddress(String td_address) {
        this.td_address = td_address;
    }

    public CreateTransactionRequest withAddress(String td_address) {
        this.td_address = td_address;

        return this;
    }

    public String getSuburb() {
        return td_suburb;
    }

    /**
     * The credit card's billing suburb. This will automatically set the Billing
     * Suburb field on the payment page.
     *
     *
     * @param td_suburb
     */
    public void setSuburb(String td_suburb) {
        this.td_suburb = td_suburb;
    }

    public CreateTransactionRequest withSuburb(String td_suburb) {
        this.td_suburb = td_suburb;

        return this;
    }

    public String getDob() {
        return td_dob;
    }

    /**
     * The credit card holder's date of birth in the format of yyyy-mm-dd. This
     * will automatically set the Date of Birth field on the payment page.
     *
     * @param td_dob
     */
    public void setDob(String td_dob) {
        this.td_dob = td_dob;
    }

    public CreateTransactionRequest withDob(String td_dob) {
        this.td_dob = td_dob;

        return this;
    }

    public String getSsn() {
        return td_ssn;
    }

    /**
     * The credit card holder's social security number. This will automatically
     * set the Social Security Number field on the payment page.
     *
     * @param td_ssn
     */
    public void setSsn(String td_ssn) {
        this.td_ssn = td_ssn;
    }

    public CreateTransactionRequest withSsn(String td_ssn) {
        this.td_ssn = td_ssn;

        return this;
    }

    public String getReference() {
        return td_reference;
    }

    /**
     * This field can be used to pass through a reference code for
     * reconciliation purposes. The data can be viewed on the transaction
     * details page.
     *
     * @param td_reference
     */
    public void setReference(String td_reference) {
        this.td_reference = td_reference;
    }

    public CreateTransactionRequest withReference(String td_reference) {
        this.td_reference = td_reference;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("td_item", td_item, params);
        BaseRequest.addIfhasValue("td_description", td_description, params);
        BaseRequest.addIfhasValue("td_amount", td_amount, params);
        BaseRequest.addIfhasValue("td_duration", td_duration, params);
        BaseRequest.addIfhasValue("td_default_quantity", td_default_quantity, params);
        BaseRequest.addIfhasValue("td_user_data", td_user_data, params);
        BaseRequest.addIfhasValue("td_currency", td_currency, params);
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
        BaseRequest.addIfhasValue("td_address", td_address, params);
        BaseRequest.addIfhasValue("td_suburb", td_suburb, params);
        BaseRequest.addIfhasValue("td_dob", td_dob, params);
        BaseRequest.addIfhasValue("td_ssn", td_ssn, params);
        BaseRequest.addIfhasValue("td_reference", td_reference, params);

        return params;
    }

    @Override
    public String url() {
        return URL;
    }
}
