package HomeWork5B;

import java.util.Arrays;

import HomeWork2.MyConsole;

public class Homework_q6 {

	public static void main(String[] args) {
		String x = MyConsole.readString("Enter something:");
		
		char c[] = new char [x.length()];
		for (int i = 0; i<c.length; i++) {
			c[i] = x.charAt(i);
		}
		for (int i=0; i<c.length; i++) {
			for (int m=i+1; m<c.length; m++) {
				if (c[i]>c[m]) {
					char temp=c[i];
					c[i]=c[m];
					c[m]=temp;
					
				}
			}
	
		}
		System.out.println(Arrays.toString(c));
	}

}
