package it.caculli.gzc.mangad.core.media.textual;

public interface ITextual
{
    short getVolumeNumber();

    String getISBN10();

    String getISBN13();

    ITextual clone();
}
