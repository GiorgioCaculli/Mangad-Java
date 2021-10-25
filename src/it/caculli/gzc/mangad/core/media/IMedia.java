package it.caculli.gzc.mangad.core.media;

import it.caculli.gzc.mangad.core.ICoreValues;

import java.util.List;

public interface IMedia extends ICoreValues
{
    boolean add( IMedia media );
    boolean remove( IMedia media );
    List< IMedia > getAll();
    Media clone();
}
