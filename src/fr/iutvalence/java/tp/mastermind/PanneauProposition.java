package fr.iutvalence.java.tp.mastermind;

import javax.swing.JPanel;

public class PanneauProposition extends JPanel
{
	private BoutonCouleur[] boutons;
	
	public PanneauProposition(int nbJetons)
	{
		this.boutons = new BoutonCouleur[nbJetons];
	}
}
