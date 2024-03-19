package firstp;

public class first_1 {

	public static void main(String[] args) {
		int x = 13, y = 7; 
		int zp = x + y;
		int zm = x - y;
		int zmul = x * y;
		int zdiv = x/y;
		System.out.println("x+y="+zp+", x-y="+zm+", x*y="+zmul+", x/y="+zdiv);
		double t = x/y;
		System.out.println("t = "+t);
		double u = 13.;
		t = u/y;
		System.out.println("t = "+t);
	}

}
