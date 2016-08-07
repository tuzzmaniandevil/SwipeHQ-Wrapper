package co.tuzza.swipehq.models;

import java.util.Map;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author dylan
 */
public interface BaseRequest {

    public static void addIfhasValue(String key, String value, Map<String, String> params) {
        if (StringUtils.isNotBlank(value)) {
            params.put(key, value);
        }
    }

    public Map<String, String> toParams();

    public String url();
}
