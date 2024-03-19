package HomeWork7;

public class Homework_q9 {
	public static double SumDigits(int num) {
		int sum=0;
		if (num==0) {
			return;
		}
		SumDigits(num/10);
		return sum = sum + num%10;
		//got it wrong
		//in the answers:
		// if n=0 return 0
		// return n%10 +digtsum(n/10)
		
	}
	public static void main(String[] args) {
SumDigits(10);
	}

}
