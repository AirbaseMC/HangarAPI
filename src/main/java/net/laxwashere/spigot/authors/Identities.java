package net.laxwashere.spigot.authors;

import java.util.Map;

public class Identities {

    private Map<String, String> identities;

    public String getIdentity(String service) {
        return identities.get(service);
    }

    public Map<String, String> getAll() {
        return identities;
    }
}
