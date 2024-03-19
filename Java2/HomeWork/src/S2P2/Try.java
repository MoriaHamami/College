package S2P2;

public class Try {
	
	//public static Point[] maximaOfPoints(Point []s) {
		Point middle[]=new Point [s.length]; 
		int size=0,found=0;
		for(int j=0;j<s.length;j++) {
			for(int i=0;i<s.length;i++) {
				if((s[i].getX()<=s[j].getX())||(s[i].getY()<=s[j].getY())) found++; 
	        }
		 found=0;
		 if(found==s.length) middle[size++]=s[j];
        }
		
		Point res[]= new Point [size];
		for(int i=0;i<size;i++) res[i]=middle[i];
		return res;
	}
	
public static void main(String[] args) {
	//Q1.a test
	System.out.println("Q1.A");
	char[] array= new char[]{'W','B','B','B','W', 'W', 'B', 'W', 'W', 'B'};
	System.out.println(spreadCardsOnTable(array));
	//Q1.b test
	System.out.println("Q1.B");
	System.out.println(createOriginalLayout(0));
	//Q4 test 
	System.out.println("Q4");
	int[] arr1= new int[]{2,3,4};
	int[] arr2= new int[]{1,3,12,15,100};
	ifExists(arr1, arr2, 1);
	int[] arr3= new int[]{1,12,14};
	int[] arr4= new int[]{1,2,3,4,100};
	ifExists(arr3, arr4, 15);
	int[] arr5= new int[]{1};
	int[] arr6= new int[]{1};
	ifExists(arr5, arr6, 2);
	int[] arr7= new int[]{};
	int[] arr8= new int[]{};
	ifExists(arr7, arr8, 15);
	Point s[]= new Point[3];
	Point ans[]= new Point[3];
	s[0]=new Point(0,0);
	s[1]=new Point(1,2);
	s[2]=new Point(2,4);
	ans=maximaOfPoints(s);
	for (int i=0; i<ans.length;i++) System.out.println(ans[i].toString());
}

}
