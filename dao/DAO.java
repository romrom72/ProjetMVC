package dao;
import java.sql.Connection;

public abstract class DAO<T>
{
	public static Connection connect ;

	public abstract T create (T obj);
	
	public abstract T read (int code);
	
	public abstract T update (T obj);
	
	public abstract T delete (T obj);
}
