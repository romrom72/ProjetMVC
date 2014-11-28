package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import defaut.PointEntree;
import controleurs.ControleurPP;
import classes.Division;
import dao.DAO;
import dao.DivisionDAO;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnDivision;
	private JMenuItem mntmVisualiser;
	private JMenuItem mntmModifier;
	private JMenuItem mntmAjouter;
	private JMenuItem mntmSupprimer;
	private JMenu mnElves;
	public final JMenu mnFermer;
	
	private ControleurPP leControleur = new ControleurPP(null,null);
		/**
	 * Create the frame.
	 */
	public GUI(ControleurPP leControleur) {
		setTitle("Mon ecole");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnDivision = new JMenu("Division");
		menuBar.add(mnDivision);
		
		mntmVisualiser = new JMenuItem("Visualiser");
		mnDivision.add(mntmVisualiser);
		
		mntmModifier = new JMenuItem("Modifier");
		mnDivision.add(mntmModifier);
		
		mntmAjouter = new JMenuItem("Ajouter");
		mnDivision.add(mntmAjouter);
		
		mntmSupprimer = new JMenuItem("Supprimer");
		mnDivision.add(mntmSupprimer);
		
		mnElves = new JMenu("Elèves");
		menuBar.add(mnElves);
		
		DAO<Division> daoDiv = new DivisionDAO();
		List<Division> lesDiv = daoDiv.readAll();
		for (Division uneDiv : lesDiv ) {
			JMenuItem mnUneDivEleve = new JMenuItem(uneDiv.getlibelle());
			mnUneDivEleve.setActionCommand(Integer.toString(uneDiv.getCode()));
			mnUneDivEleve.addActionListener(leControleur);
			mnElves.add(mnUneDivEleve);
		}
		
		mnFermer = new JMenu("Fermer");
		menuBar.add(mnFermer);
	    mnFermer.addActionListener(leControleur);
	    
	    
	    
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		setVisible(true);
	}

}
