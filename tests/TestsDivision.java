package tests;
import classes.Division;
public class TestsDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Division maDivision = new Division();
		Division newDivision = new Division(2,"BTS");
		
		maDivision.setcode(3);
		System.out.println(maDivision.getCode());
		maDivision.setlibelle("seconde");
		System.out.println(maDivision.getlibelle());
		
		System.out.println(newDivision.getCode());
		System.out.println(newDivision.getlibelle());
		
		System.out.println(maDivision.toString());
		System.out.println(newDivision.toString());
		
		
		
		

	}

}
