package it.caculli.gzc.mangad.gui;

import it.caculli.gzc.mangad.core.ICoreValues;

import java.awt.CardLayout;

import javax.swing.JPanel;

public interface GUIInterface extends ICoreValues
{
    String CARD_MENU_PANEL = "Menu Panel";
    JPanel CARDS = new JPanel( new CardLayout() );
    CardLayout CARD_LAYOUT = ( CardLayout ) CARDS.getLayout();
}
