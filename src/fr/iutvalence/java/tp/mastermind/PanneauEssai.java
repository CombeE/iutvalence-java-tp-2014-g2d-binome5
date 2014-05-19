package fr.iutvalence.java.tp.mastermind;

import javax.swing.JPanel;

public class PanneauEssai extends JPanel
{
	private PanneauProposition proposition;
	private PanneauResultat resultat;
	
	public PanneauEssai()
	{
		 this.proposition = new PanneauProposition(Code.NUMBER_OF_PEGS_IN_THE_CODE);
		 this.resultat = new PanneauResultat();
	}
	
}
