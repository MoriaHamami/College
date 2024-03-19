package HomeWork4;

import java.util.Arrays;

public class Homework_q3 {

	public static void main(String[] args) {
		int i, size;
		size = MyConsole.readInt("Enter the array size: ");
		int [] arr = new int [size];
		for (i=0; i<size; i++) {
		arr[i] = MyConsole.readInt("Enter a number: ");
		}
		System.out.println("Your array: " + (Arrays.toString(arr)));
		
		int temp= size-1;
		for (i=0; temp>0 ; i++) {
		arr[i] = arr[temp];
		temp--;
		}
		System.out.println("Opposite array: " + (Arrays.toString(arr)));
		
		

	}

}
