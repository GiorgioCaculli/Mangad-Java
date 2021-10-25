package it.caculli.gzc.mangad.core.media.lightnovel;

import java.io.Serializable;

public class LightNovel extends LightNovelSeries implements Serializable
{
    public LightNovel( String title )
    {
        super( title );
    }

    @Override
    public LightNovel clone()
    {
        return new LightNovel( getTitle() );
    }
}
