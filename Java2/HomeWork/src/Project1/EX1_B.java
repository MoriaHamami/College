package Project1;

import HomeWork2.MyConsole;

public class EX1_B {

	public static void main(String[] args) {
		
		while(true) {
			
			int x;
			
			do {
			x = MyConsole.readInt("enter a number: 0) exit, 1) aX^2+bX+c=0");
			} while (x != 0 && x != 1);
			
			
			if (x==0) {
				break;
			}
			
			if (x==1) {
			
				double a, b, c;
				a= MyConsole.readDouble("enter a: ");
				b= MyConsole.readDouble("enter b: ");
				c= MyConsole.readDouble("enter c: ");
				
				double delta = (Math.pow(b, 2))-(4*a*c);
				
				if (a==0 && b==0 && c==0) {
					System.out.println(a + "X^2+" + b + "X+" + c + "=0");
					System.out.println("X takes all values");
					System.out.println();
				}
				else if (a==0 && b==0) {
					System.out.println(a + "X^2+" + b + "X+" + c + "=0");
					System.out.println("No solution");
					System.out.println();
				}
				else if (a==0 && b!=0) {
						System.out.println(a + "X^2+" + b + "X+" + c + "=0");
						System.out.println("x1=x2=" + (-c)/b);
						System.out.println();
				}
				else if (delta<0) {
					System.out.println(a + "X^2+" + b + "X+" + c + "=0");
					System.out.println("No solution");	
					System.out.println(); 
					}
				else if (delta==0) {
					System.out.println(a + "X^2+" + b + "X+" + c + "=0");
					System.out.println("x1=x2=" + (-b)/(2*a));
					System.out.println();
					}
				else {
					System.out.println(a + "X^2+" + b + "X+" + c + "=0");
					System.out.print("x1=" + ((-b) + Math.sqrt(delta))/(2*a) + " ");
					System.out.println("x2=" + ((-b) - Math.sqrt(delta))/(2*a));
					System.out.println();
				}
			
			}
		}
		
		System.out.print("done!");
	}

}
