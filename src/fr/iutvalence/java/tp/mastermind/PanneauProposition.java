package fr.iutvalence.java.tp.mastermind;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class PanneauProposition extends JPanel
{
	private BoutonCouleur[] boutons;
	
	public PanneauProposition(int nbJetons, ActionListener fenetre)
	{
		this.boutons = new BoutonCouleur[nbJetons];
		for (int indice = 0; indice<nbJetons; indice++)
		{
			boutons[indice] = new BoutonCouleur(fenetre);
			this.add(boutons[indice]);
			boutons[indice].addActionListener(fenetre);
		}
		BoutonValider btValider = new BoutonValider(fenetre);
		this.add(btValider);
	}
	
	public BoutonCouleur[] getBoutons()
	{
		return this.boutons;
	}
}
