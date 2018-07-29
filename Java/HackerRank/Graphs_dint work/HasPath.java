import java.util.*;
public class HasPath extends Graph{
	
	public boolean hasPathDFS(int src,int dest){
		Node s = getNode(src);
		Node d = getNode(dest);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s,d,visited);
	}

	private boolean hasPathDFS(Node src,Node dest,HashSet<Integer> visited){
		if(visited.contains(src.getID()))
			return false;
		visited.add(src.getID());
		if(src == dest)
			return true;
		for(Node child: src.adjacent)
			if(hasPathDFS(child,dest,visited))
				return true;

		return false;
	}

	public boolean hasPathBFS(Node src,Node dest){
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		visited.add(src.getID());
		nextToVisit.add(src);
		while(!nextToVisit.isEmpty()){
			Node cur = nextToVisit.remove();
			if(cur == dest)
				return true;
			for(Node child: cur.adjacent)
				if(!visited.contains(child.getID())){
					visited.add(child.getID());
					nextToVisit.add(child);
				}

		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HasPath g = new HasPath();
		g = inputGraph();		
		System.out.println("Enter source vertex");
		int src = sc.nextInt();
		System.out.println("Enter destination vertex");
		int dest = sc.nextInt();
		if(g.hasPathDFS(src,dest))
			System.out.println("There is a path between sorce and destination (found using DFS)");
		else
			System.out.println("There is no path between sorce and destination (found using DFS)");
		if(g.hasPathBFS(src,dest))
			System.out.println("There is a path between sorce and destination (found using BFS)");
		else
			System.out.println("There is no path between sorce and destination (found using BFS)");
	
	}
}
