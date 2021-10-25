package it.caculli.gzc.mangad.core.media.anime;

import java.io.Serializable;

public class Movie extends AnimatedSeason implements Animated, Serializable
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
