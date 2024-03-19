package HomeWork3;

import HomeWork.MyConsole;

public class Homework_q3 {

	public static void main(String[] args) {
		int m, n;
		m = MyConsole.readInt("Enter a number:");
		n = MyConsole.readInt("Enter a number:");
		double sum=m;
		if (n==0) 
		{
			sum =1;
			System.out.println(sum);	
		}
		
		else if (n<0){
			for (int i = -1; i>n; i--) {
				sum *=m;
				
			}	
			sum=1/sum;
			System.out.println(sum);
		}
		else
		{ 
		for (int i = 1; i<=n; i++) {
			sum *=m;
			
			}System.out.println(sum);
		}
	}

}


