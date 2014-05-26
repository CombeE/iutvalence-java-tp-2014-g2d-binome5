package fr.iutvalence.java.tp.mastermind;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class PanneauEssai extends JPanel
{
	private PanneauProposition[] proposition;
	private PanneauResultat resultat;
	private JSplitPane panGauche;
	
	public PanneauEssai(ActionListener fenetre)
	{
		JPanel pann = new JPanel();
		pann.setLayout(new GridLayout(MasterMind.MAXIMUM_NUMBER_OF_TURNS,1));
		this.panGauche = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		this.proposition = new PanneauProposition[MasterMind.MAXIMUM_NUMBER_OF_TURNS];
		for (int indice = 0; indice<MasterMind.MAXIMUM_NUMBER_OF_TURNS; indice++)
		{
			this.proposition[indice] = new PanneauProposition(Code.NUMBER_OF_PEGS_IN_THE_CODE, fenetre);
			pann.add(this.proposition[indice]);
		}
		this.panGauche.add(pann);
		this.add(panGauche);
		
		this.resultat = new PanneauResultat(0, 0);
		this.panGauche.add(resultat);
		
	}
	
	public void modifierResultat(int bienP, int malP)
	{
		this.resultat = new PanneauResultat(bienP, malP);
		this.add("", this.resultat);
	}
	
	public PanneauProposition[] getPanneauProposition()
	{
		return this.proposition;
	}
	
	public PanneauResultat getPanneauResultat()
	{
		return this.resultat;
	}
}
