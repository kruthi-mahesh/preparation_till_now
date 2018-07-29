//1.Sorting: Bubble Sort

public class Solution {
    private static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static int bb(int[] a,int n){
        int ct =0;
        for(int i=0; i<n; i++){
            int sw = 0;
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    sw++;
                    ct++;
                }
                
            }
            if(sw == 0)break;
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int ct = bb(a,n);
        System.out.println("Array is sorted in "+ ct + " swaps.");
        System.out.println("First Element: " + a[0] + "\nLast Element: " + a[n-1]);
        
    }
}

//2.Sorting: Comparator
import java.util.*;
class Checker implements Comparator<Player>{

        public int compare(Player a, Player b) {
            // If 2 Players have the same score
            if(a.score == b.score){
                // Order alphabetically by name
                return a.name.compareTo(b.name);
            }    

            // Otherwise, order higher score first  
            //     return b.score-a.score;
            return ((Integer) b.score).compareTo(a.score);

        }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

//3.Merge Sort: Counting Inversions
import java.util.*;

public class Solution {
    public static long mergeSort(int[] a,int[] temp,int left,int right){
        if(right<=left)
            return 0;
        int mid = (left+right)/2;
        
        long inv = mergeSort(a,temp,left,mid);
        inv += mergeSort(a,temp,mid+1,right);
        inv += merge(a,temp,left,mid+1,right);
        return inv;
        
    }
    public static long merge(int[] a,int[] temp,int left,int mid,int right){
        int i = left,j = mid,k = left;
        long ct=0;
        while(i<= mid-1 && j<= right){
            if(a[i]<=a[j])
                temp[k++]=a[i++];
            
            else{
                temp[k++] = a[j++];
                ct += mid - i;
            }
            
        }
        while(i<mid)
            temp[k++] = a[i++];
        
         while(j<=right)
             temp[k++] = a[j++];
        for(int m = left; m<=right; m++)
            a[m] = temp[m];
        return ct;
    }

    public static long countInversions(int[] arr){
        int[] temp = new int[arr.length];
        return mergeSort(arr,temp,0,arr.length-1);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }    
}

/*4.Hash Tables: Ice Cream Parlor
Theory:
Binary search using generic class:*/
//Generic class
import java.util.*;

class BinarySearch<E extends Comparable<E>> {
    E[] array;

    public BinarySearch(E[] array) {
        this.array = array;
    }

    /** Recursive Binary Search - Helper Method **/
    public void findRecursive(E value) {
        int index = binarySearchRecursive(value, -1, 0, array.length - 1);

        System.out.println( 
            (index > -1) 
            ? "Value '" + value + "' was found recursively at index: " + index
            : "Value '" + value + "' was not found recursively in the dataset: " + Arrays.asList(array)
        );
    }

    /** Recursive Binary Search Implementation **/ 
    private int binarySearchRecursive(E value, int index, int left, int right) {

        if(left <= right) {
            int mid = left + ((right - left) / 2);

            // If value is found
            if(value.equals(array[mid])) {
                index = midIndex;
            }
            else { 
                // if value < array[midIndex], search left
                if(value.compareTo(array[midIndex]) < 0) {
                    right = midIndex - 1;
                }
                else { // if value > array[midIndex], search right
                    left = midIndex + 1;
                }

                index = binarySearchRecursive(value, index, left, right);
            }
        }

        return index;
    }

    /** Iterative Binary Search Implementation **/
    public void findIterative(E value) {
        // Initial values
        int left = 0; 
        int right = array.length - 1;
        int index = -1;

        // While there is a section having length > 0 to search
        while(left <= right && index < 0) {
            int mid = left + ((right - left) / 2);

            // If value is found
            if(array[mid] == value) {
                index = mid;
                break;
            }
            // If value < array[mid], search left
            else if(value.compareTo(array[mid]) < 0) {
                // search left
                right = mid - 1;
            }
            else { // If value > array[mid], search right
                left = mid + 1;
            }
        }

        System.out.println( 
            (index > -1) 
            ? "Value '" + value + "' was found iteratively at index: " + index
            : "Value '" + value + "' was not found iteratively in the dataset: " + Arrays.asList(array)
        );
    }
    
