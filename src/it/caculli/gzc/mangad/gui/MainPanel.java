package it.caculli.gzc.mangad.gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainPanel extends JPanel implements GUIInterface
{
    public MainPanel()
    {
        setLayout( new BorderLayout() );
        CARDS.add( new MenuPanel(), CARD_MENU_PANEL );
        CARD_LAYOUT.show( CARDS, CARD_MENU_PANEL );
        add( CARDS, BorderLayout.CENTER );
    }
}
