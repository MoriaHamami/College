package lesson3;

public class IsPrime {

	public static void main(String[] args) {
		   int n = MyConsole.readInt("get n");
		   boolean ans = true;
		   long start = System.currentTimeMillis();
		   for (int i =2; i<=n-1; i = i + 1) {
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
