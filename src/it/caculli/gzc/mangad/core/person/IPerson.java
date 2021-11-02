package it.caculli.gzc.mangad.core.person;

import it.caculli.gzc.mangad.core.ICoreValues;
import it.caculli.gzc.mangad.core.media.Media;

import java.util.List;

public interface IPerson extends ICoreValues
{
    boolean addMedia( Media media );

    boolean removeMedia( Media media );

    List< Media > getMedias();
}
