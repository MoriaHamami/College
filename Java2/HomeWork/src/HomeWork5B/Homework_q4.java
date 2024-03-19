package HomeWork5B;

import HomeWork2.MyConsole;

public class Homework_q4 {

	public static void main(String[] args) {
		String x = MyConsole.readString("Enter something:");
		char first = x.charAt(0); 
		int count = 0;
		for(int i = 0 ; i<x.length(); i++) {
			if (x.charAt(i)==first) count++;
			
		}
		System.out.println(count);

	}

}
