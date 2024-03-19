package S2HW;

public class HW1recurss {

		public static int sum1(int a,int b) {
		if (b>0) {
			if(b==0) return a;
			return 1+sum1(a,b-1);
		}
		else {
			if(b==0) return a;
			return sum1(a,b+1)-1;
			}
		}
			
		public static int sub1(int a,int b) {
		if (b>0) {
			if(b==0) return a;
			return sub1(a,b-1)-1;
		}
		else {
			if(b==0) return a;
			return sub1(a,b+1)+1;
			}
		}
	
		public static int multi(int a,int b) {
		if(b==0||a==0) return 0;
		else if	(b>0) return multi(a,b-1)+a;
		else return multi(a,b+1)-a;
		}
	
		public static int divide(int a,int b) {
		if(a==0) return 0;
		else if	((a>0 && b>0) || (b<0 && a<0)) return divide(a-b,b)+1;
		else return divide(a+b,b)-1;
		}
		
		public static int remains(int a,int b) {
			if (a==b) return 0;
			if(a>0 && b>0) {
				if(a<b) return a;
				return remains(a-b,b);
			}else if(b<0 && a<0) {
				if(a>b) return a;
				return remains(a-b,b);
			}else if(b<0 && a>0){
				if(a<b) return a;
				return remains(a+b,b);
			}else {
				if(a>b) return a;
				return remains(a+b,b);//dont know how to do this part
			}
		}
		
		public static int two_n(int n) {
			if(n==0) return 1;
			return two_n(n-1)*2;
			
			}
		
		 public static void Reverse(int num) {//found on the internet :)
			 // base condition to end recursive calls
			 if (num < 10) {
		            System.out.println(num);
		            return;
			 }else{
			 // print the unit digit of the given number
		     System.out.print(num % 10);
		     // calling function for remaining number other than unit digit
		     Reverse(num / 10);
			 }
		 }
		
	    public static String reverse(String str) {//found on the internet :)
	        if ((null == str) || (str.length()  <= 1)) return str;
	        String reversed = reverse(str.substring(1)) + str.charAt(0);
	        return reversed;
	    }
	    
		public static void main(String[] args) {
		
//		System.out.println(sub1(10,5));
//		System.out.println(sub1(10,-5));
//		System.out.println(sub1(-10,5));
//		System.out.println(sub1(-10,-5));
//		System.out.println(sub1(0,5));
//		System.out.println(sub1(10,0));
//		System.out.println(multi(0,5));
//		System.out.println(multi(10,0));
//		System.out.println(multi(1,-5));
//		System.out.println(multi(-5,1));
//		System.out.println(multi(-5,-5));
//		System.out.println(divide(0,5));
//		System.out.println(divide(10,2));
//		System.out.println(divide(10,-5));
//		System.out.println(divide(-5,1));
//		System.out.println(divide(-5,-5));
//		System.out.println(remains(5,3));
//		System.out.println(5%3);
//		System.out.println(remains(10,2));
//		System.out.println(10%2);
//		System.out.println(remains(10,-5));
//		System.out.println(10%(-5));
//		System.out.println(remains(-5,3));
//		System.out.println((-5)%3);
//		System.out.println(remains(-5,-3));
//		System.out.println((-5)%(-3));
		System.out.println(two_n(3));
		System.out.println(reverse("Hello"));
		Reverse(12345);
		}

}
