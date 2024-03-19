package package1;

public class EX1_A {

	public static void main(String[] args) {
		int m, n;
		m = MyConsole.readInt("Enter a number: ");
		n = MyConsole.readInt("Enter another number: ");
		
		for (int count = 1; count=>i++)
			if(n < 2){
				System.out.println("Not a prime");
			}				
			else{
	
				int i = 2;		
				boolean isprime = true;
				while(i <= Math.sqrt(n)){
					if(n % i == 0){
						isprime = false;						}
						i++;
				}
				
				System.out.println(isprime?"Prime!":"Not Prime");
					
				}
				

	}

}
