package secondp;

import firstp.MyConsole;

public class second_5 {

	public static void main(String[] args) 
	{
		double a = MyConsole.readDouble("get a:");
		double b = MyConsole.readDouble("get b:");
		double x;
		if (a==0 && b!=0) 
		{
			System.out.println("infinity");	
		}
		else if (a==0 && b != 0)
		{
			System.out.println("no sol");
		}
		else
		{
			x= -b/a;
			System.out.println("x= "+x);
		}

	}

}
