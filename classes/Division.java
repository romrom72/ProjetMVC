package classes;

public class Division 
{

	/**
	 * @param args
	 */
	private int code;
	private String libelle;

	//Accesseurs

	/**
	* Accesseur du cu code d'une divsion
	* @return le code d'une division
	*/
			public int getCode()
			{
				return code;
			}
	/**
	* Accesseur pour le libelle d'une division
	* @return le libelle d'une division
	*/

			public String getlibelle()
			{
				return libelle;
			}

	//Modifieurs


			public void setcode(int code)
			{
				this.code = code;
			}

			public void setlibelle(String libelle)
			{
				this.libelle = libelle;
			}
	// Constructeurs
	
	
	/**
	* Constructeur � partir de param�tres
	*/

			
			public Division()
			{
					code = 1;
					libelle = "BTS2";
			}
	/**
	* 	
	* @param code
	* @param libelle
	*/
			public Division(int code, String libelle)
			{
				this.code = code;
				this.libelle = libelle;
			}
	
	
	// Methodes
	
	public String toString()
	{
		return("Le code de la division est "+code+", et le libelle est "+libelle+".");
	}
	
	
	
	
	
	
	
	

}
