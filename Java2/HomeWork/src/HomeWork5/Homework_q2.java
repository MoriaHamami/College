package HomeWork5;

public class Homework_q2 {
	
	public static double arrayMean(int[]arr) {
		double Mean, count=0;
		for (int i=0; i<arr.length; i++) {
			count += arr[i];
		}
		Mean=count/(arr.length);
		return Mean;
		}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(arrayMean(arr));

	}

}
