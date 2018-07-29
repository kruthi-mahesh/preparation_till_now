//1.Arrays: Left Rotation
import java.util.*;
import java.text.*;

public class Solution {

    public static void arrayLeftRotation(int[] a, int n, int d,int[] res) {
        System.arraycopy(a,d,res,0,n-d);
        System.arraycopy(a,0,res,n-d,d);         
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        arrayLeftRotation(a, n, d,output);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}

/*2.Strings: Making Anagrams:
Count no of char to be removed from any of 2 given strings to make  them anagrams*/ 
public class Solution {
    public static int numberNeeded(String first, String second) {
        Map<Character,Integer> mp = new HashMap<Character,Integer>();
        char s1[] = first.toCharArray();
        Integer count;
        for(char ch : s1){
            count = mp.get(ch);
            count = (count == null)? 1 : count+1;
            mp.put(ch,count);
        }
        char s2[] = second.toCharArray();
        for(char ch : s2){
            count = mp.get(ch);
            count = (count == null)? -1 : count-1;
            if(count == 0)
                mp.remove(ch);
            else
                mp.put(ch,count);
        }
        int sum=0;
        for(int ele : mp.values())
            sum += Math.abs(ele);
        return sum;           
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}


	Map<Character, Integer> an= new HashMap <Character, Integer>();	
		
		for ( int i=0; i< src.length(); i++){			
			char c = src.charAt(i);			
			if (an.containsKey(c) )			
				an.put(c, an.get(c)+1);
			else
				an.put(c, 1);			
		}
		
		for ( int j=0; j< tar.length(); j++){			
			char c = tar.charAt(j);					
			if (an.containsKey(c) && an.get(c)!= 0 ) {
				an.put(c,an.get(c) -1);
                length+=2;
            }
            
		}	
        
        System.out.println(src.length() + tar.length()- length );

/*3.Hash Tables: Ransom Note
Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.*/
public class Solution {
    public static boolean find(String[] a,String[] b){
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String str : a){
            Integer ct = map.get(str);
            if(ct == null)
                map.put(str,1);
            else
                map.put(str,ct+1);
            
        }
        for(String str : b){
            Integer ct = map.get(str);
            if(ct == null)
                return false;
            else if(ct == 1)
                map.remove(str);
            else
                map.put(str,ct-1);
        }
        return true;
     
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        System.out.println(find(magazine,ransom)? "Yes" : "No");
        
    }
}

//4.Linked Lists: Detect a Cycle
boolean hasCycle(Node head) {
    Node fast = head;
    
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        head = head.next;
        
        if(head.equals(fast)) {
            return true;
        }
    }
    return false;
}

//5.Stacks: Balanced Brackets
public class Solution {
    public static char[][] TOKENS = {{'{','}'},{'[',']'}, {'(', ')'}};
    private static boolean isOpen(char ch){
        for(char[] arr : TOKENS){
            if(arr[0]==ch)
                return true;
        }
        return false;
    }
    private static boolean matches(char open,char close)
    {
        for(char[] arr : TOKENS){
            if(arr[0]==open && arr[1] == close)
                return true;
            
        }
        return false;
    }
    public static boolean isBalanced(String expression) {
        Stack<Character> stk = new Stack<Character>();
        char[] s = expression.toCharArray();
        for(char ch : s){
            if(isOpen(ch))
                stk.push(ch);
            else{
         
                if(stk.isEmpty() || !matches(stk.pop(),ch))
                    return false;
            }
        }
        return stk.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
    /*
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();       
        boolean balanced = true;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(     '(' == ch
               ||   '[' == ch
               ||   '{' == ch
              ) {
                stack.push(ch);
            }

            else {
                if(stack.empty()){
                    balanced = false; 
                    break;
                }

                else {
                    char top = stack.pop();
                    
                    if(     (top == '(' && ch != ')') 
                       ||   (top == '[' && ch != ']') 
                       ||   (top == '{' && ch != '}') 
                      ) {
                        balanced = false;
                        break;
                    }
                }
            }
        }
        
        return (balanced && stack.empty()) ? true : false;
    }*/

//6.Queues: A Tale of Two Stacks
import java.util.*;

class MyQueue<E> {
    // Two stacks that simulate a Queue:
    Stack<E> stack1;
    Stack<E> stack2;
    
    public MyQueue() {
        this.stack1 = new Stack<E>();
        this.stack2 = new Stack<E>();
    }
    
    public void push(E x) {
        stack1.push(x);
    }
    
    public void pop() {
        
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        
        stack2.pop();
    }
    
    public Object peek() {
        
        Object peek;
        
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
  
        return stack2.peek();
    }
    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        
        // Process each query:
        for(int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            
            if(queryType == 1) {
                int x = scanner.nextInt();
                queue.push(x);
            }
            
            else if(queryType == 2) {
                queue.pop();
            }
            
            else { // queryType == 3, print first value
                System.out.println( queue.peek() );
            }
        }
        
        scanner.close();
    }
}

//7.Trees: Is This a Binary Search Tree?
    boolean checkBST(Node root,int min,int max){
        if(root == null)
            return true;
        if(root.data<min || root.data>max){
            return false;
        }
        return checkBST(root.left,min,root.data-1)&& checkBST(root.right,root.data+1,max);
    }

