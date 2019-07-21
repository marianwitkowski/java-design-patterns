package pl.marianwitkowski.session;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Session {

    private Map<String, String> data = new HashMap<>();
    private String token;

    public Session() {
        token = UUID.randomUUID().toString().replace("-","").toUpperCase();
    }

    public void set(String key, String value) {
            data.put(key, value);
    }

    public String get(String key) {
        return data.getOrDefault(key, "");
    }

    public String getToken() {
        return token;
    }

}
