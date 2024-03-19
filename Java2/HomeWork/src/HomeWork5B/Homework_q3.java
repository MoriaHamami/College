package HomeWork5B;

import HomeWork2.MyConsole;

public class Homework_q3 {

	public static void main(String[] args) {
		String x = MyConsole.readString("Enter something:");
		for(int i = x.length()-1; i >=0; i--) {
			System.out.print(x.charAt(i));
			}

		}

	}