    public void search(E value) {
        findRecursive(value);
        findIterative(value);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Integer[] ints = new Integer[n];
        for(int i = 0; i < n; i++) 
            ints[i] = i;

        BinarySearch<Integer> intSearch = new BinarySearch<Integer>(ints);

        for(int i=0; i<m; i++) {
            int value = in.nextInt();
            intSearch.search(value);
            System.out.println();
        }
        in.close();

        Character[] alphabet = new Character[26];
		final int offset = 97;
		for(int i = 0; i < 26; i++) {
    		alphabet[i] = (char) (i + offset);
		}
		BinarySearch<Character> charSearch = new BinarySearch<Character>(alphabet);
		charSearch.search('a');
		charSearch.search('$');
		charSearch.search('z');
		charSearch.search('h');
    }
}

//4.Hash Tables: Ice Cream Parlor
import java.util.*;
public class Solution{
    private static int indexOf(int[] arr,int val,int excludeThis){
        for(int i=0; i<arr.length; i++)
            if(arr[i] == val && i != excludeThis){
                return i+1;
            }
        return -1;
    }
    private static int[] getIndicesFromValues(int[] arr,int v1,int v2){
        int i1 = indexOf(arr,v1,-1);
        int i2 = indexOf(arr,v2,i1-1);
        int[] indices = {Math.min(i1,i2),Math.max(i1,i2)};
        return indices;
    }

    static void solve(int[] arr, int money) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int[] indices = {-1,-1};
        for(int i=0; i<sorted.length; i++){
            int cost = sorted[i];
            if(cost>=money)
                continue;
            int remaining = money - cost;
            int index = Arrays.binarySearch(sorted,i+1,sorted.length,remaining);

            if(index>=0 && index<sorted.length && sorted[index] == remaining){
                indices = getIndicesFromValues(arr,cost,remaining);
                break;
              
            }
        }
          System.out.println(indices[0] + " " + indices[1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- != 0){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}


//5.DFS: Connected Cell in a Grid

public class Solution {
    private static int getRegionSizeDFS(int[][] grid, int row,int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || (grid[row][col] != 1))
            return 0;
        grid[row][col] = -1;
        int size = 1;
        for(int i = row-1; i<=row+1; i++)
            for(int j=col-1; j<=col+1; j++)
                size = size + getRegionSizeDFS(grid,i,j);
        return size;
    }
    public static int solve(int [][] grid){
        int size,max=0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++){
                size = getRegionSizeDFS(grid,i,j);
                max = Math.max(size,max);
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(solve(grid));
    }
}

//Using non static methods:
public class Solution {
    int rows,cols,grid[][];
    Solution(int r,int c,int[][] matrix){
        rows = r;
        cols = c;
        grid = matrix;
    }
    private boolean isValid(int i,int j){
        if(i<0 || j<0 || i>=rows || j>=cols)
            return false;
        if(grid[i][j] == 0)
            return false;
        return true;
    }
    private int getRegionSizeDFS(int row,int col){
        if(isValid(row,col) == false)
            return 0;
        grid[row][col] = 0;
        int size = 1;
        for(int i = row-1; i<=row+1; i++)
            for(int j=col-1; j<=col+1; j++)
                size = size + getRegionSizeDFS(i,j);
        return size;
    }
    public int solve(){
        int size,max=0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++){
                size = getRegionSizeDFS(i,j);
                max = Math.max(size,max);
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        in.close();
        Solution s = new Solution(n,m,grid);
        System.out.println(s.solve());
    }
}

//6.BFS: Shortest Reach in a Graph
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
            int distances[] = new int[adj.length];   //new int[adj.length];
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
            for(int i=1; i<distances.length; i++){
                if(i!=src)
                    System.out.print(distances[i] + " ");
            }
            System.out.println();
        }
    }
}