package net.laxwashere.spigot.resources;

import java.util.Collection;
import java.util.Map;

public class Resource {

    private String id;
    private String title;
    private String tag;

    private String current_version;
    private String native_minecraft_version;
    private String[] supported_minecraft_versions;

    private String icon_link;

    private ResourceAuthor author;
    private Pricing premium;

    private Stats stats;
    private String description;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTag() {
        return tag;
    }

    public String getCurrentVersion() {
        return current_version;
    }

    public String getNativeMinecraftVersion() {
        return native_minecraft_version;
    }

    public String[] getSupportedMinecraftVersions() {
        return supported_minecraft_versions;
    }

    public String getIconLink() {
        return icon_link;
    }

    public ResourceAuthor getResourceAuthor() {
        return author;
    }

    public Boolean isPremium() {
        return !(getPricing().getPrice() == 0.00);
    }

    public Pricing getPricing() {
        return premium;
    }

    public Stats getStats() {
        return stats;
    }

    public String getDescription() {
        return description;
    }
}
