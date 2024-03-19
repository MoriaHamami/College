package lesson4;

public class Test2 {

	public static void main(String[] args) {
		int size = 5;
		int[]a = new int[size];
		for (int i=0; i<a.length; i = i+1) {
			a[i] = MyConsole.readInt("get a["+i+"]");
		}
		for (int i=0; i<a.length; i = i+1) {
			System.out.print(a[i]+" ,");
		}
		System.out.println();
		int m = a[0];
		for (int i=1; i<a.length; i = i+1) {
			if (a[i] > m) {
				m = a[i];
			}
		}
		System.out.println("max(a) = "+m);
	}
}
