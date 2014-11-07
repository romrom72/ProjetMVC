package dao;
import java.sql.Connection;

public abstract class DAO<T>
{
	public static Connection connex ;

	public abstract T create (T obj);
}
