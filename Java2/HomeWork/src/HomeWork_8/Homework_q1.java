package HomeWork_8;

import java.util.Arrays;

public class Homework_q1 {
	public static void partialSort (int startIndex, int lastIndex, int []arr) {
		//saw the answers
	}
	public static void partsSorting(int[] arr, int n) {
		for(int i = 0; n+i<arr.length; i++) {
			partialSort(i, i+n, arr);
			//did it wrong  because i didnt understand the question.
		}
	}
	public static void sort2DArray(int[][] arr) {
		//saw answers awww
	}
	public static int[] mergeArrays(int arr1[], int []arr2) {
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		partialSort(2, 5, arr);
		System.out.println(Arrays.toString(arr));
	}

}
////SOLUTIONS:
//public static void bubbleSort(int[] arr) 
//{
//	boolean hasChanged = true;
//	for(int i=0; i<arr.length-1 && hasChanged; i++)
//	{
//		hasChanged = false;
//		for(int j=0; j<arr.length-i-1; j++)
//		{
//			if(arr[j] > arr[j+1])
//			{
//				hasChanged = true;
//				swap(arr, j, j+1);
//			}
//		}
//	}
//}
//
////Q2
//public static void selectionSort(int[] arr)
//{
//	int minIndex ;
//	for(int i = 0; i<arr.length-1; i++)
//	{
//		minIndex = getMinIndex(arr, i);
//		swap(arr, i, minIndex);
//	}
//}
//
//public static int getMinIndex(int[] arr, int startIndex)
//{
//	int minIndex = startIndex;
//	
//	for(int j=startIndex+1; j<arr.length; j++)
//	{
//		if(arr[j]<arr[minIndex])
//		{
//			minIndex = j;
//		}
//	}
//	
//	return minIndex;
//}
//
////Q3
//public static void partialSort(int[] arr, int startIndex, int lastIndex)
//{
//	boolean hasChanged = true;
//	
//	for(int i=startIndex, counter=0; i<lastIndex && hasChanged; i++,counter++)
//	{
//		hasChanged = false;			
//		
//		for(int j=startIndex; j<lastIndex-counter; j++)
//		{
//			if(arr[j] > arr[j+1])
//			{
//				hasChanged = true;
//				swap(arr, j, j+1);
//			}
//		}
//	}
//}
//
////Q4
//public static void partsSorting(int[] arr, int n)
//{
//	int numOfIndexesEachTime = arr.length/n;
//	
//	for(int i=0; i<arr.length; i+=numOfIndexesEachTime)
//	{		
//		partialSort(arr, i, i+numOfIndexesEachTime-1);
//	}
//}
//
////Q5
//public static void sort2DArray(int[][] arr)
//{
//	for(int i=0; i<arr.length; i++)
//	{
//		bubbleSort(arr[i]);
//	}
//}
//
////Q6
//public  static  int[]  mergeArrays(int arr1[],  int arr2[]) 
//{
//    int[]  res = new int[arr1.length + arr2.length];
//	int i=0, j=0;
//	
//	while ( i < arr1.length && j < arr2.length )	
//	{
//		if (arr1[i] <= arr2[j]) 
//		      res[i+j] = arr1[i++];
//		else
//		      res[i+j] = arr2[j++]; 
//	}
//
//	while ( i < arr1.length) // copy rest of arr1
//		res[i+j] = arr1[i++];
//
//	while ( j < arr2.length) // copy rest of arr2
//		res[i+j] = arr2[j++];
//
//     return res;
//}
//}
