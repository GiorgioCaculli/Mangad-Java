package it.caculli.gzc.mangad.core;

import it.caculli.gzc.mangad.core.media.Media;

import java.util.List;

public class Validator
{
    public Validator()
    {
    }

    public boolean isInList( List< ? extends Media > list, Media media )
    {
        if ( list == null || media == null )
        {
            return true;
        }
        return list.contains( media );
    }
}
