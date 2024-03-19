package S2P3;

public class Ex3 {

	public BVLNode MinBVL(int h) {
		if (curr==null) return 0;
		if (curr.left!=null || curr.right!=null) return 1;
		else return NumOfNodes(curr.left)+NumOfNodes(curr.right);
	}
	
	public int NumOfNodes(BVLNode curr) {
		if (curr==null) return 0;
		if (curr.left!=null || curr.right!=null) return 1;
		else return NumOfNodes(curr.left)+NumOfNodes(curr.right);
	
	public int getHeight() {
		return getHeight(root);
	}
	
	public int getHeight(BVLNode curr) {
		int result= -1;
		if (curr!=null) {
			int LeftHeight = getHeight(curr.left);
			int RightHeight = getHeight(curr.right);
			result= Integer.max(LeftHeight, RightHeight)+1;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
