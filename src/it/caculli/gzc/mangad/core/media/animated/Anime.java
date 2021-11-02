package it.caculli.gzc.mangad.core.media.animated;

import java.io.Serializable;

public class Anime extends Animated implements Serializable
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
