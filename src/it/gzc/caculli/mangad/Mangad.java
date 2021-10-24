package it.gzc.caculli.mangad;

import it.gzc.caculli.mangad.gui.MainFrame;

public class Mangad
{
    public static void main( String[] args )
    {
        System.out.println( "Mangad by Giorgio Caculli" );

        javax.swing.SwingUtilities.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                new MainFrame();
            }
        } );
    }
}
