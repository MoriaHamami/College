package HomeWork3;

import HomeWork2.MyConsole;

public class Homework_q4 {

	public static void main(String[] args) {
		int current=1;
		int prev=1;
		int temp;
		int n;
		n = MyConsole.readInt("Enter a number");
		if (n<=2) {
			System.out.println("The Fibonacci number is= "+1);
		}
		else {
			for (int i = 2; i <n; i++) {
				temp = current;
				current+=prev;
				prev = temp;
			}
			System.out.println("The fibbonachi number is" + current);
			
		}

	}

}
