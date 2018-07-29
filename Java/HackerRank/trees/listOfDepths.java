import java.util.*;
class Node
{
	int data;
	Node left,right;
	Node(int d){
		data = d;
		left = null;
		right = null;
	}
}
class lisOfDepths{
	public static void rec(Node root,ArrayList<LinkedList<Node>> res,int level)
	{
		if(root == null)
			return;
		LinkedList<Node> cur;
		if(res.size() == level)
		{
			cur =  new LinkedList<Node>();
			res.add(cur);	
		}
		else
		{
			cur = res.get(level);
		}
		cur.add(root);

		rec(root.left,res,level+1);
		rec(root.right,res,level+1);	
	}
	
	public static ArrayList<LinkedList<Node>> iter(Node root){
		ArrayList<LinkedList<Node>> res = new ArrayList<LinkedList<Node>>();
	LinkedList<Node> cur = new LinkedList<Node>();
		if(root != null)
			cur.add(root);
		while(cur.size() != 0)
		{
			LinkedList<Node> par = cur;
			res.add(cur);
			cur = new LinkedList<Node>();
			for(Node n: par)
			{
				if(n.left != null)
					cur.add(n.left);
				if(n.right != null)
					cur.add(n.right);
			}
			
		}
		return res;
	}
	public static void print(String s){
		System.out.print(s);
	}
	public static void print(ArrayList<LinkedList<Node>> res){
		for(LinkedList<Node> l : res)
		{
			for(Node n: l)
				print(" "+ n.data);
			print("\n");
		}
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(4);
		root.left.left  = new Node(7);
		root.left.left.left =new Node(17);
		root.left.right  = new Node(9);
		ArrayList<LinkedList<Node>> res  = iter(root);
		res = new ArrayList<LinkedList<Node>>();
		rec(root,res,0);
		print(res);
	}
}

