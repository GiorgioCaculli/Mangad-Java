package it.caculli.gzc.mangad.core;

import it.caculli.gzc.mangad.core.media.Media;
import it.caculli.gzc.mangad.core.media.animated.Season;
import it.caculli.gzc.mangad.core.media.textual.Series;

import java.util.ArrayList;
import java.util.List;

public class Library
{
    private final List< Media > allMedias;
    private final List< Series > allSeries;
    private final List< Season > allAnimated;
    private final Validator validator;

    public Library()
    {
        allMedias = new ArrayList<>();
        allSeries = new ArrayList<>();
        allAnimated = new ArrayList<>();
        validator = new Validator();
    }

    public boolean addSeries( Series series )
    {
        if ( validator.isInList( allSeries, series ) )
        {
            return false;
        }
        return allSeries.add( series );
    }

    public boolean addAnimation( Season season )
    {
        if ( validator.isInList( allAnimated, season ) )
        {
            return false;
        }
        return allAnimated.add( season );
    }

    public List< Media > getAllMedias()
    {
        for ( Media media : allSeries )
        {
            allMedias.add( media.clone() );
        }
        for ( Media media : allAnimated )
        {
            allMedias.add( media.clone() );
        }
        return allMedias;
    }
}
