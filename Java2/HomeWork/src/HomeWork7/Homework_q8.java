package HomeWork7;

import HomeWork2.MyConsole;

public class Homework_q8 {
	public static String reverseString (String s) {
		if (s.length()<=1) return s;
		return (reverseString(s.substring(1)))+s.charAt(0);
		
		}
	
	public static void main(String[] args) {
		String s =MyConsole.readString("Enter a phrase:");
		System.out.println(reverseString(s));

	}

}
