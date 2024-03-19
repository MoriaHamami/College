/**
 * This is a template for assignment 2 solution of introduction to compute
 * science course. Ariel University, 2021-2022.
 * 
 * Note: All the given 3D arrays (img) below represents a RGB image where img[0] - Red channel, 
 * img[1] - Green channel, img[2] - Blue channel,
 *  which can be acquired by readImageFromFile function in the attached file (MyImageIO.java).
 * 
 * @author Asaly Saed
 *  Good Luck and have a nice coding time :)!
 */

public class Ex2 {
	/**
	 * 
	 * @param img - an RGB image.
	 * @return a grayscale image of (im) as a 2D array.
	 */
	public static int[][] rgb2gray(int[][][] img) {
		// write your code here...
		return null;
	}

	/**
	 * 
	 * @param img     - an RGB image.
	 * @param i_1,    j_1 - indicies of upper left pixel of the crop range.
	 * @param i_2,j_2 - indicies of lower right pixel of the crop range.
	 * @return an RGB cropped image starting from pixel (i_1, j_1) to pixel
	 *         (i_2,j_2) as 3D array.
	 */
	public static int[][][] crop(int[][][] img, int i_1, int j_1, int i_2, int j_2) {
		// write your code here...
		return null;
	}

	/**
	 * 
	 * @param img   - an RGB image.
	 * @param alpha - An angle we want to rotate the image with.
	 * @return a rotated image (img) by alpha degrees.
	 */
	public static int[][][] rotate_alpha(int[][][] img, double alpha) {
		// write your code here...
		return null;
	}

	/**
	 * 
	 * @param img - an RGB image.
	 * @param n   - the sliding window length to smooth the image by.
	 * @return a smoothed RGB image.
	 */
	public static int[][][] Smooth(int[][][] img, int n) {
		// write your code here...
		return null;
	}

	/**
	 * 
	 * @param factor_h - height scale factor of the image.
	 * @param factor_w - width scale factor of the image.
	 * @param im       - a grayscale image to be scaled.
	 * @return a scaled up\down image by the given factors.
	 */
	public static int[][] scaleImg(double factor_h, double factor_w, int[][] im) {
		// write your code here...
		return null;
	}

}
