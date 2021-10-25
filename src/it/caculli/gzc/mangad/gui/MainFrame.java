package it.caculli.gzc.mangad.gui;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements WindowFocusListener, WindowListener, WindowStateListener
{
    private static final short WIDTH = 800;
    private static final short HEIGHT = WIDTH / 4 * 3;

    public MainFrame()
    {
        setDefaultCloseOperation( DO_NOTHING_ON_CLOSE );
        setJMenuBar( new TopMenuBar() );
        setLayout( new BorderLayout() );
        setLocationByPlatform( true );
        setResizable( false );
        setSize( WIDTH, HEIGHT );
        setTitle( "Mangad" );
        setVisible( true );
        add( new MainPanel(), BorderLayout.CENTER );

        addWindowListener( this );
        addWindowFocusListener( this );
        addWindowStateListener( this );
    }

    @Override
    public void windowStateChanged( WindowEvent e )
    {
    }

    @Override
    public void windowOpened( WindowEvent e )
    {
    }

    @Override
    public void windowClosing( WindowEvent e )
    {
        int confirm = JOptionPane.showConfirmDialog( getRootPane(), "Are you sure you want to quit?", "Quit Program?", JOptionPane.YES_NO_OPTION );
        if( confirm == JOptionPane.YES_OPTION )
        {
            ( ( Window ) getRootPane().getParent() ).dispose();
        }
    }

    @Override
    public void windowClosed( WindowEvent e )
    {
    }

    @Override
    public void windowIconified( WindowEvent e )
    {
    }

    @Override
    public void windowDeiconified( WindowEvent e )
    {
    }

    @Override
    public void windowActivated( WindowEvent e )
    {
    }

    @Override
    public void windowDeactivated( WindowEvent e )
    {
    }

    @Override
    public void windowGainedFocus( WindowEvent e )
    {
    }

    @Override
    public void windowLostFocus( WindowEvent e )
    {
    }
}
