package it.caculli.gzc.mangad.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements GUIInterface
{
    public MainPanel()
    {
        setLayout( new BorderLayout() );
        CARDS.add( new MenuPanel(), CARD_MENU_PANEL );
        CARD_LAYOUT.show( CARDS, CARD_MENU_PANEL );
        add( CARDS );
    }
}
