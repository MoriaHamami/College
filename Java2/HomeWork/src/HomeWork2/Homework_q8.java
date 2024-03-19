package HomeWork2;

public class Homework_q8 {

	public static void main(String[] args) {
		int N, M, K, MAX, MAX2;
		N = MyConsole.readInt("Enter a number: ");
		M = MyConsole.readInt("Enter a number: ");
		K = MyConsole.readInt("Enter a number: ");
		MAX = Math.max(N, M);
		MAX2 = Math.max(MAX, K);
		System.out.println(MAX2);
	}

}
