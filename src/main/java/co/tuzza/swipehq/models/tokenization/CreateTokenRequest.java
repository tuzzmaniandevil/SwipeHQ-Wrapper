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
package co.tuzza.swipehq.models.tokenization;

import co.tuzza.swipehq.models.BaseRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class CreateTokenRequest implements BaseRequest {

    private String card_number;
    private String card_expiry;
    private String name_on_card;
    private String card_security_code;
    private String customer_email;
    private String customer_address;
    private String customer_company;
    private String customer_suburb;
    private String customer_city;
    private String customer_state;
    private String customer_country;
    private String customer_date_of_birth;
    private String customer_social_security_number;

    /**
     * The credit card number, will be validated by this API (Compulsory)
     *
     * @return
     */
    public String getCardNumber() {
        return card_number;
    }

    /**
     * The credit card number, will be validated by this API (Compulsory)
     *
     * @param card_number
     */
    public void setCardNumber(String card_number) {
        this.card_number = card_number;
    }

    /**
     * The credit card number, will be validated by this API (Compulsory)
     *
     * @param card_number
     * @return
     */
    public CreateTokenRequest withCardNumber(String card_number) {
        this.card_number = card_number;

        return this;
    }

    /**
     * The credit card expiry, must be in the format MMYY (Compulsory)
     *
     * @return
     */
    public String getCardExpiry() {
        return card_expiry;
    }

    /**
     * The credit card expiry, must be in the format MMYY (Compulsory)
     *
     * @param card_expiry
     */
    public void setCardExpiry(String card_expiry) {
        this.card_expiry = card_expiry;
    }

    /**
     * The credit card expiry, must be in the format MMYY (Compulsory)
     *
     * @param card_expiry
     * @return
     */
    public CreateTokenRequest withCardExpiry(String card_expiry) {
        this.card_expiry = card_expiry;

        return this;
    }

    /**
     * The name on the credit card (Compulsory)
     *
     * @return
     */
    public String getNameOnCard() {
        return name_on_card;
    }

    /**
     * The name on the credit card (Compulsory)
     *
     * @param name_on_card
     */
    public void setNameOnCard(String name_on_card) {
        this.name_on_card = name_on_card;
    }

    /**
     * The name on the credit card (Compulsory)
     *
     * @param name_on_card
     * @return
     */
    public CreateTokenRequest withNameOnCard(String name_on_card) {
        this.name_on_card = name_on_card;

        return this;
    }

    /**
     * The cards security code: CVV, CVV2 or CVC2 (Compulsory)
     *
     * @return
     */
    public String getCardSecurityCode() {
        return card_security_code;
    }

    /**
     * The cards security code: CVV, CVV2 or CVC2 (Compulsory)
     *
     * @param card_security_code
     */
    public void setCardSecurityCode(String card_security_code) {
        this.card_security_code = card_security_code;
    }

    /**
     * The cards security code: CVV, CVV2 or CVC2 (Compulsory)
     *
     * @param card_security_code
     * @return
     */
    public CreateTokenRequest withSecurityCode(String card_security_code) {
        this.card_security_code = card_security_code;

        return this;
    }

    /**
     * Customer email to store (Optional)
     *
     * @return
     */
    public String getCustomerEmail() {
        return customer_email;
    }

    /**
     * Customer email to store (Optional)
     *
     * @param customer_email
     */
    public void setCustomerEmail(String customer_email) {
        this.customer_email = customer_email;
    }

    /**
     * Customer email to store (Optional)
     *
     * @param customer_email
     * @return
     */
    public CreateTokenRequest withCustomerEmail(String customer_email) {
        this.customer_email = customer_email;

        return this;
    }

    /**
     * Customer address to store (Optional)
     *
     * @return
     */
    public String getCustomerAddress() {
        return customer_address;
    }

    /**
     * Customer address to store (Optional)
     *
     * @param customer_address
     */
    public void setCustomerAddress(String customer_address) {
        this.customer_address = customer_address;
    }

    /**
     * Customer address to store (Optional)
     *
     * @param customer_address
     * @return
     */
    public CreateTokenRequest withCustomerAddress(String customer_address) {
        this.customer_address = customer_address;

        return this;
    }

    /**
     * Customer company to store (Optional)
     *
     * @return
     */
    public String getCustomerCompany() {
        return customer_company;
    }

    /**
     * Customer company to store (Optional)
     *
     * @param customer_company
     */
    public void setCustomerCompany(String customer_company) {
        this.customer_company = customer_company;
    }

    /**
     * Customer company to store (Optional)
     *
     * @param customer_company
     * @return
     */
    public CreateTokenRequest withCustomerCompany(String customer_company) {
        this.customer_company = customer_company;

        return this;
    }

    /**
     * Customer suburb to store (Optional)
     *
     * @return
     */
    public String getCustomerSuburb() {
        return customer_suburb;
    }

    /**
     * Customer suburb to store (Optional)
     *
     * @param customer_suburb
     */
    public void setCustomerSuburb(String customer_suburb) {
        this.customer_suburb = customer_suburb;
    }

    /**
     * Customer suburb to store (Optional)
     *
     * @param customer_suburb
     * @return
     */
    public CreateTokenRequest withCustomerSuburb(String customer_suburb) {
        this.customer_suburb = customer_suburb;

        return this;
    }

    /**
     * Customer city to store (Optional)
     *
     * @return
     */
    public String getCustomerCity() {
        return customer_city;
    }

    /**
     * Customer city to store (Optional)
     *
     * @param customer_city
     */
    public void setCustomerCity(String customer_city) {
        this.customer_city = customer_city;
    }

    /**
     * Customer city to store (Optional)
     *
     * @param customer_city
     * @return
     */
    public CreateTokenRequest withCustomerCity(String customer_city) {
        this.customer_city = customer_city;

        return this;
    }

    /**
     * Customer state to store (Optional)
     *
     * @return
     */
    public String getCustomerState() {
        return customer_state;
    }

    /**
     * Customer state to store (Optional)
     *
     * @param customer_state
     */
    public void setCustomerState(String customer_state) {
        this.customer_state = customer_state;
    }

    /**
     * Customer state to store (Optional)
     *
     * @param customer_state
     * @return
     */
    public CreateTokenRequest withCustomerState(String customer_state) {
        this.customer_state = customer_state;

        return this;
    }

    /**
     * Customer country to store (Optional)
     *
     * @return
     */
    public String getCustomerCountry() {
        return customer_country;
    }

    /**
     * Customer country to store (Optional)
     *
     * @param customer_country
     */
    public void setCustomerCountry(String customer_country) {
        this.customer_country = customer_country;
    }

    /**
     * Customer country to store (Optional)
     *
     * @param customer_country
     * @return
     */
    public CreateTokenRequest withCustomerCountry(String customer_country) {
        this.customer_country = customer_country;

        return this;
    }

    /**
     * Customer date of birth in the format of yyyy-mm-dd to store (Optional)
     *
     * @return
     */
    public String getCustomerDateOfBirth() {
        return customer_date_of_birth;
    }

    /**
     * Customer date of birth in the format of yyyy-mm-dd to store (Optional)
     *
     * @param customer_date_of_birth
     */
    public void setCustomerDateOfBirth(String customer_date_of_birth) {
        this.customer_date_of_birth = customer_date_of_birth;
    }

    /**
     * Customer date of birth in the format of yyyy-mm-dd to store (Optional)
     *
     * @param customer_date_of_birth
     * @return
     */
    public CreateTokenRequest withCustomerDateOfBirth(String customer_date_of_birth) {
        this.customer_date_of_birth = customer_date_of_birth;

        return this;
    }

    /**
     * Customer social security number to store (Optional)
     *
     * @return
     */
    public String getCustomerSocialSecurityNumber() {
        return customer_social_security_number;
    }

    /**
     * Customer social security number to store (Optional)
     *
     * @param customer_social_security_number
     */
    public void setCustomerSocialSecurityNumber(String customer_social_security_number) {
        this.customer_social_security_number = customer_social_security_number;
    }

    /**
     * Customer social security number to store (Optional)
     *
     * @param customer_social_security_number
     * @return
     */
    public CreateTokenRequest withCustomerSocialSecurityNumber(String customer_social_security_number) {
        this.customer_social_security_number = customer_social_security_number;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new LinkedHashMap();

        BaseRequest.addIfhasValue("card_number", card_number, params);
        BaseRequest.addIfhasValue("card_expiry", card_expiry, params);
        BaseRequest.addIfhasValue("name_on_card", name_on_card, params);
        BaseRequest.addIfhasValue("card_security_code", card_security_code, params);
        BaseRequest.addIfhasValue("customer_email", customer_email, params);
        BaseRequest.addIfhasValue("customer_address", customer_address, params);
        BaseRequest.addIfhasValue("customer_company", customer_company, params);
        BaseRequest.addIfhasValue("customer_suburb", customer_suburb, params);
        BaseRequest.addIfhasValue("customer_city", customer_city, params);
        BaseRequest.addIfhasValue("customer_state", customer_state, params);
        BaseRequest.addIfhasValue("customer_country", customer_country, params);
        BaseRequest.addIfhasValue("customer_date_of_birth", customer_date_of_birth, params);
        BaseRequest.addIfhasValue("customer_social_security_number", customer_social_security_number, params);

        return params;
    }

    @Override
    public String url() {
        return "https://api.swipehq.com/createToken.php";
    }

}
