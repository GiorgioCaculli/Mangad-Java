package it.caculli.gzc.mangad.test;

import it.caculli.gzc.mangad.core.media.textual.lightnovel.LightNovel;
import it.caculli.gzc.mangad.core.media.textual.lightnovel.LightNovelSeries;
import it.caculli.gzc.mangad.core.media.textual.manga.Manga;
import it.caculli.gzc.mangad.core.media.textual.manga.MangaSeries;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SeriesTests
{
    static MangaSeries mangaSeries;
    static LightNovelSeries lightNovelSeries;
    static Manga m1, m2;
    static LightNovel ln1, ln2;

    @BeforeAll
    static void initAll()
    {
        mangaSeries = new MangaSeries( "Test Manga Series" );
        lightNovelSeries = new LightNovelSeries( "Test Light Novel Series" );
        m1 = new Manga( "Test Manga", ( short ) 1, "1234567890", "9781234567890" );
        m2 = new Manga( "Test Manga", ( short ) 1, "0987654321", "9780987654321" );
        ln1 = new LightNovel( "Test Light Novel", ( short ) 1, "1234567891", "9781234567891" );
        ln2 = new LightNovel( "Test Light Novel", ( short ) 1, "0987654321", "9780987654321" );
    }

    @AfterAll
    static void tearDownAll()
    {
        mangaSeries = null;
        lightNovelSeries = null;
    }

    @BeforeEach
    void init()
    {
    }

    @Test
    void assertAddVolumeSeries()
    {
        assertTrue( () -> mangaSeries.addVolume( m1 ), "Manga not added" );
        assertTrue( () -> lightNovelSeries.addVolume( ln1 ), "Light novel not added" );
    }

    @Test
    void assertAddVolumeInWrongSeries()
    {
        assertFalse( () -> lightNovelSeries.addVolume( m2 ), "Manga was added among light novels" );
        assertFalse( () -> mangaSeries.addVolume( ln2 ), "Light novel was added among mangas" );
    }

    @Test
    void assertAddDuplicateVolume()
    {
        assertFalse( () -> mangaSeries.addVolume( m1.clone() ), "Duplicate manga was added to library" );
        assertFalse( () -> lightNovelSeries.addVolume( ln1.clone() ), "Duplicate light novel was added to library" );
    }

    @AfterEach
    void tearDown()
    {
    }
}
