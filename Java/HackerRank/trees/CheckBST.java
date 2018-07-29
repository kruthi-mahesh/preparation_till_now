import java.util.*;
class CheckBST{
	public static final int MIN = Integer.MIN_VALUE;
	public static final int MAX = Integer.MAX_VALUE;
	public static boolean checkBST(Node root,int min,int max)
	{
		if(root == null)
			return true;
		//if(min<=root.data && root.data<= max)
		if(root.data<min || root.data >max)
			return false;
		if(checkBST(root.left,min,root.data)==false || checkBST(root.right,root.data+1,max)==false)
			return false;
		return true;
	}
	public static void print(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(0);
		root.right = new Node(6);
		root.left.left  = new Node(1);
		root.left.left.left =new Node(-456);
		//root.left.right  = new Node(9);
		//root.left.right.left =new Node(27);
		print("minMAX : "+ checkBST(root,MIN,MAX));
		
	}
}