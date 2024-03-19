package HomeWork2;

public class Homework_q5 {

	public static void main(String[] args) {
		int N;
		N = MyConsole.readInt("Enter a number: ");
		int counter = 0;
		int sum = 1;
		while (N>counter) {
			counter++;
			sum = sum +counter;
		}
		System.out.println(sum);
		}

	}