    boolean checkBST(Node root) {
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

//8.Heaps: Find the Running Median
public class Solution {
    PriorityQueue<Integer> lowers;
    PriorityQueue<Integer> highers;
    
    Solution(){
        highers  = new PriorityQueue<Integer>();
        lowers = new PriorityQueue<Integer>(10,new medComp() );       
    }
   
    public  double getMedian(int num){
        if(lowers.size() == 0 || lowers.peek() > num)
            lowers.add(num);
        else
            highers.add(num);
        PriorityQueue<Integer> bigger = (lowers.size()  > highers.size())? lowers : highers;
        PriorityQueue<Integer> smaller = (lowers.size()  > highers.size())? highers : lowers;
        
        
        if(bigger.size() - smaller.size() >= 2)
            smaller.add(bigger.poll());
        if(bigger.size() == smaller.size()){
            return ((bigger.peek() + smaller.peek())/2.0);
            
        }
        else{
            return bigger.peek();
        }
    }
    private static class  medComp implements Comparator<Integer> {
        @Override
        public int compare(Integer a,Integer b){
            return (b-a);
        }
    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int[] a = new int[n];
        Solution s = new Solution();
        for(int i=0;i<n;i++){
            int num = in.nextInt();
            System.out.println(s.getMedian(num));
        }
    }
}
//9.Tries: Contacts
import java.util.*;

class Node {
    int count;
    Node[] children;
    
    Node() {
        this.count = 0;
        this.children = new Node[26];
        Arrays.fill(children, null);
    }
    
    
     public void insert(Node head,String val){
        Node cur = head;
        for(char c: val.toCharArray())
        {
            Node child = cur.children[c-'a'];
            if(child == null){
               child = new Node();
               cur.children[c-'a'] = child;
            }
            child.count++;
            cur = child;       
        }
    }
    
    public int find(Node head,String val){
        Node cur = head;
        for(char c: val.toCharArray()){
            Node child = cur.children[c-'a'];
            if(child == null)
                return 0;
            cur = child;
        }
        return cur.count;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Node trie = new Node();
        int n = scan.nextInt();
        
        while(n-- > 0) {
            
            String operation = scan.next();
            String value = scan.next();
            
            // Insertion Operation
            if(operation.equals("add")) {
                trie.insert(trie, value);
            }
            else { // Search Operation
                Node currentNode = trie;
                
                // Traverse through each level
                for(char c : value.toCharArray()) {
                    // Maintain a reference to the Node matching the char for that level
                    currentNode = currentNode.children[c - 'a'];
                    
                    if(currentNode == null) {
                        break;
                    }
                }
                
                // Print the number of results
                System.out.println(trie.find(trie,value));
            }
        }
        scan.close();
    }
}


