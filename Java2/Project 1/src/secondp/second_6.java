package secondp;

import firstp.MyConsole;

public class second_6 {

	public static void main(String[] args) {
		float a = (float) MyConsole.readDouble("get a:");
		float b = (float) MyConsole.readDouble("get b:");
		double x;
		if (a != 0) {
			x = -b / a;
		} else {
			if (b == 0) {
				if (a == 0 && b != 0)
					System.out.println("no sol");
				// unfinished and incorrect
			}

		}

	}
}
