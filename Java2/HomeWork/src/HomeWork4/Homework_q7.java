package HomeWork4;

public class Homework_q7 {

	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = MyConsole.readInt("Enter num1: ");
		num2 = MyConsole.readInt("Enter num2: ");
		num3 = MyConsole.readInt("Enter num3: ");
		
		int first, second=0, third;
		third = Math.max(num1, num2);
		third = Math.max(third, num3);
		first = Math.min(num1, num2);
		first = Math.min(first, num3);
		
		if (third != num1 && first != num1) second = num1; 
		if (third != num2 && first != num2) second = num2; 
		if (third != num3 && first != num3) second = num3; 
		
		System.out.println(first + ", " + second + ", " + third);
	}
}
