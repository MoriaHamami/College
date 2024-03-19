package HomeWork2;

public class Homework_q1 {

	public static void main(String[] args) 
	{
		double a, b;
		a = MyConsole.readDouble("Enter number a:");
		b = (double)MyConsole.readInt("Enter number b:");
		
		if (a==0 && b==0) 
		{
			System.out.println("Einsof Pitronot");
		}
		else if (a==0);  //No need to write that b isn't equal to zero because it passed the IF above
		{
			System.out.println("Ein Pitronot");
		}
			System.out.println(b/a); 
		
	}

}
