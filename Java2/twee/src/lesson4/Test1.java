package lesson4;


public class Test1 {

	public static void main(String[] args) {
		int size = 5;
		double []arr = new double[size];
		for (int i=0; i<arr.length; i = i+1) {
			arr[i] = Math.random();
		}
		for (int i=0; i<arr.length; i = i+1) {
			System.out.println(arr[i]);
		}
		int[]aint = new int[size];
		for (int i=0; i<aint.length; i = i+1) {
			aint[i] = (int)(arr[i]*10);
		}
		for (int i=0; i<aint.length; i = i+1) {
			System.out.print(aint[i]+" ,");
		}
		int sum = 0;
		for (int i=0; i<aint.length; i = i+1) {
			sum = sum + aint[i];
		}
		double avr = (double)sum/aint.length;
		System.out.println("average = "+avr);				
	}
	
}
/*
 * 0.08727431841158984
0.6051613239684359gggggggggggggggggggggggggggggg
0.7633054563032073
0.31719749180235546
0.21002123218275937
0.3122625746651375
0.5259213394498281
0.967170462546353
0.18129769319064037
0.012799666252238273
0 ,6 ,7 ,3 ,2 ,3 ,5 ,9 ,1 ,0 ,
 */
