package dao;
import java.sql.Connection;
import java.util.List;

public abstract class DAO<T>
{
	public Connection connect = ConnexionPostgreSQL.getInstance() ;

	public abstract T create (T obj);
	
	public abstract T read (int code);
	
	public abstract T update (T obj);
	
	public abstract List<T> readAll();
	
	public abstract T delete (T obj);
}
