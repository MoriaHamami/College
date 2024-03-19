package secondp;

public class second_3 {

	public static void main(String[] args)
	{
		int x=3, y=8;
		boolean bsmaller = x < y, bbigger = x > y, bEq = x==y, bnoteq = x !=y;
		System.out.println("x<y? " +bsmaller+", x>y? "+bbigger+ ", x==y?" +bEq + ", !=y?"+bnoteq+ ", x==x? "+ (x==x));
		int mx = x;
		if (x<y) 
		{
			mx=y;
		}
		System.out.println("max(x,y) = "+mx);
		int mn = x;
		if (x>y) {
			mn = y;
		}
		System.out.println("min(x,y) = "+mn);
		mx = Math.max(x,y);
		mn = Math.min(x,y);
		System.out.println("לא הספקתיo");
	}
	
	
	
}
