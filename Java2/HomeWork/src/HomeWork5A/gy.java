package HomeWork5A;

public class gy {

	public static void main(String[] args) {
			int a2[][] = {
				{0,1,2},
				{2,3,4},
				{4,5,6}};
			int count= 0;
			int ans[][]=new int[a2.length][a2[0].length];
			for (int i=0; i<a2.length; i++) {
				for(int j=0; j<a2[i].length; j++) {
					if ((ans[i][j])==0) {
						count++;
					}
					else {
					while((ans[i][j])%10==0) {
						count++;
						(ans[i][j])/=10;
						if ((ans[i][j])==0) 
							{count++;
							break;
							}
					}
					} //DOESNT WORK UGHHHHHHH
				}
		
			

	}
			System.out.println(count);

}
}
