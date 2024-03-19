package HomeWork2;

public class Homework_q7 {

	public static void main(String[] args) {
		int m,n;
		int divider;
		m= MyConsole.readInt("Enter number 1: ");
		n= MyConsole.readInt("Enter number 2: ");
		if (m>n) {
			divider = n;
		}
		else {
			divider = m;
		}
		while (divider > 0) {
			if ( m%divider==0 && n%divider==0) {
				System.out.println("The biggest divider is: " + divider);
				divider= -1;
			}
			else {
				divider--;
			}
		}
		

	}

}
