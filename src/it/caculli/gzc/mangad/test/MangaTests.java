package it.caculli.gzc.mangad.test;

import it.caculli.gzc.mangad.core.media.textual.manga.Manga;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MangaTests
{
    static Manga m1, m2;

    @BeforeAll
    static void initAll()
    {
        m1 = new Manga( "One Punch Man", ( short ) 1, "1234567890", "9781234567890" );
        m2 = m1.clone();
    }

    @AfterAll
    static void tearDownAll()
    {
        m1 = null;
        m2 = null;
    }

    @BeforeEach
    void init()
    {
    }

    @Test
    void assertMangaAreEqual()
    {
        assertEquals( m2, m1, "Mangas are not equal" );
    }

    @AfterEach
    void tearDown()
    {
    }
}
