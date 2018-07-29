import java.util.*;
class Node{
	public boolean visited;
	public State state;//if private,have getter and setter
	public  int id;
	private ArrayList<Node> adjacent = new ArrayList<Node> ();
	Node(int i){
		id = i;
		//visited = false;
		//state = State.Unvisited;
	}
	public void addNeighbor(Node n){
		adjacent.add(n);
	}
	
	public ArrayList<Node> getAdjacent(){
		return adjacent;
	}
	public int getID(){return id;}
	
}