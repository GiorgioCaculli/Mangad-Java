package it.gzc.caculli.mangad.gui;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements WindowFocusListener, WindowListener, WindowStateListener
{
    private static final short WIDTH = 800;
    private static final short HEIGHT = WIDTH / 4 * 3;

    private static final BorderLayout bl = new BorderLayout();

    public MainFrame()
    {
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setJMenuBar( new TopMenuBar() );
        setLayout( bl );
        setLocationByPlatform( true );
        setResizable( false );
        setSize( WIDTH, HEIGHT );
        setTitle( "Mangad" );
        setVisible( true );
        add( new MainPanel(), BorderLayout.CENTER );
    }

    @Override
    public void windowStateChanged( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowActivated( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeactivated( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowGainedFocus( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowLostFocus( WindowEvent e )
    {
        // TODO Auto-generated method stub

    }
}
