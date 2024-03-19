package HomeWork5B;

import HomeWork2.MyConsole;

public class Homework_q1 {

	public static void main(String[] args) {
		String x = MyConsole.readString("Enter something:");
		String y = MyConsole.readString("Enter something:");
		int count=0;
		if (x.length()==y.length()) { 
		for(int i = 0; i < x.length(); i++) {
			if (x.charAt(i)== y.charAt(i)) {
				count++;
			}
		}
		if(count==y.length()-1) System.out.println("The strings are equal");
		else System.out.println("The strings are not equal");
		}
		else System.out.println("The strings are not equal");

	}

}
