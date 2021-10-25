package it.caculli.gzc.mangad.core.person;

import it.caculli.gzc.mangad.core.ICoreValues;
import it.caculli.gzc.mangad.core.media.IMedia;

import java.util.List;

public interface IPerson extends ICoreValues
{
    boolean addMedia( IMedia media );
    boolean removeMedia( IMedia media );
    List< IMedia > getMedias();
}
