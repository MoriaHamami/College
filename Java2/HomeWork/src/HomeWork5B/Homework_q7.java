package HomeWork5B;

import HomeWork2.MyConsole;

public class Homework_q7 {

	public static void main(String[] args) {
		String x = MyConsole.readString("Enter something:");
		x=x.replace(x.charAt(0), (char)(x.charAt(0)-32));
		System.out.println(x);

	}

}
//in exam make sure to check if there is a letter first.