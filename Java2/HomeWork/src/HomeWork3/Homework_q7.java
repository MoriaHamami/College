package HomeWork3;

import HomeWork.MyConsole;

public class Homework_q7 {

	public static void main(String[] args) {
			int x;
			x = MyConsole.readInt("Enter a number: ");
			for (int t=x; t>=1; t--)
			{
				for(int y =t ; y>=1; y--)
				{
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			

		}

	}
