package defaut;


import controleurs.ControleurPP;
import vues.GUI;
import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.DivisionDAO;
import dao.eleveDAO;
import dao.ConnexionPostgreSQL;

public class PointEntree {

	/**
	 * @param args
	 */
	
	public static GUI interfaceG;
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
			DAO<Division> modeleDivision = new DivisionDAO();
			DAO<Eleve> modeleEleve = new eleveDAO();
			ControleurPP leControleur = new ControleurPP(modeleDivision,modeleEleve);
			GUI interfaceGraph = new GUI(leControleur);
			leControleur.lienVue(interfaceG);
			
			// Méthode arrêtant la connexion en cours à la bdd
			ConnexionPostgreSQL.Stop();

	}

}
