package firstp;

public class First_3 {

	public static void main(String[] args) {
		int x = MyConsole.readInt("get x:");
		System.out.println("x="+x);
		int one = x%10;
		System.out.println("one="+one);
		x = x/10;
		int ten = x%10;
		System.out.println("ten="+ten);
		x = x/10;
		int hund = x%10;
		System.out.println("hund="+hund);
		double radius = MyConsole.readDouble("get radius");
		double area = Math.PI*radius*radius;
		System.out.println("area="+area);
	}

}
