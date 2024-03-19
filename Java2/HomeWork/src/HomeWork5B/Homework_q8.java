package HomeWork5B;

import HomeWork2.MyConsole;

public class Homework_q8 {

	public static void main(String[] args) {
		int x = MyConsole.readInt("Enter something:");
		int m = x;
		int count=0;
		//Check the amount of digits in the number:
		while(m!=0) {
			m=m/10;
			count++;
		}
		//Save the digits in an array:
		int arr[] = new int [count];
		for (int i = 0 ; i<arr.length && x!=0; i++) {
			arr[i]=x%10;
			x/=10;
		}
		for (m=1; m<arr.length; m++) {
			if (arr[0]<arr[m]) {
				arr[0]=arr[m];
			}
			
		}
		System.out.println(arr[0]);

	}
}
