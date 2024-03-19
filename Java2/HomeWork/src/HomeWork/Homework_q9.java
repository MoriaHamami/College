package HomeWork;

public class Homework_q9 {

	public static void main(String[] args) {
		int x;
		
		x = MyConsole.readInt("Enter a number: ");

		
		
		if(x<999 && x > 100)
		{
			int s= x%10;
			int t= x/10%10;
			int m= x/100%10;
			System.out.println(s + m + t); 
		}

	}

}
