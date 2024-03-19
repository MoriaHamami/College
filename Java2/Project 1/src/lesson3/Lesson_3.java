package lesson3;

public class Lesson_3 {

	public static void main(String[] args) {
        int sum = 0;
        int n = MyConsole.readInt("get n");
		/*
		 * for (int i = 1; i<=n; i = i+1) { sum = sum + i; }
		 * System.out.println("sum = "+sum);
		 */        int i = 1;
        sum = 0;
        for(; i<=n; i = i+1) {
        	sum = sum + i;       	
        }
        System.out.println("sum = "+sum+", i="+i);
	}
}
