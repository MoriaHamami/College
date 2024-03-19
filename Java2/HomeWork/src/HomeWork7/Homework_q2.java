package HomeWork7;

import HomeWork2.MyConsole;

public class Homework_q2 {
	
	public static int fact (int n) {
		if (n<=1) {
			return 1;
		}
		return n+fact(n-1);
			
	}
	public static void main(String[] args) {
		int a =MyConsole.readInt("Enter a number:");
		System.out.println(fact(a));
	}

}
