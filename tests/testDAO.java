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
		
		DAO<Division> division = new DivisionDAO();
		DAO<Eleve> eleve = new eleveDAO();
		
		// test de la recherche d'un élève en fonction de son code
		
		System.out.println(eleve.read(2));
		
		Eleve unEleve = new Eleve(7, "TITI", "TOTO","12/12/2000", new Division(4, "classebtsSIO 1"));

		// test de l'insertion d'un nouvel élève
		unEleve = eleve.create(unEleve);
		System.out.println(eleve.read(999));
		
		// test de la màj d'un élève
		unEleve.setNom("test");
		unEleve.setPrenom("test");
		unEleve = eleve.update(unEleve);
		System.out.println(eleve.read(5));

		// test de la suppression d'un élève
		eleve.delete(unEleve);
				
		
		
		System.out.println(division.read(2));
		
		Division laDivision = new Division(5,"MaChambre");
		laDivision = division.create(laDivision);
		System.out.println(division.read(999));
		
		// test de la màj d'un élève
		laDivision = division.update(laDivision);
		System.out.println(division.read(4));

		// test de la suppression d'un élève
		division.delete(laDivision);

	}

}
