package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Mon ecole");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDivision = new JMenu("Division");
		menuBar.add(mnDivision);
		
		JMenuItem mntmVisualiser = new JMenuItem("Visualiser");
		mnDivision.add(mntmVisualiser);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnDivision.add(mntmModifier);
		
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mnDivision.add(mntmAjouter);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnDivision.add(mntmSupprimer);
		
		JMenu mnElves = new JMenu("Elèves");
		menuBar.add(mnElves);
		
		JMenu mnFermer = new JMenu("Fermer");
		menuBar.add(mnFermer);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
