package net.laxwashere.spigot;

import net.laxwashere.spigot.resources.Resource;
import net.laxwashere.spigot.resources.Updates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResourcesTest {

    Resource resource;
    Updates updates;

    public ResourcesTest() {
        resource = SpigotAPI.getResource("2");
        updates = SpigotAPI.getResourceUpdates("2").get(0);
    }

    @Test
    public void testResource() {
        Assertions.assertEquals("2", resource.getId());
        Assertions.assertEquals("LaxWasHere", resource.getResourceAuthor().getUsername());
        Assertions.assertEquals("HubKick", updates.getTitle());
    }
}
