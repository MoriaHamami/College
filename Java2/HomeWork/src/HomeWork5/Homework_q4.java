package HomeWork5;

public class Homework_q4 {

	public static boolean palindrom(int[]arr) {
		boolean ans;
		int temp= arr.length-1, count=0;
		for (int i=0; temp>0 ; i++) {
			if(arr[i] == arr[temp]) {
				count++;
			}
		temp--;
		}
		
		if (count >= (arr.length/2)) {
			ans=true;
		}
		else {
			ans=false;
		}

		return ans;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {1,2,3,2,1};
		System.out.println(palindrom(arr1));
		System.out.println(palindrom(arr2));

	}

}
