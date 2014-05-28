package fr.iutvalence.java.tp.mastermind;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauResultat extends JPanel
{
	private JLabel nbJetonsBienPlaces;
	private JLabel nbJetonsMalPlaces;
	
	public PanneauResultat(int bienP, int malP)
	{
		this.nbJetonsBienPlaces = new JLabel("Nombre de Jetons bien placés : "+bienP+"           ");
		this.nbJetonsMalPlaces = new JLabel ("Nombre de jetons mal placés : "+malP+"           ");
		
		this.add(nbJetonsBienPlaces);
		this.add(nbJetonsMalPlaces);
	}
}
