package HomeWork5;

public class Homework_q3 {
	
		public static double arrayStdev(int[]arr) {
			double avg, sigma, stdev;
			double count=0;
			for (int i=0; i<arr.length; i++) {
				count += arr[i];
			}
			avg=count/(arr.length);
			sigma = count-(avg*(arr.length));
			stdev=Math.sqrt(sigma/count);
			return stdev;
	}
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5};
		System.out.println(arrayStdev(arr1));
		
		//Doesnt work i think i miss understood the equation 


	}

}
