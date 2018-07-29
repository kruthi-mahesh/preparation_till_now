Day 11: 2D Arrays

int rowSize = 2;
int colSize = 4;
int[][] myArray = new int[rowSize][colSize];

int count = 0;

for(int i = 0; i < rowSize; i++) {

    for(int j = 0; j < colSize; j++, count++) {
        myArray[i][j] = count;
    }
}

for(int i = 0; i < rowSize; i++) {

    // print the row of space-separated values
    for(int j = 0; j < colSize; j++) {
        System.out.print(myArray[i][j] + " ");
    }
    // end of row is reached, print newline
    System.out.println();
}

problem:Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        long  sum,max=Integer.MIN_VALUE;
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i =0; i<4; i++)
        {
            for(int k=0;k<4;k++)
            {
                sum = 0;
                for(int j=k;j<k+3;j++)
                    sum += arr[i][j];
                sum += arr[i+1][k+1];
                for(int j = k; j<k+3;j++)
                    sum+=arr[i+2][j];
                if(max<sum)
                    max =  sum;
            }
            
        }
        System.out.println(max);
    }
}


public class Solution {
    private static final int _MAX = 6; // size of matrix
    private static final int _OFFSET = 2; // hourglass width
    private static int matrix[][] = new int[_MAX][_MAX];
    private static int maxHourglass = -63; // initialize to lowest possible sum (-9 x 7)
    
    /** Given a starting index for an hourglass, sets maxHourglass
    *   @param i row 
    *   @param j column 
    **/
    private static void hourglass(int i, int j){
        int tmp = 0; // current hourglass sum
        
        // sum top 3 and bottom 3 elements
        for(int k = j; k <= j + _OFFSET; k++){
            tmp += matrix[i][k]; 
            tmp += matrix[i + _OFFSET][k]; 
        }
        // sum middle element
        tmp += matrix[i + 1][j + 1]; 
        
        if(maxHourglass < tmp){
            maxHourglass = tmp;
        }
    }

    public static void main(String[] args) {
        // read inputs
        Scanner scan = new Scanner(System.in); 
        for(int i=0; i < _MAX; i++){
            for(int j=0; j < _MAX; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();
        
        // find maximum hourglass
        for(int i=0; i < _MAX - _OFFSET; i++){
            for(int j=0; j < _MAX - _OFFSET; j++){
                hourglass(i, j);
            }
        }
        
        // print maximum hourglass
        System.out.println(maxHourglass);
    }
}

Day 12: Inheritance
Day 13: Abstract Classes

Day 14: Scope

Task 
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the
 elements instance variable.
A computeDifference method that finds the maximum absolute difference between any 2 numbers in N
 and stores it in the maximumDifference instance variable.

Input Format

You are not responsible for reading any input from stdin. The locked Solution class in your editor reads in  lines of input; 
the first line contains , and the second line describes the  array.

Output Format

You are not responsible for printing any output; 
the Solution class will print the value of the maximumDifference instance variable.
Sample Input

3
1 2 5
Sample Output

4

class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	public Difference(int[] elements){
        this.elements = elements;
    }

    /** Sorts the array
    *   Saves max abs difference between first and last element to maximumDifference. **/
    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }

  	} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

public void computeDifference(){
    // set max to its minimum possible value set by Constraints
    int max = 1; 
        
    // set min to its maximum possible value set by Constraints
    int min = 100;
    for(int element : elements){
        if(element < min){
            min = element;
        }
        if(element > max){
            max = element;
        }
    }
        
    this.maximumDifference = Math.abs(max - min);
}

Day 15: Linked List

LinkedList<String> myLinkedList = new LinkedList<String>();
// Add a node with data="First" to back of the (empty) list
myLinkedList.add("First"); 
myLinkedList.add("Second"); 

myLinkedList.addFirst("Third"); 
myLinkedList.addLast("Fourth"); 

// Insert a node with data="Fifth" at index 2
myLinkedList.add(2, "Fifth"); 
// Print the list: [Third, First, Fifth, Second, Fourth]
System.out.println(myLinkedList); 
// Print the value at list index 2:
System.out.println(myLinkedList.get(2));
// Empty the list
myLinkedList.clear();

