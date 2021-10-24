package it.gzc.caculli.mangad.gui;

import java.awt.CardLayout;

import javax.swing.JPanel;

import it.gzc.caculli.mangad.core.CoreInterface;

public interface GUIInterface extends CoreInterface
{
    String menuPanelString = "Menu Panel";
    JPanel cards = new JPanel( new CardLayout() );
    CardLayout cl = ( CardLayout ) cards.getLayout();
}
