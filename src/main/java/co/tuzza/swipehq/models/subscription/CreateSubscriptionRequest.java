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
package co.tuzza.swipehq.models.subscription;

import co.tuzza.swipehq.fields.Country;
import co.tuzza.swipehq.models.BaseRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A subscription identifier is a temporary record held in the Swipe Checkout
 * system that identifies subscriptions sent to the Subscriptions page for a
 * particular item being subscribed too. Identifiers are setup for subscriptions
 * using the createSubscriptionIdentifier API. You simply pass the item's
 * details and the API will return the item's identifier. Then when a user
 * clicks to subscribe, the corresponding identifier is sent to the
 * Subscriptions page, where the items details (subscribers details,
 * subscription price etc) are displayed.
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class CreateSubscriptionRequest implements BaseRequest {

    private final static String URL = "https://api.swipehq.com/createSubscriptionIdentifier.php";

    private String contract_id;
    private String td_user_data;
    private String td_email;
    private String td_first_name;
    private String td_last_name;
    private String td_address;
    private String td_company;
    private String td_suburb;
    private String td_city;
    private String td_state;
    private Country td_country;
    private String td_phone;
    private String td_mobile;
    private String td_dob;
    private String td_ssn;
    private String td_reference;

    public String getContractId() {
        return contract_id;
    }

    /**
     * The contract_id for the subscription plan to set up the identifier for
     * (Compulsory)
     *
     * @param contract_id
     */
    public void setContractId(String contract_id) {
        this.contract_id = contract_id;
    }

    /**
     * The contract_id for the subscription plan to set up the identifier for
     * (Compulsory)
     *
     * @param contract_id
     * @return
     */
    public CreateSubscriptionRequest withContractId(String contract_id) {
        this.contract_id = contract_id;

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
    public CreateSubscriptionRequest withUserData(String td_user_data) {
        this.td_user_data = td_user_data;

        return this;
    }

    public String getEmail() {
        return td_email;
    }

    /**
     * The subscriber's email address (Compulsory)
     *
     * @param td_email
     */
    public void setEmail(String td_email) {
        this.td_email = td_email;
    }

    /**
     * The subscriber's email address (Compulsory)
     *
     * @param td_email
     * @return
     */
    public CreateSubscriptionRequest withEmail(String td_email) {
        this.td_email = td_email;

        return this;
    }

    public String getFirstName() {
        return td_first_name;
    }

    /**
     * The subscriber's first name (Compulsory)
     *
     * @param td_first_name
     */
    public void setFirstName(String td_first_name) {
        this.td_first_name = td_first_name;
    }

    /**
     * The subscriber's first name (Compulsory)
     *
     * @param td_first_name
     * @return
     */
    public CreateSubscriptionRequest withFirstName(String td_first_name) {
        this.td_first_name = td_first_name;

        return this;
    }

    public String getLastName() {
        return td_last_name;
    }

    /**
     * The subscriber's last name (Compulsory)
     *
     * @param td_last_name
     */
    public void setLastName(String td_last_name) {
        this.td_last_name = td_last_name;
    }

    /**
     * The subscriber's last name (Compulsory)
     *
     * @param td_last_name
     * @return
     */
    public CreateSubscriptionRequest withLastName(String td_last_name) {
        this.td_last_name = td_last_name;

        return this;
    }

    public String getAddress() {
        return td_address;
    }

    /**
     * The credit card's billing address (Compulsory)
     *
     * @param td_address
     */
    public void setAddress(String td_address) {
        this.td_address = td_address;
    }

    /**
     * The credit card's billing address (Compulsory)
     *
     * @param td_address
     *
     * @return
     */
    public CreateSubscriptionRequest withAddress(String td_address) {
        this.td_address = td_address;

        return this;
    }

    public String getCompany() {
        return td_company;
    }

    /**
     * The subscriber's company (Optional)
     *
     * @param td_company
     */
    public void setCompany(String td_company) {
        this.td_company = td_company;
    }

    /**
     * The subscriber's company (Optional)
     *
     * @param td_company
     * @return
     */
    public CreateSubscriptionRequest withCompany(String td_company) {
        this.td_company = td_company;

        return this;
    }

    public String getSuburb() {
        return td_suburb;
    }

    /**
     * The credit card's billing suburb (Optional)
     *
     *
     * @param td_suburb
     */
    public void setSuburb(String td_suburb) {
        this.td_suburb = td_suburb;
    }

    /**
     * The credit card's billing suburb (Optional)
     *
     * @param td_suburb
     * @return
     */
    public CreateSubscriptionRequest withSuburb(String td_suburb) {
        this.td_suburb = td_suburb;

        return this;
    }

    public String getCity() {
        return td_city;
    }

    /**
     * The credit card's billing city (Compulsory)
     *
     * @param td_city
     */
    public void setCity(String td_city) {
        this.td_city = td_city;
    }

    /**
     * The credit card's billing city (Compulsory)
     *
     * @param td_city
     * @return
     */
    public CreateSubscriptionRequest withCity(String td_city) {
        this.td_city = td_city;

        return this;
    }

    public String getState() {
        return td_state;
    }

    /**
     * The credit card's billing state (Optional)
     *
     * @param td_state
     */
    public void setState(String td_state) {
        this.td_state = td_state;
    }

    /**
     * The credit card's billing state (Optional)
     *
     * @param td_state
     * @return
     */
    public CreateSubscriptionRequest withState(String td_state) {
        this.td_state = td_state;

        return this;
    }

    public Country getCountry() {
        return td_country;
    }

    /**
     * The credit card's billing country (Compulsory)
     *
     * @param td_country
     */
    public void setCountry(String td_country) {
        this.td_country = Country.valueOf(td_country);
    }

    /**
     * The credit card's billing country (Compulsory)
     *
     * @param country
     */
    public void setCountry(Country country) {
        this.td_country = country;
    }

    /**
     * The credit card's billing country (Compulsory)
     *
     * @param td_country
     * @return
     */
    public CreateSubscriptionRequest withCountry(String td_country) {
        this.setCountry(td_country);

        return this;
    }

    /**
     * The credit card's billing country (Compulsory)
     *
     * @param country
     * @return
     */
    public CreateSubscriptionRequest withCountry(Country country) {
        this.setCountry(country);

        return this;
    }

    public String getPhone() {
        return td_phone;
    }

    /**
     * The subscriber's phone number (Optional)
     *
     * @param td_phone
     */
    public void setPhone(String td_phone) {
        this.td_phone = td_phone;
    }

    /**
     * The subscriber's phone number (Optional)
     *
     * @param td_phone
     * @return
     */
    public CreateSubscriptionRequest withPhone(String td_phone) {
        this.td_phone = td_phone;

        return this;
    }

    public String getMobile() {
        return td_mobile;
    }

    /**
     * The subscriber's mobile number (Optional)
     *
     * @param td_mobile
     */
    public void setMobile(String td_mobile) {
        this.td_mobile = td_mobile;
    }

    /**
     * The subscriber's mobile number (Optional)
     *
     * @param td_mobile
     * @return
     */
    public CreateSubscriptionRequest withMobile(String td_mobile) {
        this.td_mobile = td_mobile;

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

    public CreateSubscriptionRequest withDob(String td_dob) {
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

    public CreateSubscriptionRequest withSsn(String td_ssn) {
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

    public CreateSubscriptionRequest withReference(String td_reference) {
        this.td_reference = td_reference;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new LinkedHashMap();

        BaseRequest.addIfhasValue("contract_id", contract_id, params);
        BaseRequest.addIfhasValue("td_user_data", td_user_data, params);
        BaseRequest.addIfhasValue("td_email", td_email, params);
        BaseRequest.addIfhasValue("td_first_name", td_first_name, params);
        BaseRequest.addIfhasValue("td_last_name", td_last_name, params);
        BaseRequest.addIfhasValue("td_address", td_address, params);
        BaseRequest.addIfhasValue("td_company", td_company, params);
        BaseRequest.addIfhasValue("td_suburb", td_suburb, params);
        BaseRequest.addIfhasValue("td_city", td_city, params);
        BaseRequest.addIfhasValue("td_state", td_state, params);
        BaseRequest.addIfhasValue("td_country", td_country, params);
        BaseRequest.addIfhasValue("td_phone", td_phone, params);
        BaseRequest.addIfhasValue("td_mobile", td_mobile, params);
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
