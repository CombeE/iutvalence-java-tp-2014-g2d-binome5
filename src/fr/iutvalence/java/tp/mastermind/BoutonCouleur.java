package fr.iutvalence.java.tp.mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoutonCouleur extends JButton
{
	private int numeroDeCouleur;
	
	private ActionListener auditeurDEvenement;

	public BoutonCouleur(ActionListener auditeurDEvenement)
	{
		this.numeroDeCouleur = -1;
		this.auditeurDEvenement = auditeurDEvenement;
		this.addActionListener(auditeurDEvenement);
		this.setText("Click!");
	}

	public void incrementCouleur()
	{
		this.numeroDeCouleur = (this.numeroDeCouleur+1) % Color.values().length;
	}
	
	public void remiseAZero()
	{
		this.numeroDeCouleur = -1;
	}
	
	public Color obtenirCouleur()
	{
		if (this.numeroDeCouleur == -1) return null;
		return Color.values()[this.numeroDeCouleur];
	}
	
	
	public void mettreAJourIcone()
	{
		this.setText("");
		this.setIcon(new ImageIcon("image/"+Color.values()[this.numeroDeCouleur].toString()+".png"));
		
	}

}
