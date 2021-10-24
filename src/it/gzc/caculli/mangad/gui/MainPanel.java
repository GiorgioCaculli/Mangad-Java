package it.gzc.caculli.mangad.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements GUIInterface
{
    public MainPanel()
    {
        setLayout( new BorderLayout() );
        cards.add( new MenuPanel(), menuPanelString );
        cl.show( cards, menuPanelString );
        add( cards );
    }
}
