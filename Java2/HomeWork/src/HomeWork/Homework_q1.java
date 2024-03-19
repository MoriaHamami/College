package HomeWork;

public class Homework_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1 , num2;
	num1 = MyConsole.readInt("Enter a number: ");
	num2 = MyConsole.readInt("Enter a number: ");
	
	System.out.println("num1: " + num1);
	System.out.println("num2: " + num2);
	
	int temp = num2;
	num2 = num1;
	num1 = temp; 
	
	System.out.println("num1: " + num1);
	System.out.println("num2: " + num2); //eldads work

	}
}
