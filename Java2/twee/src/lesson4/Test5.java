package lesson4;

public class Test5 {
	//the length of the longest monotony subsequence  
	public static void main(String[] args) {
		int[]a = {8,9,15,1,13,19,133,1,0,1,2,3,4,5};
		int count = 1, ans = 1;
		for(int i=1; i<a.length; i=i+1) {
			if (a[i] > a[i-1]) {
				count = count+1;
				if (count>ans) {
					ans = count;
				}
			}
			else {
				count = 1;
			}
		}
		System.out.println("ans = "+ans);
	}

}
