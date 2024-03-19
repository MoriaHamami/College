package HomeWork2;

public class Homework_q2 {

	public static void main(String[] args) {
		int N = MyConsole.readInt("Enter a number: ");
		if(N <= 0) { //In this situation we don't have to use the IF because the loop covers it.
		System.out.println("0");
		}
		int i = 1;
		int sum = 0;
		while(i<=N)
		{
		sum = sum + i;
		i++;
		}
		System.out.println(sum);
		

	}

}
