import java.util.*;
class CheckBalanced{
	public static final int MIN = -1;//Integer.MIN_VALUE;
	public static boolean isBalanced(Node root){
		return checkHeight(root) != MIN;
	}

	public static int checkHeight(Node root){
		if(root == null)
			return 0;
		int h1 = checkHeight(root.left);
		
		if(h1 == MIN)
			return MIN;
		int h2 = checkHeight(root.right);
		
		if(h2==MIN)
			return h2;

		int diff = Math.abs(h1-h2);
		if(diff > 1)
			return MIN;
		else
			return Math.max(h1,h2) + 1;
	}

	public static int getHeight(Node root)
	{
		if(root == null)
			return -1;
		return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
	}
	public static boolean rec(Node root)
	{
		if(root == null)
			return true;
		int h1 = getHeight(root.left);
		int h2 = getHeight(root.right);
		//print(" \nh1 h2 " + h1 + " " +h2);
		if(Math.abs(h1-h2)>1)
			return false;
		else
			return rec(root.left) && rec(root.right);
	}
	public static void print(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(4);
		root.left.left  = new Node(7);
		root.left.left.left =new Node(17);
		//root.left.right  = new Node(9);
		//root.left.right.left =new Node(27);
		print("rec " + rec(root));
		print("check_height " + isBalanced(root));
	}
}