package it.caculli.gzc.mangad.core.person;

import java.io.Serializable;
import java.time.LocalDate;

public class Author extends Person implements Serializable
{
    public Author( String firstName, String lastName, LocalDate birthDate )
    {
        super( firstName, lastName, birthDate );
    }

    @Override
    public Author clone()
    {
        Author tmpAuthor = new Author( getFirstName(), getLastName(), getBirthDate() );
        for( int i = 0; i < getMedias().size(); i++ )
        {
            tmpAuthor.addMedia( getMedias().get( i ).clone() );
        }
        return tmpAuthor;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
