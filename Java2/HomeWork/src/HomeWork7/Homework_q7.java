package HomeWork7;

import HomeWork2.MyConsole;

public class Homework_q7 {
	public static int pow (int m, int n) {
		if (m==1) {
			return n; 
		}
		return n * pow(m-1, n);
	}
	public static void main(String[] args) {
		int a =MyConsole.readInt("Enter a number:");
		int b =MyConsole.readInt("Enter a number:");
		System.out.println(pow(a, b));

	}

}
