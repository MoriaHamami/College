package secondp;

import firstp.MyConsole;

public class second_7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num = MyConsole.readInt("get num");
		int base = 10;
		int sum = 0;
		while(num != 0)
		{
			int r = num%base;
			sum = sum + r;
			num = num/base;
		}
		System.out.println(" sum = " + sum);
	}

}