// Print the newly emptied list: []
System.out.println(myLinkedList); 



import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

	public static  Node insert(Node head,int data) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node current = head;
    // Setting up our new node to add
    Node newTail = new Node(data);
    newTail.next = null;
    // if the list isn't empty
    if (current != null) {
        // get to the end of the list and set the current
        // to the last element
       while (current.next != null) {
           // iterating through
            current = current.next;
        }
    } else {
        // otherwise the list is empty and we should just return our new node with the data
        return newTail;
    }
    // then add our new tail onto the end of the list
    current.next = newTail;
    return head;
}
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

public static  Node insert(Node head,int data){
    // if list has no elements, return a new node
    if(head == null){
        return new Node(data);
    }
        
    // else iterate through list, add node to tail, and return head
    Node tmp = head;
    while(tmp.next != null){
        tmp = tmp.next;
    }
    tmp.next = new Node(data);
            
    return head;
}

Day 24: More Linked Lists

import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
	public static Node removeDuplicates(Node head) {
    // Empty list case:
    if (head == null) {
        return head;
    }

    Node current = head;
    while (current.next != null) {
        // If data is equal, reset the next pointer
        if (current.data == (current.next).data) {
            current.next = (current.next).next;
        } else {
            // If data is not equal, go
            // to the next element
            current = current.next;
        }
    }

    return head;
}
	public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }

	public static Node removeDuplicates(Node head) {
	    // if head is null or list only has 1 element
	    if( head == null || head.next == null){
	        return head;
	    }

	    // if list is more than 2 elements
	    Node current = head.next;
	    Node previous = head;
	    while( current != null ){
	        // If current is a duplicate of previous
	        if( previous.data == current.data ){
	            // set previous' next pointer to skip over current node
	            previous.next = current.next;
	            // set current to next node in list, previous should not move
	            current = current.next;
	        }
	        else{ // node is not duplicate of previous
	            previous = current;
	            current = current.next;
	        }
	    }
	    return head;
	}

	public static Node removeDuplicates(Node head) {
	    // if head is null or list only has 1 element
	    if( head == null || head.next == null){
	        return head;
	    }

	    // if list is more than 2 elements
	    Node current = head;
	    while( current.next != null ){
	        // If current is a duplicate of previous
	        if( current.data == current.next.data ){
	            // set previous' next pointer to skip over current node
	            current.next = current.next.next;
	        }
	        else{ // node is not duplicate of previous
	            current = current.next;
	        }
	    }
	    return head;
	}

Day 18: Queues and Stacks
 Can you determine if a given string, s, is a palindrome?

Sample Input
racecar

Sample Output
The word, racecar, is a palindrome.

import java.io.*;
import java.util.*;

public class Solution {
    Queue<Character> queue;
    Stack<Character> stack;

    Solution(){
        this.queue = new LinkedList<Character>();
        this.stack = new Stack<Character>();
    }

    void pushCharacter(char ch){
        this.stack.push(ch);
    }
    
    void enqueueCharacter(char ch){
        this.queue.add(ch);
    }
    
    char popCharacter(){
        return this.stack.pop();
    }

    char dequeueCharacter(){
        return this.queue.remove();
    }
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    
}

public class Solution {
    Queue<Character> queue = new LinkedList<Character>();
    Stack<Character> stack = new Stack<Character>();

    void pushCharacter(char ch){
        this.stack.push(ch);
    }
    
    void enqueueCharacter(char ch){
        this.queue.add(ch);
    }
    
    char popCharacter(){
        return this.stack.pop();
    }

    char dequeueCharacter(){
        return this.queue.remove();
    }
    
    //...

Day 22: Binary Search Trees
Binary Search Tree
A Binary Search Tree (BST), , is a binary tree that is either empty or satisfies the following three conditions:
1. Each element in the left subtree of t is less than or equal to the root element of  (i.e., ).
2. Each element in the right subtree of  is greater than the root element of  (i.e., ).
3. Both leftTree(t) and rightTree(t) are BSTs.

max(leftTree(t).value) <= t.value
min(rightTree(t).value) > t.value

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
	public static int getHeight(Node root){
      //Write your code here
        if(root == null)
            return -1;
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }

