package HomeWork4;

import java.util.Arrays;

public class Homework_q4 {

	public static void main(String[] args) {
		int i, N;
		N = MyConsole.readInt("Enter the array size: ");
		int [] arr = new int [N];
		
		for (i = 0; i < N; i++) {
		arr[i] = (int)(Math.random()*N);
			}
		System.out.println("Array: " + Arrays.toString(arr));
		
		int count=0;
		for ( i = 0 ; i<N ; i++) {
			if (arr[i]%2==0) {
				count++;
			}
		}
		
		System.out.println("Amount of even numbers in array: " + count);
		
		

	}

}
