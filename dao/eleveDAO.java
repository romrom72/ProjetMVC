package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Division;
import classes.Eleve;

public class eleveDAO extends DAO<Eleve>
{ 
	private DAO<Division> dao = new DivisionDAO();

	public Eleve create(Eleve obj) 
	{
	try {
			 PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO \"mvc\".\"Eleve\" VALUES(?, ?, ?, ?, ?)");
             prepare.setInt(1,obj.getCode());
			 prepare.setString(2, obj.getNom());
			 prepare.setString(3, obj.getPrenom());
			 prepare.setString(4, obj.getDateNaiss());
			 prepare.setInt(5, obj.getDiv().getCode());
				
				prepare.executeUpdate();
				obj = this.read(obj.getCode());	
				
			}
	    catch (SQLException e) {
	            e.printStackTrace();
	    }
	    return obj;
	}
	
	
	
	public Eleve read(int code) 
	{
		Eleve UnEleve = new Eleve();
		try {
            ResultSet result = this .connect
                                    .createStatement(
                                            	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                ResultSet.CONCUR_UPDATABLE)
                                    .executeQuery("SELECT * FROM \"mvc\".\"Eleve\" WHERE \"codeEleve\" = '" + code +"'");
            if(result.first())
            		UnEleve = new Eleve(code, result.getString("nom"),result.getString("prenom"), result.getString("dateNaiss"), dao.read(result.getInt("codeDivision")));   
		    } catch (SQLException e) {
		            e.printStackTrace();
		    }
		   return UnEleve;
	}
	
	public Eleve update(Eleve obj) 
	{
		try {
			
                this .connect	
                     .createStatement(
                    	ResultSet.TYPE_SCROLL_INSENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE
                     ).executeUpdate(
                    		 "UPDATE \"mvc\".\"Eleve\" SET nom = '" + obj.getNom() +"', prenom = '"+obj.getPrenom()+"', \"dateNaiss\" = '"+obj.getDateNaiss()+"', \"codeDivision\" ="+obj.getDiv().getCode()
                    		 + " WHERE \"codeEleve\" = "+obj.getCode()+""
                    	
                     );
			
			obj = this.read(obj.getCode());
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	    
	    return obj;
	}


	public Eleve delete(Eleve obj) 
	{
		try {
			
                this    .connect
                    	.createStatement(
                             ResultSet.TYPE_SCROLL_INSENSITIVE, 
                             ResultSet.CONCUR_UPDATABLE
                        ).executeUpdate(
                             "DELETE FROM \"mvc\".\"Eleve\" WHERE \"codeEleve\" = '" + obj.getCode()+"'"
                        );
			
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
		return obj;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
