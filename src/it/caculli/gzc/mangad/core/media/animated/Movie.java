package it.caculli.gzc.mangad.core.media.animated;

import java.io.Serializable;

public class Movie extends Animated implements Serializable
{
    public Movie( String title )
    {
        super( title );
    }

    @Override
    public Movie clone()
    {
        return new Movie( getTitle() );
    }
}
