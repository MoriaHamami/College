package HomeWork5;

public class Homework_q1 {

	public static double arraySum(int[] arr) {
		double count=0;
		for (int i=0; i<arr.length; i++) {
			count += arr[i];
		}
		return count;
		}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(arraySum(arr));

	}

}
