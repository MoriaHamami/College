package HomeWork5;

import java.util.Arrays;

public class Homework_q5 {

	public static void reverse (int[]arr) {
	for (int i = 0; i < arr.length / 2; i++) { 
		int temp = arr[i];
        arr[i] = arr[arr.length - i - 1]; 
        arr[arr.length - i - 1] = temp;
		}
	}
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5};
		reverse(arr1);
		System.out.println(Arrays.toString(arr1));

	}

}
