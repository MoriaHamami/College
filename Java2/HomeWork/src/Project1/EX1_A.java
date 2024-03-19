package Project1;

import HomeWork2.MyConsole;

public class EX1_A {

	public static void main(String[] args) {
		
		int n, m, i=0;
		
		// Receive numbers for n and m :
		n = MyConsole.readInt("Enter number for n: ");
		m = MyConsole.readInt("Enter number for m: ");
		
		if (n >= 2 && m>0) {
			int [] arr = new int [n];
			boolean ans= true;
			
			// Put prime numbers in the array :
			for (; n > 1; n--) {
				
				ans = true;
				
				for (int count =2; count<n && ans; count++) {	 
					   if (n%count==0) { 
						  ans= false;
					   }
				}
				 if (ans==true) {
					 arr[i] = n;
					 i++;
				 }
			}
			int [] arr1 = new int [i];
			for (int x = 0; x < i; x++) {
				arr1[x]=arr[x];
			}
				
				
			// Find prime gaps and print :
			int noGaps = 0;
			for (i = 0; i < (arr1.length-1); i++) {
				if (arr1[i] == arr1[i+1] + m) {
					System.out.print("(" + arr1[i+1] + "," + arr1[i] + ") ");
					noGaps++;
					}
				}
			if (noGaps == 0) {
				System.out.print("There are no prime gaps.");
			}
			

			}
		else {
			System.out.print("There are no prime gaps.");
		
		}
	}
}
	
