import java.io.*;
import java.util.*;

public class Solution{

    public static class Graph{
        int v;
        private Node[] adj;
        private static int EDGE_DISTANCE = 6;

        public Graph(int size){
            v = size;
            adj = new Node[size+1];
            for(int i=1; i<=size; i++)
                adj[i] = new Node(i);
        }

        private class Node{
            int id;
            LinkedList<Integer> neighbors;
            Node(int id){
                this.id = id;
                neighbors = new LinkedList<Integer>();
            }
        }

        public Node getNode(int id){
            return adj[id];
        }
        public void addEdge(int src,int dest){
            Node s = getNode(src);
            s.neighbors.add(dest);
            Node d = getNode(dest);
            d.neighbors.add(src);
        }
        public int[] shortestPath(int src){
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(src);
            int distances[] = new int[v+1];   //new int[adj.length];
            Arrays.fill(distances,-1);
            distances[src] = 0;
            while(!queue.isEmpty()){
                int current = queue.poll();
                for(int neigbhor : adj[current].neighbors){
                    

                    if(distances[neigbhor] == -1) {     //not visited
                        

                        distances[neigbhor] = distances[current] + EDGE_DISTANCE;
                        queue.add(neigbhor);
                    } 
                 
                }
            }
            return distances;
        }

    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
        while(t--!=0){
            int n = in.nextInt();
            int m = in.nextInt();
            Graph g = new Graph(n);
            for(int i=0; i<m; i++)
                g.addEdge(in.nextInt(),in.nextInt());
            int src = in.nextInt();
            int distances[] = g.shortestPath(src);
            System.out.println(distances.length);
            for(int i=1; i<distances.length; i++){
                if(i!=src)
                    System.out.print(distances[i] + " ");
            }
            System.out.println();
        }
    }
}