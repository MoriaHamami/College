package HomeWork;

public class Homework_q5 {

	public static void main(String[] args) 
	{
		int x;
	
		x = MyConsole.readInt("Enter a number: ");
		
		while (x > 999) {
		System.out.println("Fault! Enter a 3 digit number."); 
		x = MyConsole.readInt("Enter a number: ");
		}
		
		System.out.println("The first digit is: " + x%10); 
		System.out.println("The second digit is: " + ((x%100) / 10)); //my work
	}
}


