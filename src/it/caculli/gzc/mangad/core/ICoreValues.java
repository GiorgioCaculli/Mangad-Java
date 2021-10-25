package it.caculli.gzc.mangad.core;

import java.util.ResourceBundle;

public interface ICoreValues
{
    String LINE_SEPARATOR = System.getProperty( "line.separator" );
    ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle( "it.caculli.gzc.mangad.res.strings" );
}
