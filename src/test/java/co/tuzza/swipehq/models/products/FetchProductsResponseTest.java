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

import co.tuzza.swipehq.transport.ResponseParser;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class FetchProductsResponseTest {

    public FetchProductsResponseTest() {
    }

    @Test
    public void testSomeMethod() throws IOException {
        String json = "{\"response_code\":200,\"message\":\"OK\",\"data\":{\"0\":{\"prod_accepted_url\":\"http://www.hivtest.co.nz/thanks/\",\"prod_attribute\":\"\",\"prod_button_code\":\"0\",\"prod_button_type\":\"input\",\"prod_category\":\"\",\"prod_declined_url\":\"http://www.hivtest.co.nz/declined/\",\"prod_description\":\"This test is a single use, rapid device intended for qualitative detection of antibodies to HIV 1+2 in whole blood and serum or plasma samples.\",\"prod_detail\":\"\",\"prod_feature\":\"\",\"prod_image\":\"1248AF262A7BC2_1464668203.jpeg\",\"prod_keyword\":\"\",\"prod_last_updated\":\"1464668203\",\"prod_mcid\":\"124444B867A98B\",\"prod_minimum_purchase\":\"1\",\"prod_name\":\"One Step HIV 1+2 Test Kit (Inc NZ Shipping) Passed sell-by date\",\"prod_rrp\":\"10\",\"prod_sale_price\":\"10\",\"prod_shipping\":\"\",\"prod_status\":\"active\",\"prod_stock\":\"\",\"prod_stock_enabled\":\"no\",\"prod_tnc\":\"\",\"product_id\":\"1248AF262A7BC2\"},\"1\":{\"prod_accepted_url\":\"http://www.hivtest.co.nz/thanks/\",\"prod_attribute\":\"\",\"prod_button_code\":\"0\",\"prod_button_type\":\"input\",\"prod_category\":\"\",\"prod_declined_url\":\"http://www.hivtest.co.nz/declined/\",\"prod_description\":\"This test is a single use, rapid device intended for qualitative detection of antibodies to HIV 1+2 in whole blood and serum or plasma samples. \",\"prod_detail\":\"\",\"prod_feature\":\"\",\"prod_image\":\"79BF49F60F1C1_1417997852.jpeg\",\"prod_keyword\":\"\",\"prod_last_updated\":\"1456700849\",\"prod_mcid\":\"124444B867A98B\",\"prod_minimum_purchase\":\"1\",\"prod_name\":\"One Step HIV 1+2 Test Kit (Inc NZ wide Shipping)\",\"prod_rrp\":\"35\",\"prod_sale_price\":\"35\",\"prod_shipping\":\"\",\"prod_status\":\"active\",\"prod_stock\":\"\",\"prod_stock_enabled\":\"no\",\"prod_tnc\":\"\",\"product_id\":\"79BF49F60F1C1\"},\"2\":{\"prod_accepted_url\":\"http://www.hivtest.co.nz/thanks/\",\"prod_attribute\":\"\",\"prod_button_code\":\"1\",\"prod_button_type\":\"input\",\"prod_category\":\"\",\"prod_declined_url\":\"http://www.hivtest.co.nz/declined/\",\"prod_description\":\"This five test pack contains five rapid devices intended for qualitative detection of antibodies to HIV 1+2 in whole blood and serum or plasma samples. \\r\\n\\r\\nThe five pack is sold with a 20% discount off the regular single test price. \",\"prod_detail\":\"\",\"prod_feature\":\"\",\"prod_image\":\"15D1EF35A3281B_1417998402.jpeg\",\"prod_keyword\":\"\",\"prod_last_updated\":\"1456700796\",\"prod_mcid\":\"124444B867A98B\",\"prod_minimum_purchase\":\"1\",\"prod_name\":\"One Step HIV 1+2 Test Kit (Five Pack) (INC NZ Shipping)\",\"prod_rrp\":\"105\",\"prod_sale_price\":\"105\",\"prod_shipping\":\"\",\"prod_status\":\"active\",\"prod_stock\":\"\",\"prod_stock_enabled\":\"no\",\"prod_tnc\":\"\",\"product_id\":\"15D1EF35A3281B\"},\"3\":{\"prod_accepted_url\":\"http://www.hivtest.co.nz/thanks/\",\"prod_attribute\":\"\",\"prod_button_code\":\"1\",\"prod_button_type\":\"input\",\"prod_category\":\"\",\"prod_declined_url\":\"http://www.hivtest.co.nz/declined/\",\"prod_description\":\"This double test pack is for re-testing use. It contains two rapid devices intended for qualitative detection of antibodies to HIV 1+2 in whole blood and serum or plasma samples. \\r\\n\\r\\nThe double pack is sold with a 10% discount off the regular single test price. \",\"prod_detail\":\"\",\"prod_feature\":\"\",\"prod_image\":\"11DBEBA395D50_1417998202.jpeg\",\"prod_keyword\":\"\",\"prod_last_updated\":\"1456700722\",\"prod_mcid\":\"124444B867A98B\",\"prod_minimum_purchase\":\"1\",\"prod_name\":\"One Step HIV 1+2 Test Kit (Double Pack) (Inc NZ Shipping)\",\"prod_rrp\":\"54\",\"prod_sale_price\":\"54\",\"prod_shipping\":\"\",\"prod_status\":\"active\",\"prod_stock\":\"\",\"prod_stock_enabled\":\"no\",\"prod_tnc\":\"\",\"product_id\":\"11DBEBA395D50\"},\"4\":{\"prod_accepted_url\":\"http://www.hivtest.co.nz/thanks/\",\"prod_attribute\":\"\",\"prod_button_code\":\"1\",\"prod_button_type\":\"input\",\"prod_category\":\"\",\"prod_declined_url\":\"http://www.hivtest.co.nz/declined/\",\"prod_description\":\"This test is a single use, rapid device intended for qualitative detection of antibodies to HIV 1+2 in whole blood and serum or plasma samples. \",\"prod_detail\":\"\",\"prod_feature\":\"\",\"prod_image\":\"15D1EF337E9BF0_1417998022.jpeg\",\"prod_keyword\":\"\",\"prod_last_updated\":\"1456700772\",\"prod_mcid\":\"124444B867A98B\",\"prod_minimum_purchase\":\"1\",\"prod_name\":\"One Step HIV 1+2 Test Kit (Inc NZ Shipping)\",\"prod_rrp\":\"35\",\"prod_sale_price\":\"35\",\"prod_shipping\":\"\",\"prod_status\":\"active\",\"prod_stock\":\"\",\"prod_stock_enabled\":\"no\",\"prod_tnc\":\"\",\"product_id\":\"15D1EF337E9BF0\"},\"5\":{\"prod_accepted_url\":\"http://www.hivtest.co.nz/thanks/\",\"prod_attribute\":\"\",\"prod_button_code\":\"0\",\"prod_button_type\":\"input\",\"prod_category\":\"\",\"prod_declined_url\":\"http://www.hivtest.co.nz/declined/\",\"prod_description\":\"This double test pack is for re-testing use. It contains two rapid devices intended for qualitative detection of antibodies to HIV 1+2 in whole blood and serum or plasma samples. The double pack is sold with a 10% discount off the regular single test price.\",\"prod_detail\":\"\",\"prod_feature\":\"\",\"prod_image\":\"EBB30893E0D01_1464668093.jpeg\",\"prod_keyword\":\"\",\"prod_last_updated\":\"1464668093\",\"prod_mcid\":\"124444B867A98B\",\"prod_minimum_purchase\":\"1\",\"prod_name\":\"One Step HIV 1+2 Test Kit (Double Pack) Passed sell-by date\",\"prod_rrp\":\"15\",\"prod_sale_price\":\"15\",\"prod_shipping\":\"\",\"prod_status\":\"active\",\"prod_stock\":\"\",\"prod_stock_enabled\":\"no\",\"prod_tnc\":\"\",\"product_id\":\"EBB30893E0D01\"},\"6\":{\"prod_accepted_url\":\"http://www.hivtest.co.nz/thanks/\",\"prod_attribute\":\"\",\"prod_button_code\":\"0\",\"prod_button_type\":\"input\",\"prod_category\":\"\",\"prod_declined_url\":\"http://www.hivtest.co.nz/declined/\",\"prod_description\":\"This five test pack contains five rapid devices intended for qualitative detection of antibodies to HIV 1+2 in whole blood and serum or plasma samples. The five pack is sold with a 20% discount off the regular single test price.\",\"prod_detail\":\"\",\"prod_feature\":\"\",\"prod_image\":\"412B49C31F2A7_1464668307.jpeg\",\"prod_keyword\":\"\",\"prod_last_updated\":\"1464668307\",\"prod_mcid\":\"124444B867A98B\",\"prod_minimum_purchase\":\"1\",\"prod_name\":\"One Step HIV 1+2 Test Kit (Five Pack) Passed sell-by date\",\"prod_rrp\":\"20\",\"prod_sale_price\":\"20\",\"prod_shipping\":\"\",\"prod_status\":\"active\",\"prod_stock\":\"\",\"prod_stock_enabled\":\"no\",\"prod_tnc\":\"\",\"product_id\":\"412B49C31F2A7\"}}}";

        FetchProductsResponse parseResponse = ResponseParser.parseResponse(json, FetchProductsResponse.class);

        Assert.assertNotNull(parseResponse);
        Assert.assertEquals(7, parseResponse.getData().getProducts().size());
    }

}
