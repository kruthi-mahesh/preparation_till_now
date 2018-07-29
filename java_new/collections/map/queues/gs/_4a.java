import java.util.*;
class Pair{
	private Integer x;
	private Integer y;
	Pair(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	int getx(){
		return x;
	}
	int gety()
	{
		return y;
	}
	
}

class _4a{
	public static int p = 4;
	public static boolean visited[] = new boolean[p*p];
	public static boolean mark[] = new boolean[p*p];

	public static void main(String[] args) {
		int m[][] = new int[p][p];
		ArrayDeque<Pair> q = new ArrayDeque<Pair>();
		q.addLast(new Pair(0,0));
		Arrays.fill(visited,false);
		Arrays.fill(mark,false);
		fillGrid(q,m);
		print();

	}
	
	private static void fillGrid(ArrayDeque<Pair> Q,int[][] M) 
	{
		while(Q.peek()!=null)
		{
			Pair p1 = Q.removeFirst();
			int row = p1.getx();
			int col = p1.gety();
			int index = row*p + col;
			if(checkValid(row,col) == false)
				continue;
			mark[index] = true;
			if(visited[index]==false)
			{
				f4(p1.getx(),p1.gety(),Q,M);
				Q.addLast(new Pair(row-1,col-1));
				Q.addLast(new Pair(row+1,col+1));
				visited[index]=true;
			}
		}
	}

	private static void print()
	{
		boolean res = true;
		for(boolean b: mark)
		{
			if(b==false)
				res  =false;
			System.out.print(b + " ");
		}
		System.out.println("\n\nfinal res is " + res);
	}

	private static boolean checkValid(int row,int col)
	{
		if(row<0 || col<0 || row>=p || col >= p)
			return false;
		return true;
	}

	
	private static void f1(int r,int c,ArrayDeque<Pair> Q,int[][] M)
	{
		Q.addLast(new Pair(r+1,p-1));
		Q.addLast(new Pair(p-1,c+1));
	}
	private static void f2(int r,int c,ArrayDeque<Pair> Q,int[][] M)
	{
		Q.addLast(new Pair(r+1,c+1));
		Q.addLast(new Pair(r,c-1));
	}
	private static void f3(int r,int c,ArrayDeque<Pair> Q,int[][] M)
	{
		Q.addLast(new Pair(r,c+1));
	}

	private static void f4(int r,int c,ArrayDeque<Pair> Q,int[][] M)
	{
		Q.addLast(new Pair(r,p-1));
		Q.addLast(new Pair(p-1,c));
	}
	
}
