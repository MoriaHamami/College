package HomeWork_q9;

public class Homework_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

////////SOLUTIONS:
////INTERVAL TESTER
//
//public class IntervalTester {
//
//	public static void main(String[] args)
//	{
//		Point p1 = new Point(2,2);
//		Point p2 = new Point(3,4);		
//		Interval2 keta1 = new Interval2(p1,p2);
//		
//		System.out.println(keta1.toString()); // Try also: System.out.println(keta);  //why it also works?
//		
//		System.out.println("Keta Distance: " + keta1.intrLength());
//		
//		Point p = keta1.midPoint();
//		System.out.println("Middle Point: " + p.toString()); // Try also: System.out.println("Middle Point: " + p);
//		
//		Interval2 keta2 = new Interval2(keta1); //create another keta, identical to keta1, using the copy constructor
//		System.out.println(keta1.compareLength(keta2)); //will print 0 because they are identical		
//	}
//
////POINT
//	public class Point 
//	{
//		private double x;
//		private double y;
//		
//		public Point(double x, double y)
//		{
//			setX(x);
//			setY(y);
//		}
//		
//		//copy constructor
//		public Point(Point p)
//		{
//			this(p.getX(), p.getY());
//		}
//		
//		//getters & setters
//		public double getX()
//		{
//			return this.x;
//		}
//		
//		public double getY()
//		{
//			return this.y;
//		}
//		
//		public void setX(double x)
//		{
//			this.x = x;
//		}
//		
//		public void setY(double y)
//		{
//			this.y = y;
//		}
//		
//		public String toString()
//		{
//			return "(" + getX() + "," + getY() +")";
//		}
//	}
//
////QUESTIONS
//
//public class Interval2 
//{
//	private Point p1;
//	private Point p2;
//	
//	public Interval2(Point p1, Point p2)
//	{
//		setP1(p1);
//		setP2(p2);
//	}
//	
//	//copy constructor
//	public Interval2(Interval2 keta)
//	{
//		this(keta.getP1(), keta.getP2());	
//	}
//	
//	/*formula: sqrt((x2-x1)^2 + (y2-y1)^2)
//	 * Math.sqrt(a) - returns the root of a
//	 * Math.pow(a,b) - returns the result of a^b
//	 */
//	public double intrLength()
//	{
//		double distance = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2) + Math.pow((getP2().getY() - getP1().getY()), 2));
//		return distance;
//	}
//	
//	public String toString()
//	{
//		return "P1: " + getP1().toString() + " P2: " + getP2().toString();
//	}
//	
//	/*formula: 
//	 * x = (x1+x2) / 2
//	 * y = (y1+y2) / 2
//	 */
//	public Point midPoint()
//	{
//		double x = (getP1().getX() + getP2().getX()) / 2;
//		double y = (getP1().getY() + getP2().getY()) / 2;
//		return new Point(x,y);
//	}
//	
//	public int compareLength(Interval2 keta)
//	{
//		if(this.intrLength() > keta.intrLength())
//			return 1;
//		else if(this.intrLength() < keta.intrLength())
//			return -1;
//		else
//			return 0; //if equal return 0
//	}
//	
//	//getters & setters
//	public Point getP1()
//	{
//		return p1;
//	}
//	
//	public Point getP2()
//	{
//		return p2;
//	}
//	
//	public void setP1(Point p)
//	{
//		p1 = new Point(p);  //deep copy
//	}
//	
//	public void setP2(Point p)
//	{
//		p2 = new Point(p);  //deep copy
//	}
//	
//}
