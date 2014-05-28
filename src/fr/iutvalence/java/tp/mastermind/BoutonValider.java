package fr.iutvalence.java.tp.mastermind;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BoutonValider extends JButton
{
	private Color[] resultatCode;
	
	private ActionListener auditeurDEvenement;
	
	public BoutonValider(ActionListener auditeurDEvenement)
	{
		this.resultatCode = null;
		this.auditeurDEvenement = auditeurDEvenement;
		this.setText("Valider");
		this.setIcon(new ImageIcon("image/fleche2.png"));
		
	}
	
	public Color[] obtenirCode()
	{
		return null;
	}
}
