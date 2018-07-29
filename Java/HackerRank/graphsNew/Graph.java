import java.util.*;
enum State{
	Unvisited, Visiting, Visited;
}

class Graph{	
	private int v;
	private ArrayList<Node> nodes = new ArrayList<Node>();
	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();

	public Graph(int v)
	{
		this.v = v;
		for(int i=0;i<v;i++)
			createNode(i);		
	}

	public Graph(int v,int vertices[]){
		this.v = v;
		for(int i=0;i<v;i++)
			createNode(vertices[i]);
	}

	public  void BFS( int src){
		for(Node n: getNodes())
			n.state = State.Unvisited;
		Search.BFS(this,getNode(src));
	}

	public  void DFS( int src){
		for(Node n: getNodes())
			n.visited = false;
		Search.DFS(this,getNode(src));
	}
	public void DFSAll()
	{
		for(Node n: getNodes())
			n.visited = false;
		Search.DFSAll(this);
	}
	public int getV(){ return v;}

	public ArrayList<Node> getNodes()	{
		 return nodes;
	}

	public Node getNode(int id)		{ 
		return map.get(id);
	}

	public  void createNode(int id) {
		Node n = new Node(id);
		nodes.add(n);
		map.put(id,n);
	} 

	public void addEdge(int s,int d){
		Node src = getNode(s);
		Node dest = getNode(d);
		addEdge(src,dest);
	}

	public void addEdge(Node s,Node d){
		s.addNeighbor(d);
	}


	public static Graph inputGraph(Scanner sc){
		Graph g;
		System.out.println("Enter number of vertices");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter 0 to enter vertices or 1 to take default verices ");
		int choice = sc.nextInt();
		if(choice == 0){
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
	public static void print(String s){ System.out.println(s);}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graph g;
		int s,d;
		g = inputGraph(sc);		
		print("Enter src vertex");
		s = sc.nextInt();
		print("BFS starting from vertex " + s);
		g.BFS(s);
		print("DFS starting from vertex " + s);
		g.DFS(s);

		for(int i =0;i<g.v;i++){
			print("DFS starting from vertex " + i);
			g.DFS(i);
		}
		print("DFS starting from all ");
		g.DFSAll();
		int t =sc.nextInt();
		while(t--!=0){
			s = sc.nextInt();
			d = sc.nextInt();
			print("HasPath from "+s+ " to " + d);
			print("BFS "+ Search.hasPathBFS(g,s,d));
			print("DFS " + Search.hasPathDFS(g,s,d));
		}
		sc.close();
	}
}
