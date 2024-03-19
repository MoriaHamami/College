package HomeWork4;

import java.util.Arrays;

public class Homework_q6 {

	public static void main(String[] args) {
		int i, N;
		N = MyConsole.readInt("Enter the array size: ");
		int [] arr = new int [N];
		
		for (i = 0; i < N; i++) {
		arr[i] = (int)(Math.random()*N);
			}
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.print("Numbers divided by 3 in array: ");
		
		for ( i = 0 ; i<N ; i++) {
			if (arr[i]%3==0) {
				System.out.print(arr[i] + ", ");
			}
		}

	}

}
