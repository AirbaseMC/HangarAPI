package net.laxwashere.spigot;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import net.laxwashere.spigot.authors.Author;
import net.laxwashere.spigot.resources.Category;
import net.laxwashere.spigot.resources.Resource;
import net.laxwashere.spigot.resources.Updates;
import net.laxwashere.spigot.web.Query;

import java.util.List;

public class SpigotAPI {

    private static final Query query = new Query();

    private static final String GET_AUTHOR_ENDPOINT = "https://api.spigotmc.org/simple/0.2/index.php?action=getAuthor&id=";
    private static final String GET_RESOURCE_ENDPOINT = "https://api.spigotmc.org/simple/0.2/index.php?action=getResource&id=";
    private static final String GET_AUTHORRESOURCES_ENDPOINT = "https://api.spigotmc.org/simple/0.2/index.php?action=getResourcesByAuthor&id=";
    private static final String GET_RESOURCEUPDATES_ENDPOINT = "https://api.spigotmc.org/simple/0.2/index.php?action=getResourceUpdates&id=";
    private static final String GET_CATEGORY_LIST_ENDPOINT = "https://api.spigotmc.org/simple/0.2/index.php?action=listResourceCategories";

    public static Author getAuthor(String authorId) {
        return new Gson().fromJson(query.query(GET_AUTHOR_ENDPOINT+authorId), Author.class);
    }

    public static Resource getResource(String resourceId) {
        return new Gson().fromJson(query.query(GET_RESOURCE_ENDPOINT +resourceId), Resource.class);
    }

    public static List<Resource> getResourcesByAuthor(String authorId) {
        return new Gson().fromJson(query.query(GET_AUTHORRESOURCES_ENDPOINT +authorId), new TypeToken<List<Resource>>(){}.getType());
    }

    public static List<Updates> getResourceUpdates(String resourceId) {
        return new Gson().fromJson(query.query(GET_RESOURCEUPDATES_ENDPOINT +resourceId), new TypeToken<List<Updates>>(){}.getType());
    }

    public static List<Category> getCategoryList() {
        return new Gson().fromJson(query.query(GET_CATEGORY_LIST_ENDPOINT), new TypeToken<List<Category>>(){}.getType());
    }

}