     public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

if t is empty,
    height(t) = -1
else
    height(t) = 1 + MAX( height( leftSubtree(t), rightSubtree(t) ) )

public static int getHeight(Node root){
    if (root == null){
        return -1;
    }
    else{
        return 1 + Math.max( getHeight(root.left), getHeight(root.right) );
    }
}

Day 23: BST Level-Order Traversal

void preOrder(Node root) {
    if(root != null){
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

static Queue<Node> queue = new LinkedList<Node>();

static void levelOrder(Node root){
    if( root != null ){
        queue.add(root);
    }
    while( !queue.isEmpty() ){
        Node tree = queue.remove();
        System.out.print(tree.data + " ");

        if( tree.left != null ){
            queue.add( tree.left );
        }
        if( tree.right != null ){
            queue.add( tree.right );
        }
    }
}

inOrder(t) {
    if(t is not empty) {
        inOrder( left subtree of t )
        process t's root element
        inOrder( right subtree of t )
    } 
} 

postOrder(t) {
    if(t is not empty) {
        postOrder( left subtree of t )
        postOrder( right subtree of t )
        process t's root element
    } 
} 

preOrder(t) {
    if(t is not empty) {
        process t's root element
        preOrder( left subtree of t )
        preOrder( right subtree of t )
    } 
} 

levelOrder(BinaryTree t) {
    if(t is not empty) {
        // enqueue current root
        queue.enqueue(t)
        
        // while there are nodes to process
        while( queue is not empty ) {
            // dequeue next node
            BinaryTree tree = queue.dequeue();
            
            process tree's root;
            
            // enqueue child elements from next level in order
            if( tree has non-empty left subtree ) {
                queue.enqueue( left subtree of t )
            }
            if( tree has non-empty right subtree ) {
                queue.enqueue( right subtree of t )
            }
        }
    } 
} 

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
	static void levelOrder(Node root){
	    Queue<Node> queue = new LinkedList<Node>();
	    if( root != null ){
	        queue.add(root);
	    }
	    while( !queue.isEmpty() ){
	        Node tree = queue.remove();
	        System.out.print(tree.data + " ");

	        if( tree.left != null ){
	            queue.add( tree.left );
	        }
	        if( tree.right != null ){
	            queue.add( tree.right );
	        }
	    }
	}

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}



IMP: Is This a Binary Search Tree?

 class Node {
    int data;
    Node left;
    Node right;
    Node(int d){
    	data = d;
    }
     }

boolean checkBST(Node root, int minValue, int maxValue) {
    if (root == null) {
        return true;
    }
    
    if (root.data < minValue || root.data > maxValue) {
        return false;
    }
    
    return (    checkBST(root.left, minValue, root.data - 1) 
            &&  checkBST(root.right, root.data + 1, maxValue)
            );
}
    
boolean checkBST(Node root) {
    return checkBST(root, 0, 10000);
}

C++:

bool checkBST(Node* root, int minValue, int maxValue) {
    if (root == NULL) {
        return true;
    }

    if (root->data < minValue || root->data > maxValue) {
        return false;
    }

    return (    checkBST(root->left, minValue, root->data - 1) 
            &&  checkBST(root->right, root->data + 1, maxValue)
            );
}

bool checkBST(Node* root) {
    return checkBST(root, 0, 10000);
}



IMP: Tree : Top View

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	void top_view(Node root)
{
    if(root==null)
        return;
    Stack st=new Stack();
     int size=0;
    int arr[]=new int[100];
   
    Node Left=null,Right=null;
    Left=root.left;
    Right=root.right;
     
        while(Right!=null)
        {
           
             arr[size]=Right.data;
                  
            size++;
            Right=Right.right;
            if(Right==null)
                {
                    for(int i=size-1;i>=0;i--)
                        {
                        st.push(arr[i]);
                       
                    }                     
            }
    	}
    
    st.push(root.data);
    while(Left!=null)
        {
             
        st.push(Left.data);
         
        Left=Left.left;
       
    }
    while(st.isEmpty()!=true)
        {
        System.out.print(st.pop()+" ");
    	}
    }
  
       

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}

void top_view(Node root)
{
    if (root == null) {
        return;
    }
    Stack<Node> stack = new Stack<Node>();
    Node cur = root.left;
    while (cur != null) {
        stack.push(cur);
        cur = cur.left;
    }
    while (!stack.isEmpty()) {
        System.out.print(stack.pop().data + " ");
    }
    System.out.print(root.data + " ");
    cur = root.right;
    while (cur != null) {
        System.out.print(cur.data + " ");
        cur = cur.right;
    }
}

Day 20: Sorting -counting inversions

for (int i = 0; i < n; i++) {
    // Track number of elements swapped during a single array traversal
    int numberOfSwaps = 0;
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
    }
}

