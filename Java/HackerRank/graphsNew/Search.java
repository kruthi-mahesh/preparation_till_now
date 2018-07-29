import java.util.*;
class Search
{
	public static boolean hasPathDFS(Graph g,int src,int dest){
		Node s = g.getNode(src);
		Node d = g.getNode(dest);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(g,s,d,visited);
	}

	private static boolean hasPathDFS(Graph g,Node src,Node dest,HashSet<Integer> visited){
		//if(visited.contains(src.getID()))
		//	return false;
		if(src == null)
			return false;
		visited.add(src.getID());
		if(src == dest)
			return true;
		for(Node child: src.getAdjacent())
			if(!visited.contains(child.getID()))
				if(hasPathDFS(g,child,dest,visited))
					return true;

		return false;
	}
	public static void DFS(Graph g, Node src)
	{		//base case
		if(src == null)
			return;
		
		src.visited = true;
		visit(src);

		for(Node n : src.getAdjacent()){
			if(n.visited == false)
				DFS(g,n);
		}
		
	}

	public static void DFSAll(Graph g)
	{
		for(Node n: g.getNodes()){
			if(n.visited == false)
				DFS(g,n);
		}
	}

	public static void BFS(Graph g,Node src)
	{
		LinkedList<Node> q = new LinkedList<Node> ();
		/*optional
		for(Node u: g.getNodes())
			u.state = State.Unvisited;
		*/
		src.state = State.Visiting;
		q.add(src); 
		Node u;
		while(!q.isEmpty())
		{
			u = q.poll();

			if(u !=null)
			{
				visit(u);
				for(Node v : u.getAdjacent())
				{
					if(v.state == State.Unvisited)
					{
						v.state = State.Visiting;
						q.add(v);
					}
				}
			}
			u.state = State.Visited;
		}
	}

	public static void visit(Node n){
		System.out.println(n.id  + " ");
	}

	public static boolean hasPathBFS(Graph g,int s,int d){
		Node src=  g.getNode(s);
		Node dst = g.getNode(d);
		return hasPathBFS(g,src,dst);
	}

	public static boolean hasPathBFS(Graph g,Node s,Node d){
		if(s == d)
			return true;
		LinkedList<Node> q = new LinkedList<Node> ();
		for(Node u: g.getNodes())
			u.visited = false;
		s.visited = true;
		q.add(s);
		Node u;

		while(!q.isEmpty())
		{
			u = q.poll();
			for(Node  v: u.getAdjacent())
			{
				if(!v.visited)
				{
					if(v==d)
						return true;
					else
					{
						v.visited = true;
						q.add(v);
					}
				}
			}
		}
		return false;

	}

}