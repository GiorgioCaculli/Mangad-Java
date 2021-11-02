package it.caculli.gzc.mangad.core.media.textual;

import it.caculli.gzc.mangad.core.Validator;
import it.caculli.gzc.mangad.core.media.Media;

public abstract class Series extends Media implements ISeries
{
    private final Validator validator;

    public Series( String title )
    {
        super( title );
        validator = new Validator();
    }

    public Validator getValidator()
    {
        return validator;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( getTitle() ).append( LINE_SEPARATOR );
        for( Volume volume : getVolumes() )
        {
            sb.append( volume ).append( LINE_SEPARATOR );
        }
        return sb.toString();
    }
}
