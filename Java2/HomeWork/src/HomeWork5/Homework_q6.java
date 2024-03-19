package HomeWork5;

import java.util.Arrays;

public class Homework_q6 {
	
	public static void swap(int i, int j, int[]arr) {
			int temp = arr[i];
		    arr[i] = arr[j]; 
		    arr[j] = temp;
	}
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5};
		swap(2, 3, arr1);
		System.out.println(Arrays.toString(arr1));

	}

}
