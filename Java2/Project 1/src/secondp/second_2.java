package secondp;

public class second_2
{

	public static void main(String[] args) 
	{
		
		boolean x = true, y = true;
		boolean zOr = x||y, zAnd = x&&y, zNot = !x;
		System.out.println("x||y = " +zOr+ ", x&&y = " +zAnd+ ", !x = " +zNot);
		x = true;
		y=false ;
		zOr = x||y; 
		zAnd = x&&y; 
		zNot = !x;
		System.out.println("x||y = " +zOr+ ", x&&y = " +zAnd+ ", !x = " +zNot);
	}

}
