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
package co.tuzza.swipehq.transport;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 *
 * @author Wesley <wesley@tuzza.co>
 */
public class ResponseParser {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T parseResponse(String responseBody, Class<T> responseClass) throws IOException {
        T o = mapper.readValue(responseBody, responseClass);

        return o;
    }
}