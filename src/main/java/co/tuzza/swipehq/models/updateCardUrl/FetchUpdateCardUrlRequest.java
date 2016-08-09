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
package co.tuzza.swipehq.models.updateCardUrl;

import co.tuzza.swipehq.models.BaseRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The fetchUpdateCardUrl API is used to return the url of a page that a user
 * can use to update their credit card details. The API authenticates with
 * merchant_id and API key, and loads the subscribers data based off a
 * contract_id that must be passed in.
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class FetchUpdateCardUrlRequest implements BaseRequest {

    private String contract_id;
    private Boolean auto_resume;

    /**
     * The contract ID of the user's subscription (Compulsory)
     *
     * @return
     */
    public String getContractId() {
        return contract_id;
    }

    /**
     * The contract ID of the user's subscription (Compulsory)
     *
     * @param contract_id
     */
    public void setContractId(String contract_id) {
        this.contract_id = contract_id;
    }

    /**
     * The contract ID of the user's subscription (Compulsory)
     *
     * @param contract_id
     * @return
     */
    public FetchUpdateCardUrlRequest withContractId(String contract_id) {
        this.contract_id = contract_id;

        return this;
    }

    /**
     * Auto resume subscription if user successfully updated their credit card
     * details. If not set or value passed is false, auto resume is disabled.
     *
     * @return
     */
    public Boolean getAutoResume() {
        return auto_resume;
    }

    /**
     * Auto resume subscription if user successfully updated their credit card
     * details. If not set or value passed is false, auto resume is disabled.
     *
     * @param auto_resume
     */
    public void setAutoResume(Boolean auto_resume) {
        this.auto_resume = auto_resume;
    }

    /**
     * Auto resume subscription if user successfully updated their credit card
     * details. If not set or value passed is false, auto resume is disabled.
     *
     * @param auto_resume
     * @return
     */
    public FetchUpdateCardUrlRequest withAutoResume(Boolean auto_resume) {
        this.auto_resume = auto_resume;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new LinkedHashMap();

        BaseRequest.addIfhasValue("contract_id", contract_id, params);

        if (auto_resume != null && auto_resume) {
            params.put("auto_resume", "yes");
        }

        return params;
    }

    @Override
    public String url() {
        return "https://api.swipehq.com/fetchUpdateCardUrl.php";
    }

}
