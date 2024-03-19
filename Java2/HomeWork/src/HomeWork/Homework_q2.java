package HomeWork;

public class Homework_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z,u;
		
		x = MyConsole.readInt("enter x: ");
		y = MyConsole.readInt("enter y: ");
		z = MyConsole.readInt("enter z: ");
		u = MyConsole.readInt("enter u: ");
		
		int temp = x;
		x = y;
		y = z;
		z = u;
		u = temp;
		
		System.out.println("x = " + x + " y = " + y);
		System.out.println("z = " + z + " u = " + u); //eldads work
		
		}

}
