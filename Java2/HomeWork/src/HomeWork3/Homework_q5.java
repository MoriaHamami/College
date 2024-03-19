package HomeWork3;

import HomeWork2.MyConsole;

public class Homework_q5 {

	public static void main(String[] args) {
		int n= MyConsole.readInt("Enter a number: ");
		double arr[] = new double [n];
		for (int place=0; place<arr.length; place++){
			arr[place] = MyConsole.readDouble("Enter a number:");
		}
		double max;
		max = Math.fma(arr[0], arr[1], arr[2]);
		max= Math.fma (max, arr[3], arr[4]);
		System.out.println("The max number is:" +max);

	}


}
