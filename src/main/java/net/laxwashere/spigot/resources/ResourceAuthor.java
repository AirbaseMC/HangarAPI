package net.laxwashere.spigot.resources;

import net.laxwashere.spigot.SpigotAPI;
import net.laxwashere.spigot.authors.Author;

public class ResourceAuthor {

    private String id;
    private String username;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Author getAsAuthor() {
        return SpigotAPI.getAuthor(this.id);
    }
}
