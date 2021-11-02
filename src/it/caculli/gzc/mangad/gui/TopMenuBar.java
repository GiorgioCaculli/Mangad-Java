package it.caculli.gzc.mangad.gui;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopMenuBar extends JMenuBar implements GUIInterface
{
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu helpMenu;

    private JMenuItem quitMenuItem;
    private JMenuItem importDatabaseMenuItem;
    private JMenuItem exportDatabaseMenuItem;
    private JMenuItem settingsMenuItem;
    private JMenuItem aboutMenuItem;

    private AboutFrame af;

    public TopMenuBar()
    {
        initInstances();
        initListeners();
        addSubMenusToMenus();
        addMenus();
    }

    private void initInstances()
    {
        fileMenu = new JMenu( RESOURCE_BUNDLE.getString( "menu_topMenuBar_file" ) );
        editMenu = new JMenu( RESOURCE_BUNDLE.getString( "menu_topMenuBar_edit" ) );
        helpMenu = new JMenu( RESOURCE_BUNDLE.getString( "menu_topMenuBar_help" ) );
        importDatabaseMenuItem = new JMenuItem( RESOURCE_BUNDLE.getString( "menuItem_topMenuBar_importDatabase" ) );
        exportDatabaseMenuItem = new JMenuItem( RESOURCE_BUNDLE.getString( "menuItem_topMenuBar_exportDatabase" ) );

        quitMenuItem = new JMenuItem( RESOURCE_BUNDLE.getString( "menuItem_topMenuBar_quit" ) );
        settingsMenuItem = new JMenuItem( RESOURCE_BUNDLE.getString( "menuItem_topMenuBar_settings" ) );
        aboutMenuItem = new JMenuItem( RESOURCE_BUNDLE.getString( "menuItem_topMenuBar_about" ) );

        af = new AboutFrame();
    }

    private void initListeners()
    {
        importDatabaseMenuItem.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setAcceptAllFileFilterUsed( false );
                int returnVal = fileChooser.showOpenDialog( getParent() );
                System.out.println( returnVal );
            }
        } );
        exportDatabaseMenuItem.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setAcceptAllFileFilterUsed( false );
                int returnVal = fileChooser.showSaveDialog( getParent() );
                System.out.println( returnVal );
            }
        } );
        quitMenuItem.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                int confirm = JOptionPane.showConfirmDialog( getComponent(), "Are you sure you want to quit?", "Quit Program?", JOptionPane.YES_NO_OPTION );
                if ( confirm == JOptionPane.YES_OPTION )
                {
                    ( ( Window ) getRootPane().getParent() ).dispose();
                }
            }
        } );
        aboutMenuItem.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                af.setVisible( true );
            }
        } );
    }

    private void addSubMenusToMenus()
    {
        fileMenu.add( importDatabaseMenuItem );
        fileMenu.add( exportDatabaseMenuItem );
        fileMenu.addSeparator();
        fileMenu.add( quitMenuItem );
        editMenu.add( settingsMenuItem );
        helpMenu.add( aboutMenuItem );
    }

    private void addMenus()
    {
        add( fileMenu );
        add( editMenu );
        add( helpMenu );
    }
}
