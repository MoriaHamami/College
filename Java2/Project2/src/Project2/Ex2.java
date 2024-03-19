package Project2;

public class Ex2 {

	public static int[][] rgb2gray(int[][][] img) {
		int [][]newImg = new int [img[0].length][img[0][0].length];
			for (int i=0; i<img[0].length; i++) {
				for (int j=0; j<img[0][0].length; j++) {
					newImg[i][j]= (int)(0.3*img[0][i][j]+0.59*img[1][i][j]+0.11*img[2][i][j])*255;
				}
				
			}
			return newImg;
		}

	
	public static int[][][] crop(int[][][] img, int i_1, int j_1, int i_2, int j_2) {
		
		int [][][]newImg = new int [img.length][i_2-i_1+1][j_2-j_1+1];
		
		for (int m=0; m<=2; m++) {
			for (int i=i_1; i<i_2; i++) {
				for (int j=j_1; j<j_2; j++) {
				newImg[m][i-i_1][j-j_1]= img[m][i][j];
				}
			}
		}
					
		return newImg;
	}
	
	
	public static int[][][] Smooth(int[][][] img, int n) {
		
		int [][][]newImg = new int [img.length][img[0].length][img[0][0].length];
		int count= 0, r=0, g=0, b=0; 
		
			for(int i = 0; i<img[0].length; i++) {
				for (int j = 0; j<img[0][0].length; j++) {
					for(int h= i-n; h<=i+n; h++) {
						for (int l=j-n; l<=j+n; l++) {
						
					if (h>=0 && l>=0 && h<img[0].length && l<img[0][0].length) {
						r=r+img[0][h][l];
						g=g+img[1][h][l];
						b=b+img[2][h][l];
						count++;
							}		
						}
					}
						
					newImg[0][i][j]=r/count;
					newImg[1][i][j]=g/count;
					newImg[2][i][j]=b/count;
					r=0;
					g=0;
					b=0;
					count=0;
					
				}	
			}
		
		
		return newImg;
	}

	
	public static int[][][] rotate_alpha(int[][][] img, double alpha) {
		
		int [][][]newImg = new int [img.length][img[0].length][img[0][0].length];
		int iStat= (img[0].length-1)/2;
		int jStat= (img[0][0].length-1)/2;
		double rad = Math.toRadians(-alpha);
		
		for (int m=0; m<=2; m++) {
			for (int i=0; i<img[0].length; i++) {
				for (int j=0; j<img[0][0].length; j++) {
					int Newi= (int)((Math.cos(rad))*(i-iStat)-(Math.sin(rad))*(j-jStat))+iStat;
					int Newj= (int)((Math.sin(rad))*(i-iStat)+(Math.cos(rad))*(j-jStat))+jStat;
					
					if(Newi>=0 && Newj>=0 && Newi<img[0].length && Newj<img[0][0].length) 
						newImg[m][i][j]= img[m][Newi][Newj];
				}
			}
		}
		return newImg;
	}


	public static int[][] scaleImg(double factor_h, double factor_w, int[][] im) {
		int [][]newImg = new int [(int)(im.length*factor_h)][(int)(im[0].length*factor_w)];
		
		for (int i=0; i<(int)(im.length*factor_h); i++) {
			for (int j=0; j<(int)(im[0].length*factor_w); j++) {
				newImg[i][j]= im[(int)(i/factor_h)][(int)(j/factor_w)];
			}
		}
		return newImg;
	}

}
