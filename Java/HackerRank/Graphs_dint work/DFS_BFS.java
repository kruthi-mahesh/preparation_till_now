import java.util.*;
public class DFS_BFS extends Graph{
	DFS_BFS(){

	}
	DFS_BFS(int v){
		super(v);
	}
	DFS_BFS(int v,int[] arr){
		super(v,arr);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DFS_BFS g;
		g = inputGraph(g,sc);		
		System.out.println("Enter src vertex");
		int s = sc.nextInt();
		System.out.println("BFS starting from vertex " + s);
		g.BFS(s);
		System.out.println("DFS starting from vertex " + s);
		g.DFS(s);
	}
}
