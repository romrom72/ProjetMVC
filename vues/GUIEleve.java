package vues;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;


import controleurs.ControleurPP;

public class GUIEleve extends JPanel 
{
	private JTextField textnom;
	private JTextField testprenom;
	private JTextField textdate;
	private ControleurPP leControleur;
	/**
	 * Create the panel.
	 */
	public GUIEleve(ControleurPP leControleur) 
	{
		this.leControleur = leControleur;
		setLayout(null);
		
		JLabel lblclasse = new JLabel("Classe de : ");
		lblclasse.setBounds(36, 24, 180, 15);
		add(lblclasse);
		
		JLabel lblSelectionnerUnlve = new JLabel("Selectionner un élève  :");
		lblSelectionnerUnlve.setBounds(38, 51, 189, 24);
		add(lblSelectionnerUnlve);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(245, 51, 134, 24);
		add(comboBox);
		
		textnom = new JTextField();
		textnom.setBounds(12, 107, 114, 19);
		add(textnom);
		textnom.setColumns(10);
		textnom.setVisible(false);
		
		
		testprenom = new JTextField();
		testprenom.setBounds(164, 107, 114, 19);
		add(testprenom);
		testprenom.setColumns(10);
		testprenom.setVisible(false);
		
		textdate = new JTextField();
		textdate.setBounds(308, 107, 114, 19);
		add(textdate);
		textdate.setColumns(10);
		textdate.setVisible(false);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(9, 205, 117, 25);
		add(btnModifier);
		btnModifier.setVisible(false);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(316, 205, 122, 24);
		add(btnSupprimer);
		btnSupprimer.setVisible(false);
		
		JButton btnAjouterUnNouvel = new JButton("Ajouter un nouvel eleve");
		btnAjouterUnNouvel.setBounds(88, 255, 267, 33);
		add(btnAjouterUnNouvel);
		btnAjouterUnNouvel.setVisible(false);

	}
}
