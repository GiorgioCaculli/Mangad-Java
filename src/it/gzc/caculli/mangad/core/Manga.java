package it.gzc.caculli.mangad.core;

public class Manga extends Media
{
    private final String isbn10;
    private final String isbn13;
    private final short volumeNumber;

    public Manga( String title, short volumeNumber, String isbn10, String isbn13 )
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

    public boolean equals( Object o )
    {
        if ( o instanceof Manga )
        {
            Manga tmpm = ( Manga ) o;
            return isbn10.equalsIgnoreCase( tmpm.isbn10 ) ||
                    isbn13.equalsIgnoreCase( tmpm.isbn13 );
        }
        return false;
    }

    public Manga clone()
    {
        return new Manga( getTitle(), volumeNumber, isbn10, isbn13 );
    }

    public String toString()
    {
        return String.format( "Volume number: %d - ISBN-10: %s - ISBN-13: %s", volumeNumber, isbn10, isbn13 );
    }
}
