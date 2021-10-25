package it.caculli.gzc.mangad.core.media.manga;

import it.caculli.gzc.mangad.core.media.IMedia;
import it.caculli.gzc.mangad.core.media.Series;

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
        for( int i = 0; i < getAll().size(); i++ )
        {
            tmpMangaSeries.add( mangas.get( i ).clone() );
        }
        return tmpMangaSeries;
    }

    @Override
    public boolean add( IMedia media )
    {
        if( media instanceof Manga )
        {
            return mangas.add( ( Manga ) media );
        }
        return false;
    }

    @Override
    public boolean remove( IMedia media )
    {
        if( media instanceof Manga )
        {
            return mangas.remove( media );
        }
        return false;
    }

    @Override
    public List< IMedia > getAll()
    {
        List< IMedia > tmpMangas = new ArrayList<>();
        for ( Manga manga : mangas )
        {
            tmpMangas.add( manga.clone() );
        }
        return tmpMangas;
    }
}
