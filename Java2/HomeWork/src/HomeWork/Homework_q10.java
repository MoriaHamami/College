package HomeWork;

public class Homework_q10 {

	public static void main(String[] args) 
	{
		int x;
		x = MyConsole.readInt("Enter a number in sec:");
        int y = x/3600;
        x = x % 3600;
        int w = x / 60;
        x = x%60;
        int z = x;
        
        System.out.println("Hours:" + y);
        System.out.println("Minutes:" + w);
        System.out.println("Seconds:" + z);
	}

}
