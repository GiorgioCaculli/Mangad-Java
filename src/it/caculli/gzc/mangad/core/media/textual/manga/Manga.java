package it.caculli.gzc.mangad.core.media.textual.manga;

import it.caculli.gzc.mangad.core.media.textual.Volume;

import java.io.Serializable;

public class Manga extends Volume implements Serializable
{

    public Manga( String title, short volumeNumber, String isbn10, String isbn13 )
    {
        super( title, volumeNumber, isbn10, isbn13 );
    }

    @Override
    public Manga clone()
    {
        return new Manga( getTitle(), getVolumeNumber(), getISBN10(), getISBN13() );
    }

    @Override
    public boolean equals( Object o )
    {
        return super.equals( o );
    }
}
