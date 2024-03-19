package HomeWork5A;

import java.util.Arrays;

public class Homework_qs {

	public static void prArr2(int [][]arr2) {
		for(int i=0; i<arr2.length;i++)
		System.out.println(Arrays.toString(arr2[i]));
	}
	
	public static int sumArr2(int [][]arr2) {
		int count=0;
		for (int c=0; c<arr2.length; c++) {
			for (int r=0; r<arr2.length; r++) count += arr2[c][r];
		}
		return count;
		}
	
	
	public static int trace(int [][]a2) {
		int count=0;
		for (int c=0, r=0; c<a2.length; c++, r++) {
			count += a2[c][r];
		}
		return count;
		
	}
	
	public static int trace2(int [][]a2) {
		int count=0;
		for (int c=a2.length-1, r=a2.length-1; c>0; c--, r--) {
			count += a2[c][r];
		}
		return count;
			
	}
	
	public static boolean checkSymmetry(int[][]a2) {
		boolean ans; int count=0;
		if(a2[0][1] == a2[1][0]) count++;
		if(a2[0][2] == a2[2][0]) count++;
		if(a2[1][2] == a2[2][1]) count++;
			
		if (count == 3) ans=true;
		else ans=false;
			
		return ans;
		
	}
	
	public static int [][] transpose(int[][]a2) {
		int temp;
		temp = a2[0][1];
		a2[0][1] = a2[1][0];
		a2[1][0] = temp;
				
		temp = a2[0][2];
		a2[0][2] = a2[2][0];
		a2[2][0] = temp;
		
		temp = a2[1][2];
		a2[1][2] = a2[2][1];
		a2[2][1] = temp;
		
		return a2;
	}
	
	
	public static void transpose2(int[][]a2) {
		int a1[][]=new int [a2.length][a2.length];
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			a1[j][i]=a2[i][j];
			System.out.print(a1[j][i]+" ");   
			}
			System.out.println();
		}
	}
	
	public static int [][] transpose3(int[][]a2) {
		int a1[][]=new int [a2.length][a2[0].length];
		for(int i=0;i<a2.length;i++){    
			for(int j=0;j<a2[0].length;j++){  
			a1[i][j]=a2[j][i]; 
			}
		}
		return a1;
	}
	
	public static int numZeros (int [][] ans) {
        int count= 0;
     int a2[][]=new int[ans.length][ans[0].length];
     for (int i=0; i<ans.length; i++) {
    	 for(int m=0; m<ans[0].length; m++) {
    		 a2[i][m]=ans[i][m];
    	 }
     }
      for (int i=0; i<a2.length; i++) {
          for(int j=0; j<a2[0].length; j++) {
              while(a2[i][j]%10==0) {
                  count++;
                  a2[i][j]=a2[i][j]/10;
                  if (a2[i][j]%10!=0 || a2[i][j]==0) break;
              }
          }
      }
      return count;
  }
	public static void main(String[] args) {
		int arr[][] = {
				{0,1,2},
				{2,3,4},
				{4,5,6}};
		
		int arr2[][] = {
				{0,2,4},
				{2,3,5},
				{0,5,6100}};
		
		prArr2(arr);
		System.out.println("The sum is " + sumArr2(arr));
		System.out.println("Sum of the main diagonal line is " + trace(arr));
		System.out.println("Sum of the secondary diagonal line is " + trace2(arr));
		System.out.println("Is the square matrix symetric? " + checkSymmetry(arr));
		System.out.println("Is the square matrix symetric? " + checkSymmetry(arr2));
		System.out.println("The transposed matrix is " + Arrays.toString(transpose3(arr)));
		System.out.println("Number of zeros: ");
		System.out.println(numZeros(arr2));

	}

}
