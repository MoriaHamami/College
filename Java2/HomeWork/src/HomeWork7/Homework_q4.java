package HomeWork7;

import HomeWork2.MyConsole;

public class Homework_q4 {

	public static void triangle (int n) {
		
		if (n!=0) {
			for(int i=1; i<=n; i++) {
			System.out.print("*"); 
			}
			System.out.println();
			triangle(n-1);
		}
	}

	
	public static void main(String[] args) {
		int a =MyConsole.readInt("Enter a number:");
		triangle(a);

	}

}
