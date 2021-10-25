package it.caculli.gzc.mangad.core.media.anime;

import it.caculli.gzc.mangad.core.media.IMedia;
import it.caculli.gzc.mangad.core.media.Season;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AnimatedSeason extends Season implements Serializable
{
    private List< Animated > animations;
    public AnimatedSeason( String title )
    {
        super( title );
        animations = new ArrayList<>();
    }

    @Override
    public AnimatedSeason clone()
    {
        return null;
    }

    @Override
    public boolean add( IMedia media )
    {
        if( media instanceof Animated )
        {
            return animations.add( ( Animated ) media );
        }
        return false;
    }

    @Override
    public boolean remove( IMedia media )
    {
        if( media instanceof Animated )
        {
            return animations.remove( media );
        }
        return false;
    }

    @Override
    public List< IMedia > getAll()
    {
        List< IMedia > tmpAnimations = new ArrayList<>();
        for( Animated media : animations )
        {
            tmpAnimations.add( ( IMedia ) media );
        }
        return tmpAnimations;
    }
}
