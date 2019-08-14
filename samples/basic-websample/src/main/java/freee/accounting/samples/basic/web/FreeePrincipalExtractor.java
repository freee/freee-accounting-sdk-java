package freee.accounting.samples.basic.web;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

public class FreeePrincipalExtractor implements PrincipalExtractor {

    @Override
    @SuppressWarnings("unchecked")
    public Object extractPrincipal(Map<String, Object> map) {
        Map<String, ?> user = (Map<String, ?>) map.get("user");
        return user.get("last_name") + " " + user.get("first_name");
    }
}