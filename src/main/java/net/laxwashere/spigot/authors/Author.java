package net.laxwashere.spigot.authors;

import java.util.Map;

public class Author {

    private String id;
    private String username;
    private int resource_count;

    private Map<String, String> identities;
    private String avatar;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getResource_count() {
        return resource_count;
    }

    public String getIdentity(String service) {
        return identities.get(service);
    }

    public Map<String, String> getAll() {
        return identities;
    }

    public String getAvatar() {
        return avatar;
    }
}
