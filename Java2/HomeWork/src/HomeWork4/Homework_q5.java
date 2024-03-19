package HomeWork4;

import java.util.Arrays;

public class Homework_q5 {

	public static void main(String[] args) {
		int i, size;
		size = MyConsole.readInt("Enter the array size: ");
		int [] arr = new int [size];
		for (i=0; i<size; i++) {
		arr[i] = MyConsole.readInt("Enter a number: ");
		}
		System.out.println("Your array: " + (Arrays.toString(arr)));
		
		int temp= size-1, count=0;
		for (i=0; temp>0 ; i++) {
			if(arr[i] == arr[temp]) {
				count++;
			}
		temp--;
		}
		
		if (count >= (size/2)) {
			System.out.println("The array is symetric.");
		}
		else {
			System.out.println("The array is not symetric.");
		}

	}

}
