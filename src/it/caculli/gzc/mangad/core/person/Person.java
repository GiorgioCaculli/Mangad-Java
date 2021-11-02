package it.caculli.gzc.mangad.core.person;

import it.caculli.gzc.mangad.core.media.Media;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Person implements IPerson
{
    private String firstName, lastName;
    private LocalDate birthDate;
    private int age;
    private final List< Media > medias;

    public Person( String firstName, String lastName, LocalDate birthDate )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        medias = new ArrayList<>();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate( LocalDate birthDate )
    {
        this.birthDate = birthDate;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }

    @Override
    public boolean addMedia( Media media )
    {
        return medias.add( media );
    }

    @Override
    public boolean removeMedia( Media media )
    {
        return medias.remove( media );
    }

    @Override
    public List< Media > getMedias()
    {
        List< Media > tmpMedias = new ArrayList<>();
        for ( int i = 0; i < medias.size(); i++ )
        {
            Media tmpMedia = medias.get( i );
            tmpMedias.add( tmpMedia.clone() );
        }
        return tmpMedias;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( o instanceof Person )
        {
            Person tmpPerson = ( Person ) o;
            return firstName.equalsIgnoreCase( tmpPerson.firstName ) &&
                    lastName.equalsIgnoreCase( tmpPerson.lastName ) &&
                    birthDate == tmpPerson.birthDate &&
                    age == tmpPerson.age;
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        String firstNameString = String.format( "%s %s %s",
                RESOURCE_BUNDLE.getString( "person_first_name" ),
                firstName,
                LINE_SEPARATOR
        );
        sb.append( firstNameString );
        String lastNameString = String.format( "%s %s %s",
                RESOURCE_BUNDLE.getString( "person_last_name" ),
                lastName,
                LINE_SEPARATOR
        );
        sb.append( lastNameString );
        String birthDateString = String.format( "%s %s %s",
                RESOURCE_BUNDLE.getString( "person_birth_date" ),
                birthDate.toString(),
                LINE_SEPARATOR
        );
        sb.append( birthDateString );
        sb.append( RESOURCE_BUNDLE.getString( "person_medias" ) ).append( LINE_SEPARATOR );
        for ( int i = 0; i < medias.size(); i++ )
        {
            Media media = medias.get( i );
            sb.append( media );
        }
        return sb.toString();
    }

    @Override
    public abstract Person clone();
}
