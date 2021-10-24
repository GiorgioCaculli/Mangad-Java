package it.gzc.caculli.mangad.core;

import java.util.ArrayList;
import java.util.List;

public abstract class Media
{
    private String title;
    private List< String > titleAlternatives;
    private List< String > authors;

    public Media( String title )
    {
        this.title = title;
        titleAlternatives = new ArrayList<>();
        authors = new ArrayList<>();
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public List< String > getTitleAlternatives()
    {
        return new ArrayList<>( titleAlternatives );
    }

    public List< String > getAuthors()
    {
        return new ArrayList<>( authors );
    }

    public boolean equals( Object o )
    {
        if( o instanceof Media )
        {
            Media tmp = ( Media ) o;
            return tmp.title.equalsIgnoreCase( title );
        }
        return false;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( String.format( "Title: %s", title ) ).append( System.getProperty( "line.separator" ) );
        sb.append( "Alternative titles:" ).append( System.getProperty( "line.separator" ) );
        for( String s : titleAlternatives )
        {
            sb.append( s ).append( System.getProperty( "line.separator" ) );
        }
        sb.append( "Authors:" ).append( System.getProperty( "line.separator" ) );
        return sb.toString();
    }
}
