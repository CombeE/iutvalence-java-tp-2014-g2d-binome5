package fr.iutvalence.java.tp.mastermind;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre implements Runnable,ActionListener
{
	private PanneauEssai splitPaneInferieur;
	
	
	@Override
	public void run()
	{
		JFrame fenetre = new JFrame();

		fenetre.setTitle("Bouton");
		fenetre.setSize(300, 300);
		fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		

		JButton bouton = new BoutonCouleur(this);
		bouton.addActionListener(this);
		bouton.setFocusable(false);

		fenetre.getContentPane().add(bouton);

		fenetre.setVisible(true);
	}

	public void actionPerformed(ActionEvent event)
	{
		//bouton.incrementCouleur;
		//boutton.mettreAJourIcone;
		
		//attente de la référence du panneau
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Fenetre());
	}
}
