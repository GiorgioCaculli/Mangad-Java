package it.caculli.gzc.mangad.core.media.textual.lightnovel;

import it.caculli.gzc.mangad.core.media.textual.Volume;
import it.caculli.gzc.mangad.core.media.textual.manga.Manga;

import java.io.Serializable;

public class LightNovel extends Volume implements Serializable
{
    public LightNovel( String title, short volumeNumber, String isbn10, String isbn13 )
    {
        super( title, volumeNumber, isbn10, isbn13 );
    }

    @Override
    public LightNovel clone()
    {
        return new LightNovel( getTitle(), getVolumeNumber(), getISBN10(), getISBN13() );
    }

    @Override
    public boolean equals( Object o )
    {
        return super.equals( o );
    }
}
