package lesson3;

public class IsPrimenLong {

	public static void main(String[] args) {
		   int n = MyConsole.readInt("get n");
		   int count = 0;
		   long start = System.currentTimeMillis();
		   for(int i = 2; i<=n; i=i+1) {
			   boolean ans = true;
			   for(int j = 2; ans && j<=i-1; j = j+1) {
				   if (i%j==0) {
					   ans = false;
				   }
			   }
			   if (ans) {
				   count = count + 1;
				/*
				 * System.out.print(i+", "); 
				 * if (count%10==0) {
				 *  	System.out.println(); 
				 * }
				 */			   }
		   }
		   long end = System.currentTimeMillis();
		   System.out.println("time = "+(end-start) + " ms");
		   System.out.println("num of primes = "+count);
	}

}
/**
 * get n 200000
	time = 5713 ms
	num of primes = 17984

 */
