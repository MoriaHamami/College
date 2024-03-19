package lesson3;

public class Lesson_3_1 {

	public static void main(String[] args) {
        double sum = 1;
        int n = MyConsole.readInt("get n");
        long pow = 2;
        for (int i=1; i<=n; i=i+1) {
        	sum = sum + 1.0/pow;
        	pow = pow*2;
        	if (sum == 2) {
        		System.out.println("i = "+i);
        	}
        }
        System.out.println("sum = "+sum);
	}

}
