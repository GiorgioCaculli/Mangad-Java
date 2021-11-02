package it.caculli.gzc.mangad.core.media.textual.manga;

import it.caculli.gzc.mangad.core.media.textual.Series;
import it.caculli.gzc.mangad.core.media.textual.Volume;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MangaSeries extends Series implements Serializable
{
    private final List< Manga > mangas;

    public MangaSeries( String title )
    {
        super( title );
        mangas = new ArrayList<>();
    }

    @Override
    public MangaSeries clone()
    {
        MangaSeries tmpMangaSeries = new MangaSeries( getTitle() );
        for ( int i = 0; i < getVolumes().size(); i++ )
        {
            tmpMangaSeries.addVolume( mangas.get( i ).clone() );
        }
        return tmpMangaSeries;
    }

    @Override
    public boolean addVolume( Volume volume )
    {
        if( volume == null )
        {
            return false;
        }
        if ( volume instanceof Manga )
        {
            if( mangas.contains( volume ) )
            {
                return false;
            }
            return mangas.add( ( Manga ) volume );
        }
        return false;
    }

    @Override
    public boolean removeVolume( Volume volume )
    {
        if ( volume instanceof Manga )
        {
            return mangas.remove( volume );
        }
        return false;
    }

    @Override
    public List< Volume > getVolumes()
    {
        List< Volume > tmpMangas = new ArrayList<>();
        for ( Manga manga : mangas )
        {
            tmpMangas.add( manga.clone() );
        }
        return tmpMangas;
    }
}
