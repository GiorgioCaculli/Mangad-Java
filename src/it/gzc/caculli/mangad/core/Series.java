package it.gzc.caculli.mangad.core;

import java.util.ArrayList;
import java.util.List;

public class Series
{
    private final String title;
    private final String author;
    private final List< Manga > mangas;

    public Series( String title, String author )
    {
        this.title = title;
        this.author = author;
        mangas = new ArrayList< Manga >();
    }
}
