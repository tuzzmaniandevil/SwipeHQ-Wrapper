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
import java.util.HashMap;
import java.util.Map;

/**
 * The FetchProducts API is very useful for updating the calling server with a
 * full or filter list of products. Each search has the option of refining the
 * results through the use of the search_by (column name) and keyword (row
 * value).
 *
 * @author Wesley
 */
public class FetchProductsRequest implements BaseRequest {

    private String search_by;
    private String keyword;

    /**
     * The field you want to search by, this can such things as the product_id,
     * prod_description or prod_name. A full list of these can be found in
     * <a href="https://www.swipehq.co.nz/support/support_detail.php?cat=Developers&title=Creating+Products">Creating
     * Products</a>.
     *
     * @return
     */
    public String getSearchBy() {
        return search_by;
    }

    /**
     * The field you want to search by, this can such things as the product_id,
     * prod_description or prod_name. A full list of these can be found in
     * <a href="https://www.swipehq.co.nz/support/support_detail.php?cat=Developers&title=Creating+Products">Creating
     * Products</a>.
     *
     * @param search_by
     */
    public void setSearchBy(String search_by) {
        this.search_by = search_by;
    }

    /**
     * The field you want to search by, this can such things as the product_id,
     * prod_description or prod_name. A full list of these can be found in
     * <a href="https://www.swipehq.co.nz/support/support_detail.php?cat=Developers&title=Creating+Products">Creating
     * Products</a>.
     *
     * @param search_by
     * @return
     */
    public FetchProductsRequest withSearchBy(String search_by) {
        this.search_by = search_by;

        return this;
    }

    /**
     * The value of the field that is needing to be searched. Such examples of
     * this can be 'Awesome Product' for the prod_name field or alternatively
     * '1958DC65E77902' for product_id.
     *
     * @return
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * The value of the field that is needing to be searched. Such examples of
     * this can be 'Awesome Product' for the prod_name field or alternatively
     * '1958DC65E77902' for product_id.
     *
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * The value of the field that is needing to be searched. Such examples of
     * this can be 'Awesome Product' for the prod_name field or alternatively
     * '1958DC65E77902' for product_id.
     *
     * @param keyword
     * @return
     */
    public FetchProductsRequest withKeyword(String keyword) {
        this.keyword = keyword;

        return this;
    }

    @Override
    public Map<String, String> toParams() {
        Map<String, String> params = new HashMap();

        BaseRequest.addIfhasValue("search_by", search_by, params);
        BaseRequest.addIfhasValue("keyword", keyword, params);

        return params;
    }

    @Override
    public String url() {
        return "https://api.swipehq.com/fetchProducts.php";
    }

}
