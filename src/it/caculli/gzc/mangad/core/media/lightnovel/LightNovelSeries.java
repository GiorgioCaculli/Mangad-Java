package it.caculli.gzc.mangad.core.media.lightnovel;

import it.caculli.gzc.mangad.core.media.IMedia;
import it.caculli.gzc.mangad.core.media.Series;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LightNovelSeries extends Series implements Serializable
{
    private List< LightNovel > lightNovels;
    public LightNovelSeries( String title )
    {
        super( title );
        lightNovels = new ArrayList<>();
    }

    @Override
    public LightNovelSeries clone()
    {
        LightNovelSeries tmpLightNovelSeries = new LightNovelSeries( getTitle() );
        for( int i = 0; i < getAll().size(); i++ )
        {
            tmpLightNovelSeries.add( lightNovels.get( i ).clone() );
        }
        return tmpLightNovelSeries;
    }

    @Override
    public boolean add( IMedia media )
    {
        if( media instanceof LightNovel )
        {
            lightNovels.add( ( LightNovel ) media );
        }
        return false;
    }

    @Override
    public boolean remove( IMedia media )
    {
        if( media instanceof LightNovel )
        {
            lightNovels.remove( media );
        }
        return false;
    }

    @Override
    public List< IMedia > getAll()
    {
        List< IMedia > tmpLightNovels = new ArrayList<>();
        for( LightNovel lightNovel : lightNovels )
        {
            tmpLightNovels.add( lightNovel.clone() );
        }
        return tmpLightNovels;
    }
}
