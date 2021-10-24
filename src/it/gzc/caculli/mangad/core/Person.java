package it.gzc.caculli.mangad.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person
{
    private String firstName, lastName;
    private Date birthDate;
    private int age;
    private List< Media > medias;

    public Person( String firstName, String lastName, Date birthDate )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        medias = new ArrayList<>();
    }
}
