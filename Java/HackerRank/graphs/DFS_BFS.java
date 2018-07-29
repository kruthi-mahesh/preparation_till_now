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
	public static DFS_BFS inputGraph(Scanner sc){
		DFS_BFS g;
		System.out.println("Enter number of vertices");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter 0 to enter vertices or 1 to take default verices ");
		int choise = sc.nextInt();
		if(choise == 0){
			System.out.println("Enter " + n + " verices:");
			for(int i=0; i<n; i++)
				arr[i] = sc.nextInt();
			g = new DFS_BFS(n,arr);
		}
		else
			g = new DFS_BFS(n);

		System.out.println("Enter no of edges:");
		int m = sc.nextInt();
		for(int i=0; i<m; i++){
			System.out.println("Enter src and dest of the edge number " + (i+1));
			g.addEdge(sc.nextInt(),sc.nextInt());
		}
		return g;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DFS_BFS g;
		g = inputGraph(sc);		
		System.out.println("Enter src vertex");
		int s = sc.nextInt();
		System.out.println("BFS starting from vertex " + s);
		g.BFS(s);
		System.out.println("DFS starting from vertex " + s);
		g.DFS(s);
	}
}
