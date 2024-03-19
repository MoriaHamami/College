package HomeWork5;

import java.util.Arrays;

public class Homework_q7 {
	
	public static void evenOddSort(int[]arr){
		int arrEven[]=new int [arr.length];
		int arrOdd[]=new int [arr.length];
		int b=0, c=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				arrEven[b]=arr[i];
				b++;
			}
			else {
				arrOdd[c]=arr[i];
				c++;
			}
		}
		for (int x = 0; x < b; x++) {
			arr[x]=arrEven[x];
		}
		for (int x = b, i=0; x <= c; x++, i++) {
			arr[x]=arrOdd[i];
		}
		
	}
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5};
		evenOddSort(arr1);
		System.out.println(Arrays.toString(arr1));

	}

}
