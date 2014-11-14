package tests;
import classes.Eleve;
import classes.Division;
import dao.*;
public class testDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		DAO<Eleve> eleve = new eleveDAO();
		
		// test de la recherche d'un élève en fonction de son code
		
		System.out.println(eleve.read(2));
		
		Eleve unEleve = new Eleve(6, "TITI", "TOTO","12/12/2000", new Division(4, "classebtsSIO 1"));

		// test de l'insertion d'un nouvel élève
		unEleve = eleve.create(unEleve);
		System.out.println(eleve.read(999));

	}

}
