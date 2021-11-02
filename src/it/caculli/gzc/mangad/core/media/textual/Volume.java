package it.caculli.gzc.mangad.core.media.textual;

import it.caculli.gzc.mangad.core.media.Media;

public abstract class Volume extends Media implements ITextual
{
    private final String isbn10;
    private final String isbn13;
    private final short volumeNumber;

    public Volume( String title, short volumeNumber, String isbn10, String isbn13 )
    {
        super( title );
        this.volumeNumber = volumeNumber;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
    }

    public short getVolumeNumber()
    {
        return volumeNumber;
    }

    public String getISBN10()
    {
        return isbn10;
    }

    public String getISBN13()
    {
        return isbn13;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( o instanceof Volume )
        {
            Volume tmpVolume = ( Volume ) o;
            return isbn10.equalsIgnoreCase( tmpVolume.isbn10 ) ||
                    isbn13.equalsIgnoreCase( tmpVolume.isbn13 );
        }
        return false;
    }

    @Override
    public abstract Volume clone();

    @Override
    public String toString()
    {
        return String.format( "%sVolume number: %d - ISBN-10: %s - ISBN-13: %s",
                super.toString(), volumeNumber, isbn10, isbn13 );
    }
}
