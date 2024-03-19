package HomeWork3;

import HomeWork.MyConsole;

public class Homework_q2 {

	public static void main(String[] args) {
		int x, l;
		l=1;
		x = MyConsole.readInt("Enter a number: ");
		for (int t=1; t<=x; t++)
		{
			for(int y = 1; y<=t; y++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		

	}

}
