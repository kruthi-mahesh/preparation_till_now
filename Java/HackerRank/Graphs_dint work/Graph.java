import java.util.*;
public class Graph{
	private int v;
	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
	public static class Node {
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int id){
			this.id = id;
		}
		public int getID(){
			return this.id;
		}
	}

	Graph(){		//Written for the sake of inheritance
	}	

	Graph(int v){
		this.v = v;
		for(int i=0; i<v; i++){
			Node n = new Node(i);
			nodeLookup.put(i,n);
		}
	}

	Graph(int v,int[] arr){
		this.v = v;
		for(int i=0;i<v;i++){
			Node n = new Node(arr[i]);
			nodeLookup.put(i,n);
		}
	}


	public Node getNode(int id){
		 return nodeLookup.get(id);
	}

	public void addEdge(int src,int dest){
		Node s =  getNode(src);
		Node d = getNode(dest);
		s.adjacent.add(d);
	}

	public void DFS(int src){
		Node s = getNode(src);
		HashSet<Integer> visited = new HashSet<Integer>();
		DFS(s,visited);
		System.out.println();
	}

	private void DFS(Node src,HashSet<Integer> visited){		
		visited.add(src.id);
		System.out.print(src.id + " ");
		for(Node child: src.adjacent)
			if(!visited.contains(child.id))
				DFS(child,visited);
	}

	public void BFS(int src){
		BFS(getNode(src));
	}

	private void BFS(Node src){
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		visited.add(src.id);
		nextToVisit.add(src);
		while(!nextToVisit.isEmpty()){
			Node cur = nextToVisit.remove();
			System.out.print(cur.id + " ");
			for(Node child: cur.adjacent)
				if(!visited.contains(child.id)){
					visited.add(child.id);
					nextToVisit.add(child);
				}

		}
		System.out.println();
	}

	public static <T> T inputGraph(T g,Scanner sc){
		System.out.println("Enter number of vertices");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter 0 to enter vertices or 1 to take default verices ");
		int choise = sc.nextInt();
		if(choise == 0){
			System.out.println("Enter " + n + " verices:");
			for(int i=0; i<n; i++)
				arr[i] = sc.nextInt();
			g = new Graph(n,arr);
		}
		else
			g = new Graph(n);

		System.out.println("Enter no of edges:");
		int m = sc.nextInt();
		for(int i=0; i<m; i++){
			System.out.println("Enter src and dest of the edge number " + (i+1));
			g.addEdge(sc.nextInt(),sc.nextInt());
		}
		return g;
	}

}

