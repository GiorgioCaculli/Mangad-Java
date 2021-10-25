package it.caculli.gzc.mangad.core.media.anime;

import java.io.Serializable;

public class Anime extends AnimatedSeason implements Animated, Serializable
{
    public Anime( String title )
    {
        super( title );
    }

    @Override
    public Anime clone()
    {
        return new Anime( getTitle() );
    }
}
