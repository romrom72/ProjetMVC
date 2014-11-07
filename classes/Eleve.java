package classes;

public class Eleve {

		/**
		 * @param args
		 */
		private int codeEleve;
		private String nom;
		private String prenom;
		private String dateNaiss;

		//Accesseurs

		/**
		* Accesseur du cu code d'un élève
		* @return le code d'un élève
		*/
				public int getCodeEleve()
				{
					return codeEleve;
				}
		/**
		* Accesseur pour le nom de l'élève
		* @return le nom d'un éléve
		*/

				public String getNom()
				{
					return nom;
				}
		/**
		 * Accesseur pour le prenom de l'élève
		 * @return le prenom de l'élève
		 */
				public String getPrenom()
				{
					return prenom;
				}
		/**
		 * Accesseur pour la date de naissance de l'élève
		 * @return la date de naissance de l'élève
		 */
				public String getDateNaiss()
				{
					return dateNaiss;
				}

		//Modifieurs

		/**
		 * 
		 * @param codeEleve
		 */
				public void setCode(int codeEleve)
				{
					this.codeEleve = codeEleve;
				}
		
		/**
		 * 
		 * @param nom
		 */
				public void setNom(String nom)
				{
					this.nom = nom;
				}
		/**
		 * 	
		 * @param prenom
		 */
				public void setPrenom(String prenom)
				{
					this.prenom = prenom;
				}
		/**
		 * 
		 * @param dateNaiss
		 */
				public void setDateNaiss(String dateNaiss)
				{
					this.dateNaiss = dateNaiss;
				}
				
			
		// Constructeurs
				
		/**
		* Constructeur � partir de param�tres
		*/

				
				public Eleve()
				{
						codeEleve = 1;
						nom = "Locquet";
						prenom = "Romain";
						dateNaiss = "12/03/1994";
				}
		
		/**
		 * 
		 * @param codeEleve
		 * @param nom
		 * @param prenom
		 * @param dateNaiss
		 */
				public Eleve(int codeEleve, String nom, String prenom, String dateNaiss)
				{
					this.codeEleve = codeEleve;
					this.nom = nom;
					this.prenom = prenom;
					this.dateNaiss = dateNaiss;
				}
		
		
		// Methodes
		
		public String toString()
		{
			return("Le code de l'éleve est "+codeEleve+", son nom et prenom : " + nom + " " +prenom + ", né le "+ dateNaiss+ ".");
		}
		
}