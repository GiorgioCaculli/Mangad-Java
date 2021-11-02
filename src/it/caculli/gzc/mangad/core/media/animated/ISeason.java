package it.caculli.gzc.mangad.core.media.animated;

import java.util.List;

public interface ISeason extends IAnimated
{
    boolean addAnimation( Animated animated );

    boolean removeAnimation( Animated animated );

    List< Animated > getAnimations();

    int getNumberOfEpisodes();
}
