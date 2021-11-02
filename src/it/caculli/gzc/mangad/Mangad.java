package it.caculli.gzc.mangad;

import it.caculli.gzc.mangad.core.media.textual.lightnovel.LightNovel;
import it.caculli.gzc.mangad.core.media.textual.lightnovel.LightNovelSeries;
import it.caculli.gzc.mangad.core.media.textual.manga.Manga;
import it.caculli.gzc.mangad.core.media.textual.manga.MangaSeries;
import it.caculli.gzc.mangad.core.person.Author;
import it.caculli.gzc.mangad.gui.MainFrame;

import javax.swing.SwingUtilities;
import java.time.LocalDate;

public class Mangad
{
    public static void main( String[] args )
    {
        System.out.println( "Mangad by Giorgio Caculli" );

        Author author1 = new Author( "Giorgio", "Caculli", LocalDate.of( 1996, 12, 1 ) );

        Manga m1 = new Manga( "Test Manga 1", ( short ) 1, "1234567890", "9781234567890" );
        Manga m2 = new Manga( "Test Manga 2", ( short ) 2, "0987654321", "9780987654321" );
        LightNovel ln1 = new LightNovel( "Test Light Novel 1", ( short ) 1, "1234567890", "9781234567890" );
        LightNovel ln2 = new LightNovel( "Test Light Novel 2", ( short ) 2, "0987654321", "9780987654321" );

        MangaSeries mangaSeries = new MangaSeries( "Test Manga Series" );
        LightNovelSeries lightNovelSeries = new LightNovelSeries( "Test Light Novel Series" );

        System.out.println( mangaSeries.addVolume( m1 ) );
        System.out.println( lightNovelSeries.addVolume( ln1 ) );
        System.out.println( mangaSeries.addVolume( ln2 ) );
        System.out.println( lightNovelSeries.addVolume( m2 ) );
        System.out.println( mangaSeries.addVolume( m1.clone() ) );
        System.out.println( lightNovelSeries.addVolume( ln1.clone() ) );

        author1.addMedia( mangaSeries );
        author1.addMedia( lightNovelSeries );

        System.out.println( author1 );

        SwingUtilities.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                new MainFrame();
            }
        } );
    }
}
