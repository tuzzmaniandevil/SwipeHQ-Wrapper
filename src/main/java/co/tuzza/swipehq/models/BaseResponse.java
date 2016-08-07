package co.tuzza.swipehq.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author dylan
 * @param <T>
 */
public abstract class BaseResponse<T> {

    @JsonProperty("response_code")
    private String responseCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private T data;

    /**
     * Integer value indicating the status of the API call
     *
     * @return
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Text value describing the response code
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
