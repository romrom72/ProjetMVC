package controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import classes.Division;
import classes.Eleve;

import dao.DAO;
import dao.DivisionDAO;
import dao.eleveDAO;

import vues.GUI;
public class ControleurPP implements ActionListener
{
	private GUI vue;
	private DAO<Division> laDivision = new DivisionDAO();
	private DAO<Eleve> lEleve = new eleveDAO();
	
	public ControleurPP(DAO<Division> modeleD, DAO<Eleve> modeleE){
		this.laDivision=modeleD;
		this.lEleve=modeleE;
	}
	
	public void lienVue(GUI laVue){
		this.vue=laVue;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()== vue.mnFermer)
		{
			System.exit(0);
		}
	}
}
	

