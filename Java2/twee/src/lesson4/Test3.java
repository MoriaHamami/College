package lesson4;

public class Test3 {

	public static void main(String[] args) {
		int[]a = {6,8,10,1,7};
		for(int i=0; i<a.length; i=i+1) {
			boolean isMax = true;
			int m = a[i];
			for(int j=0; isMax && j<a.length; j=j+1) {
				if (a[i] < a[j]) {
					isMax = false;
				}
			}
			if (isMax) {
				System.out.println("max(a) = "+m);
				break;
			}
		}

	}

}
