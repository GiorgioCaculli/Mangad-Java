package it.caculli.gzc.mangad.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutFrame extends JFrame implements ActionListener, GUIInterface
{
    private static final short WIDTH = 400;
    private static final short HEIGHT = WIDTH / 4 * 3;
    private static final BorderLayout bl = new BorderLayout();
    private static final String copyright = String.format( "<html>Copyright &#169; 2021 - Masticass. All Rights Reserved.</html>" );
    private static final JLabel copyrightLabel = new JLabel( copyright );
    private static final JButton closeButton = new JButton( "Close" );

    public AboutFrame()
    {
        closeButton.addActionListener( this );
        add( copyrightLabel, BorderLayout.CENTER );
        add( closeButton, BorderLayout.PAGE_END );
        setDefaultCloseOperation( HIDE_ON_CLOSE );
        setLocationByPlatform( true );
        setResizable( false );
        setSize( WIDTH, HEIGHT );
        setTitle( "About Mangad" );
        setVisible( false );
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        Object source = e.getSource();
        if ( source == closeButton )
        {
            setVisible( false );
        }
    }
}
