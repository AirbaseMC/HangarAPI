package net.laxwashere.spigot.authors;

public class Author {

    private String id;
    private String username;
    private int resource_count;

    private Identities identities;
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

    public Identities getIdentities() {
        return identities;
    }

    public String getAvatar() {
        return avatar;
    }
}
