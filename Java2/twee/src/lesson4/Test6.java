package lesson4;

public abstract class Test6 {

	public static void main(String[] args) {
		int[]a = {8,9,15,13,19,25,29,133,1,12,13};
		int count = 1, ans = 1, end = 0;
		for(int i=1; i<a.length; i=i+1) {
			if (a[i] > a[i-1]) {
				count = count+1;
				if (count > ans) {
					ans = count;
					end = i;
				}
			}
			else {
				count = 1;
			}
		}
		int[]aAnas = new int[ans];	
		int beg = end - ans + 1;
		for (int i=beg; i<=end; i = i+1) {
			aAnas[i-beg] = a[i];
		}
		
		System.out.println("ans = "+ans);
		for (int i=0; i<aAnas.length; i = i+1) {
			System.out.print(aAnas[i]+" ,");
		}
	}
}
