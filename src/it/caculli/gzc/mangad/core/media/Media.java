package it.caculli.gzc.mangad.core.media;

import it.caculli.gzc.mangad.core.person.IPerson;

import java.util.ArrayList;
import java.util.List;

public abstract class Media implements IMedia
{
    private String title;
    private List< String > titleAlternatives;
    private List< IPerson > authors;

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

    public List< IPerson > getAuthors()
    {
        return new ArrayList<>( authors );
    }

    @Override
    public boolean equals( Object o )
    {
        if( o instanceof Media )
        {
            Media tmp = ( Media ) o;
            return tmp.title.equalsIgnoreCase( title );
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( String.format( "Title: %s", title ) ).append( LINE_SEPARATOR );
        sb.append( "Alternative titles:" ).append( LINE_SEPARATOR );
        for( String titleAlternative : titleAlternatives )
        {
            sb.append( titleAlternative ).append( LINE_SEPARATOR );
        }
        sb.append( "Authors:" ).append( LINE_SEPARATOR );
        for( IPerson author : authors )
        {
            sb.append( author ).append( LINE_SEPARATOR );
        }
        return sb.toString();
    }

    @Override
    public abstract Media clone();
}