import java.util.*;
import java.io.*;
class merge_sort_swap
{
	
	static int mergeSort(int arr[], int array_size)
	{
		int temp[] = new int[array_size];
		return _mergeSort(arr, temp, 0, array_size - 1);
	}
	
	/* An auxiliary recursive method that sorts the input array and
	returns the number of inversions in the array. */
	static int _mergeSort(int arr[], int temp[], int left, int right)
	{
	int mid, inv_count ;
	if (right <= left)
		return 0;
	
		/* Divide the array into two parts and call _mergeSortAndCountInv()
		for each of the parts */
	mid = (right + left)/2;
	
		/* Inversion count will be sum of inversions in left-part, right-part
		and number of inversions in merging */
	inv_count = _mergeSort(arr, temp, left, mid);
	inv_count += _mergeSort(arr, temp, mid+1, right);
	
		/*Merge the two parts*/
	inv_count += merge(arr, temp, left, mid, right);
	
	return inv_count;
	}
	
	/* This method merges two sorted arrays and returns inversion count in
	the arrays.*/
	static int merge(int arr[], int temp[], int left, int mid, int right)
	{
	int i, j, k;
	int inv_count = 0;
	
	i = left; /* i is index for left subarray*/
	j = mid+1; /* j is index for right subarray*/
	k = left; /* k is index for resultant merged subarray*/
	while ((i <= mid ) && (j <= right))
	{
		if (arr[i] <= arr[j])
		{
		temp[k++] = arr[i++];
		}
		else
		{
		temp[k++] = arr[j++];
	
		/*this is tricky -- see above explanation/diagram for merge()*/
		inv_count = inv_count + (mid+1 - i);
		}
	}
	
	/* Copy the remaining elements of left subarray
	(if there are any) to temp*/
	while (i <= mid )
		temp[k++] = arr[i++];
	
	/* Copy the remaining elements of right subarray
	(if there are any) to temp*/
	while (j <= right)
		temp[k++] = arr[j++];
	
	/*Copy back the merged elements to original array*/
	for (i=left; i <= right; i++)
		arr[i] = temp[i];
	
	return inv_count;
	}

	// Driver method to test the above function
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		sc.close();
		System.out.println("Array is sorted in " + mergeSort(arr, arr.length) + " swaps.");
		System.out.println("First Element: " + arr[0] + "\nLast Element: " + arr[n-1]);
	}
}

public class Solution {

 public void bb(int[] x){
        int ct =0 ;
        int n = x.length;
        for(int i=0; i<n; i++){
            int sw = 0;
            for(int j=0; j<n-1-i;j++){
                if(x[j]>x[j+1]){
                    sw++;
                    ct++;
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
            if(sw == 0)
                break;
        }
        System.out.println("Array is sorted in "+ ct + " swaps.");
        System.out.println("First Element: " + x[0] + "\nLast Element: "+ x[n-1]);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Solution p = new Solution();
        p.bb(a);
        // Write Your Code Here
    }


Day 21: Generics

import java.util.*;

class Printer <T> {
	public < E > void printArray( E[] inputArray )
	{    
     for ( E element : inputArray )
     {        
        System.out.printf( "%s\n", element );
     }
	} 
}

public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}
