package HomeWork2;

public class Homework_q4 {

	public static void main(String[] args) {
		
		int x = MyConsole.readInt("Enter a number: ");
		int c = 0;
		while (x!=0){
			if(x%10 ==0) {
				c++;
			}
			x = x/10;
		}
		System.out.println(c);

		}
		
	
	}

