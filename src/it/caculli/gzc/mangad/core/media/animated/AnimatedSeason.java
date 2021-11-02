package it.caculli.gzc.mangad.core.media.animated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AnimatedSeason extends Season implements Serializable
{
    private final List< Animated > animations;

    public AnimatedSeason( String title )
    {
        super( title );
        animations = new ArrayList<>();
    }

    @Override
    public AnimatedSeason clone()
    {
        AnimatedSeason tmpAnimatedSeason = new AnimatedSeason( getTitle() );
        for ( Animated animated : animations )
        {
            tmpAnimatedSeason.addAnimation( animated.clone() );
        }
        return tmpAnimatedSeason;
    }

    @Override
    public boolean addAnimation( Animated animated )
    {
        return animations.add( animated );
    }

    @Override
    public boolean removeAnimation( Animated animated )
    {
        return animations.remove( animated );
    }

    @Override
    public List< Animated > getAnimations()
    {
        List< Animated > tmpAnimations = new ArrayList<>();
        for ( Animated media : animations )
        {
            tmpAnimations.add( media.clone() );
        }
        return tmpAnimations;
    }

    @Override
    public int getNumberOfEpisodes()
    {
        return animations.size();
    }
}
