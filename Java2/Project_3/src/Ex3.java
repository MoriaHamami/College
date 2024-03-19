public class Ex3 {

	public static boolean validPassword(String s) {
		
		boolean cond1, cond2, cond3, cond4;
		cond1=cond2=cond3=false;
		cond4=true;
		
		cond1=s.length()>=6;
	
		for(int i=0; i<s.length(); i++) {
			
			char cha=s.charAt(i);
			
			if(cha>='0' && cha<='9') cond2=true;
			if(cha=='!' || cha=='@' || cha=='#' || cha=='$' || cha=='%') cond3=true;
			if (cha==' ') cond4=false;
		}
		boolean ans= cond1&&cond2&&cond3&&cond4;
		return ans;
	}

	public static String sentence(String s)	{
		if (s.length()==1) return s;
		else {
		String [] words = s.split(" ");
		String newWord="";
		for (int i=words.length-1;i>0; i--) newWord=newWord+words[i]+" ";
		newWord+=words[0];
		return newWord;
		}
	}

	public static boolean deletions(String s, String t) {
		
		boolean ans=false;
		int m=0;
		
		if (t.length()>s.length()) return false;
		else {
			int i=0;
			for(;i<s.length();i++) {
				if(t.charAt(m)==s.charAt(i)) {
					m++;
					if (m==t.length()) {
						ans=true;
						break;
					}
				}
			}
			return ans;
		}
	}

	public static int divide(int a, int b) {
		if(a==b) return 1;
		else if(a<b) return 0;
		else return 1+divide(a-b,b);
	}

}
