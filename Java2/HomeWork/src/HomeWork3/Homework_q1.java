package HomeWork3;

import HomeWork.MyConsole;

public class Homework_q1 {

	public static void main(String[] args) {
		int n, a;
		a=1;
		n = MyConsole.readInt("Enter a number: ");
		for (int t=1; t<=n; t++)
		{
			
			a = t * a;
			
		}
		
		System.out.println(a);
		
		//next time check minus or zero too
	}

}
