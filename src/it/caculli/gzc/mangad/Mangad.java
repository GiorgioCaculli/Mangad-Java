package it.caculli.gzc.mangad;

import it.caculli.gzc.mangad.core.person.Author;
import it.caculli.gzc.mangad.gui.MainFrame;

import javax.swing.SwingUtilities;
import java.time.LocalDate;

public class Mangad
{
    public static void main( String[] args )
    {
        System.out.println( "Mangad by Giorgio Caculli" );

        Author author1 = new Author( "", "", LocalDate.of( 1996, 12, 1 ) );

        System.out.println( author1 );

        SwingUtilities.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                new MainFrame();
            }
        } );
    }
}
