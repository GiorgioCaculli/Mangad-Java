package it.caculli.gzc.mangad.core.media.animated;

import it.caculli.gzc.mangad.core.media.Media;

public abstract class Season extends Media implements ISeason
{
    public Season( String title )
    {
        super( title );
    }

    @Override
    public abstract Season clone();
}
