package HomeWork3;

import HomeWork2.MyConsole;

public class Homework_q6 {

	public static void main(String[] args) {
		int n = MyConsole.readInt("Enter a number: ");
		
		if(n>0) 
		{
		
				int arr[]= new int [n];
				int counter = 0;
		
				for(int i= 1; i<n; i++);
					{
					if(n%i==0) {
					arr[counter] = i;
					counter++;
					}
				}
					int sum = 0;
				for (int i = 0; i<counter; i++) {
					sum +=arr[i];
					}//idk whats up with this code, the martze did it probably didnt copy right
	}

}
	
}
