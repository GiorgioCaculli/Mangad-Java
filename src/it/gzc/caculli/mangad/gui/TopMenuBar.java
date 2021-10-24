package it.gzc.caculli.mangad.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TopMenuBar extends JMenuBar implements ActionListener, GUIInterface
{
    private static final JMenu fileMenu = new JMenu( "File" );
    private static final JMenu editMenu = new JMenu( "Edit" );
    private static final JMenu helpMenu = new JMenu( "Help" );

    private static final JMenuItem quitMenuItem = new JMenuItem( "Quit" );
    private static final JMenuItem settingsMenuItem = new JMenuItem( "Settings" );
    private static final JMenuItem aboutMenuItem = new JMenuItem( "About" );

    private static final AboutFrame af = new AboutFrame();

    public TopMenuBar()
    {
        quitMenuItem.addActionListener( this );
        aboutMenuItem.addActionListener( this );

        fileMenu.add( quitMenuItem );
        editMenu.add( settingsMenuItem );
        helpMenu.add( aboutMenuItem );

        add( fileMenu );
        add( editMenu );
        add( helpMenu );
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        Object source = e.getSource();
        if ( source == quitMenuItem )
        {
            System.exit( 0 );
        }
        if ( source == aboutMenuItem )
        {
            af.setVisible( true );
        }
    }
}
