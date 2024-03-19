package lesson4;

public class Test4 {

	public static void main(String[] args) {
		int size = 10;
		int[]arr = new int[size];
		int a = MyConsole.readInt("get a");
		int b = MyConsole.readInt("get b");
		// random numbers in [a,b)
		for(int i=0; i<arr.length; i = i+1) {
			arr[i] = (int)((b-a)*Math.random()) + a;
		}
		for (int i=0; i<arr.length; i = i+1) {
			System.out.print(arr[i]+" ,");
		}
		
	}

}
