package Homework8;

public class Homework {
	
	public static int sum(int a, int b) {
		if(b==0) {
			return a;
		}
		return sum(a, b-1)+1;
	}
	
	public static int substract(int a, int b) {
		if(b==0) {
			return a;
		}
		return substract(a, b-1)-1;
	}
	
	public static int multiply(int a, int b) {
		if(b==1) {
			return a;
		}
		return multiply(a, b-1)+a;
	}
	
	public static int division(int a, int b) {
		if(a<b) {
			return 0;
		}
		return division(a-b, b)+1;
	}
	
	public static int remainder(int a, int b) {
		if(a<b) return a;
		return remainder(a-b, b);
	}
	
	
	public static int two(int a) {
		if(a==0) return 1;
		return two(a-1)*2;
	}
	
	public static int backwards(int a) {
		if(a<10) {
			return a;
		}
		int num=0;
		while(a>0) {
			 num =(a%10+ num) *10;
			a=a/10;
		}
		return num/10;
	}
	
	public static int backwards_nonRec(int a) {
		if(a<b) return ;
		return beackwards(, b);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,-6));
		System.out.println(substract(0,7));
		System.out.println(remainder(15,11));
		System.out.println(backwards(123));
		

	}

}
