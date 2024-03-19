package lesson3;

public class IsPrimeSqrt {

	public static void main(String[] args) {
		   int n = MyConsole.readInt("get n");
		   boolean ans = true;
		   long start = System.currentTimeMillis();
		   double sq = Math.sqrt(n);
		   for (int i =2; i<=sq; i = i + 1) {
			   if (n%i == 0) {
				   ans = false;
			   }
		   }
		   long end = System.currentTimeMillis();
		   long time = end - start;
		   System.out.println(n + " is prime? "+ans+
				   "; time = "+time +" ms");
	}

}
