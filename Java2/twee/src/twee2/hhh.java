package twee2;

public class hhh {
	public static int balanced (String s) { //////my answer for test 2020 A q2
		char []newS=new char [s.length()];
		for(int i=0; i<s.length(); i++) {
			newS[i]=s.charAt(i);
		}
		int countS=0, countR=0, countSum=0;
		for (int i=0; i<s.length(); i++) {
			if(newS[i]=='S') countS++;
			else { countR++;
			}
			if(countR==countS){countSum++;
			}
		}
		return countSum;
	}
	
	public static void spiral(int [][]a) {//doesnt work yrggggg
	int i=0, j=0;
	int firstRow=0;
	int firstCol=0;
	int len=a.length;
	for(int lastCol=0, lastRow=0; firstCol==(int)(len/2);i++) {
			for(; j<a[0].length-lastCol; j++) {
				System.out.print(a[i][j] + ", ");
			}
			for(j=j-1, i=i+1;i<a.length-lastRow;i++) {
				System.out.print(a[i][j] + ", ");
			}
			for(i=i-1;j>=firstCol;j--) {
				System.out.print(a[i][j] + ", ");
			}
			for(j=j+1;i>=firstRow;i--) {
				System.out.print(a[i][j] + ", ");
			}
			firstRow+=1;
			firstCol+=1;
			lastRow+=1;
			lastCol+=1;
		}
	
	}
	
	public static boolean semi(int n) {/////my answer for test 202A q1
		
		int arr[]=new int[n];
		int m=0;
		for(int i=2; i<n; i++) {
			boolean ans=true;
			for(int j=2; j<i && ans; j++) {
				if (i%j==0) ans=false;
			}
			if(ans) {
				arr[m]=i;
				m++;
			}
		}
		for(int s=0; s<m; s++) {
			for (int j=0;j<m;j++) {
				if(arr[s]*arr[j]==n) return true;
			}
		}
		return false;
				
	}
	  private static boolean semiPrime(int n) {////answer for test 2020A q1
	        for(int i=2; i<n; i++)
	            for(int j=i; j<n; j++)
	                if(isPrime(i) && isPrime(j) && i*j == n)
	                    return true;
	        return false;
	    }
	    private static boolean isPrime(int n) {
	        for(int i=2; i<=Math.sqrt(n); i++)
	            if(n%i == 0)
	                return false;
	        return true;
	    }
	    
	    public static boolean even(int []a, int from, int to) {//////didnt do recursive, 2018B q1 my answer 
	    	if(from>to && from<0 && to<0 && from>=a.length && to>=a.length) return false;
	    	else {
	    		for(int i=from; i<=to; i++) {
	    			if(a[i]%2!=0) return false;
	    		}
	    		return true;
	    	}
	    }
	    public static String remove (String str, int n) {//doesnt work 2018 B q2 
	    	int i=(int)(Math.random()*(str.length()-n-2)+n);
	    	System.out.println(i);
	    	String finals=str;
	    	for(;n>=0;n--) {
	    		String sub1=finals.substring(i+1,str.length());
	    		String sub2=finals.substring(0,i);
	    		finals=sub2+sub1;
	    	}
	    	return finals;
	    }
	    
	    public static void shiftRight(int[][]mat) { ////2018B q3
	    	int temp[]= new int [mat[0].length];
	    	
	    	for(int i=0; i<temp.length;i++) {
	    		temp[i]=mat[0][i];
	    	}
	    	for (int i=0; i<mat.length;i++) {
	    		for(int j=1; j<mat[0].length;j++) {
	    			mat[i][j]=mat[i][j-1];
	    		}
	    	}
	    	for(int i=0; i<temp.length;i++) {
	    		mat[mat.length-1][i]=temp[i];
	    	}
	    	
	    }
	    	
	public static void main(String[] args) {
//		int menu = 1;
//		System.out.println();
//		while (menu != 0){
//			System.out.println("The Menu:\n1: New File");
//			System.out.println("2: Open File");
//			System.out.println("3: Save File");
//			System.out.println("0: Exit");
//			menu = MyConsole.readInt("Make Your Coice: ");
//			switch(menu){
//			case 1:
//				System.out.println("\nNew File");
//			case 2:
//				System.out.println("\nOpen File");
//				break;
//			case 3:
//				System.out.println("\nSave File");
//			default:
//				if(menu != 0){
//					System.out.println("\nYou did not enter a valid value");
//				}
//			break;
//			}
//			System.out.println();
//		}
//		System.out.println("Bye-Bye...");
//		String x = "hello world";
//		System.out.println(x.toUpperCase());
//		System.out.println(x);
//		System.out.println((x.length()));
//		System.out.println(x.charAt(3));
//		x.startsWith("NO");
//		System.out.println(x);
//		int y= x.indexOf("lol");
//		System.out.println(y);
//		x=x.replaceAll("ll", "o");
//		System.out.println(x);
//		int a=1;
//		addOne(a);
//		System.out.println(a);
//	}
//	public static void addOne(int a) 
//	{ 
//	a= a + 1;
//	System.out.println(a);;
//		int [][] mat = {{1,2,3,4}, {12,13,14,5},{11,16,15,6},{10,9,8,7}};
//		spiral(mat);
//		System.out.println(semi(6));
//		System.out.println('a'+'b');
		String a="123456";
		int [][]arr= {{1,4,7,10},
				      {2,5,8,11},
				      {3,6,9,12}};
		
		shiftRight(arr);
		//System.out.println(Arrays.deepToString(arr));
//		System.out.println(even(a,2,4));
//		System.out.println(remove(a, 3));
//		for (int i=0; i<mat.length;i++) {
//			for(int j=0; j<mat[0].length; j++) {
//				System.out.println(mat[i][j]);
//			}
//				
//		}
//	

//		String s= "SRRSSS";
//		System.out.println(balanced(s));
		}
		
}