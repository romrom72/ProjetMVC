package classes;

public class Eleve {

		/**
		 * @param args
		 */
		private int code;
		private String nom;
		private String prenom;
		private String dateNaiss;
		private Division div;

		//Accesseurs

		/**
		* Accesseur du cu code d'un élève
		* @return le code d'un élève
		*/
				public int getCode()
				{
					return code;
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
		/**
		* Accesseur du cu code d'un élève
		* @return le code d'un élève
		*/
				public Division getDiv()
				{
					return div;
				}
				
		//Modifieurs

		/**
		 * 
		 * @param codeEleve
		 */
				public void setCode(int code)
				{
					this.code = code;
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
				
		/**
		* 
		* @param codeEleve
	    */
				public void setDiv(Division div)
				{
					this.div = div;
				}
		// Constructeurs
				
		/**
		* Constructeur � partir de param�tres
		*/

				
				public Eleve()
				{
						code = 1;
						nom = "Locquet";
						prenom = "Romain";
						dateNaiss = "12/03/1994";
						div = new Division();
				}
		
		/**
		 * 
		 * @param codeEleve
		 * @param nom
		 * @param prenom
		 * @param dateNaiss
		 */
				public Eleve(int code, String nom, String prenom, String dateNaiss, Division div)
				{
					this.code = code;
					this.nom = nom;
					this.prenom = prenom;
					this.dateNaiss = dateNaiss;
					this.div = div;
				}
		
		
		// Methodes
		
		public String toString()
		{
			return("Le code de l'éleve est "+code+", son nom et prenom : " + nom + " " +prenom + ", né le "+ dateNaiss+ ".");
		}
		
}