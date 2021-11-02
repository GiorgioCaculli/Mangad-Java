package it.caculli.gzc.mangad.core.media.textual;

import it.caculli.gzc.mangad.core.media.IMedia;

import java.util.List;

public interface ISeries extends IMedia
{
    boolean addVolume( Volume volume );

    boolean removeVolume( Volume volume );

    List< Volume > getVolumes();
}
