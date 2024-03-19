package HomeWork2;

public class Homework_q3 {

	public static void main(String[] args) {
		int x;
		x = MyConsole.readInt("Enter a number: ");
		int c = 0;
		if(x!= 0)
		{
			while(x>0) 
			{
			  x =x/10;
			  c = c + 1;
			
			}
			System.out.print(c);
		}
		else
		{
			System.out.println("1");
		}
		
		
	}

}
