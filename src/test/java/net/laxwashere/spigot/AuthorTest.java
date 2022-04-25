package net.laxwashere.spigot;

import net.laxwashere.spigot.authors.Author;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {

    private final Author author;

    public AuthorTest() {
        author = SpigotAPI.getAuthor("106");
    }

    @Test
    public void testAuthor() {
        Assertions.assertEquals("106", author.getId());
        Assertions.assertEquals("LaxWasHere", author.getUsername());
        Assertions.assertEquals(42, author.getResource_count());
    }
}
