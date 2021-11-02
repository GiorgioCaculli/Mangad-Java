package it.caculli.gzc.mangad.core.media.textual.lightnovel;

import it.caculli.gzc.mangad.core.media.textual.Series;
import it.caculli.gzc.mangad.core.media.textual.Volume;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LightNovelSeries extends Series implements Serializable
{
    private final List< LightNovel > lightNovels;

    public LightNovelSeries( String title )
    {
        super( title );
        lightNovels = new ArrayList<>();
    }

    @Override
    public LightNovelSeries clone()
    {
        LightNovelSeries tmpLightNovelSeries = new LightNovelSeries( getTitle() );
        for ( int i = 0; i < getVolumes().size(); i++ )
        {
            tmpLightNovelSeries.addVolume( lightNovels.get( i ).clone() );
        }
        return tmpLightNovelSeries;
    }

    @Override
    public boolean addVolume( Volume volume )
    {
        if( volume == null )
        {
            return false;
        }
        if ( volume instanceof LightNovel )
        {
            if( lightNovels.contains( volume ) )
            {
                return false;
            }
            return lightNovels.add( ( LightNovel ) volume );
        }
        return false;
    }

    @Override
    public boolean removeVolume( Volume volume )
    {
        if ( volume instanceof LightNovel )
        {
            return lightNovels.remove( volume );
        }
        return false;
    }

    @Override
    public List< Volume > getVolumes()
    {
        List< Volume > tmpLightNovels = new ArrayList<>();
        for ( LightNovel lightNovel : lightNovels )
        {
            tmpLightNovels.add( lightNovel.clone() );
        }
        return tmpLightNovels;
    }
}
