package HomeWork4;

public class Homework_q1 {

	public static void main(String[] args) {
		int N = MyConsole.readInt("Enter a number: ");
		int [] arr = new int [N];
		
		if (N>0) { //מערך עם אפס הוא בלי איברים
			for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*(N+1));
				}
		}
		else {
			System.out.println("0 zeros");
		}
		
		int sum = 0;
		
		for (int i = 0; i<arr.length; i++) { //gets into every cell in the array
			if(arr[i] == 0) {
				sum++;
				continue;
			}
			int save = arr[i];
			
			while (save != 0) {
				int digit = save%10;
				if(digit == 0) {
					sum++;
			}
			save/10;
		}
				
			}
		}

	}

}
