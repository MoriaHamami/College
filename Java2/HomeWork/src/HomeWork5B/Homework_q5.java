package HomeWork5B;

import HomeWork2.MyConsole;

public class Homework_q5 {

	public static void main(String[] args) {
		String x = MyConsole.readString("Enter something:");
		int count= 1;
		if (x.charAt(0)!=' ' ) {
			for(int i = 0; i<x.length(); i++) {
				if (x.charAt(i)==' ') count ++;			
			}
			System.out.println(count);
		}
		else System.out.println("None");

	} //There can be more options- ex: space first then words.
		

}

	