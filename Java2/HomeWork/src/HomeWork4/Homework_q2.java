package HomeWork4;

import java.util.Arrays;

public class Homework_q2 {

	public static void main(String[] args) {
		
		int i, size;
		size = MyConsole.readInt("Enter the array size: ");
		int [] arr = new int [size];
		for (i=0; i<size; i++) {
		arr[i] = MyConsole.readInt("Enter a number: ");
		}
		System.out.println("Your array: " + (Arrays.toString(arr)));
		
		for (i = 0; i < size; i++) {
		arr[i] = (int)(Math.random()*(30+1)+10);
			}
		System.out.println("New array: " + Arrays.toString(arr));
		
		int minimum, maximum;
		for (minimum = arr [0], i = 0; i < arr.length ; i++) {
			if (arr [i]< minimum) {
				minimum = arr [i];
			}
		}
		for (maximum = arr [0], i = 0; i < arr.length ; i++) {
			if (arr [i]> maximum) {
				maximum = arr [i];
			}
		}
		System.out.println("Min:" + minimum);
		System.out.println("Max:" + maximum);
		

	}

}
