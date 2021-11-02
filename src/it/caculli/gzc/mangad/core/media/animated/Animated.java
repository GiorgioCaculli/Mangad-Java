package it.caculli.gzc.mangad.core.media.animated;

import it.caculli.gzc.mangad.core.media.Media;

public abstract class Animated extends Media implements IAnimated
{
    public Animated( String title )
    {
        super( title );
    }

    public abstract Animated clone();
}
