package dao;

import java.sql.*;

public class ConnexionPostgreSQL 
{

	/**
	 * @param args
	 */
		
	private static String url = "jdbc:postgresql://172.16.99.2:5432/rlocquet";
	private static String user = "r.locquet";
	private static String passwd = "Memoires72";
	private static Connection connect;
	
	/**
	 * 
	 * @return le resultat de la connection
	 */
	public static Connection getInstance()
	{
		 if(connect == null)
		 {
			 try
			 {
				 connect = DriverManager.getConnection(url, user, passwd);
			 } 
			 catch (SQLException e) 
			 {
				 e.printStackTrace();
			 }
		}
			 return connect;
	}
}

