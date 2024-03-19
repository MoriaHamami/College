package lesson3;

public class Arrays {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int size = 5;
		int[] arr2 = new int[size];
		arr1[0] = 3;
		arr1[1] = 9;
		int[]arr3 = arr1;
		//array is an object
		System.out.println("arr1.length = "+arr1.length );
		System.out.println("arr2.length = "+arr2.length );
		for(int i=0; i<arr1.length; i=i+1) {
			arr1[i] = 2*i;
		}
		for(int i=0; i<arr1.length; i=i+1) {
			System.out.print(arr1[i]+", ");
		}
		System.out.println();
		for(int i=0; i<arr3.length; i=i+1) {
			System.out.print(arr3[i]+", ");
		}
		System.out.println();
		int[] arr4 = new int[arr1.length];
		for(int i=0; i<arr4.length; i=i+1) {
			arr4[i] = arr1[i];
		}
		for(int i=0; i<arr4.length; i=i+1) {
			System.out.print(arr4[i]+", ");
		}
	}

}
