package tests;

import classes.Division;
import classes.Eleve;

public class TestsEleve {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Eleve moiEleve = new Eleve();
		Eleve newEleve = new Eleve(2,"Pean","Valentin","28/03/1994", new Division(5, "classebtsSIO 1"));
		
		moiEleve.setCode(3);
		System.out.println(moiEleve.getCode());
		moiEleve.setNom("Lopez");
		System.out.println(moiEleve.getNom());
		moiEleve.setPrenom("Gerard");
		System.out.println(moiEleve.getPrenom());
		moiEleve.setDateNaiss("23/06/1961");
		System.out.println(moiEleve.getDateNaiss());
		
		System.out.println(newEleve.getCode());
		System.out.println(newEleve.getNom());
		System.out.println(newEleve.getPrenom());
		System.out.println(newEleve.getDateNaiss());
		
		System.out.println(moiEleve.toString());
		System.out.println(newEleve.toString());

	}

}
