/*Day 0: Hello, World.
Theory:
scan.next(); // returns the next token(word) of input
scan.hasNext(); // returns true if there is another token of input (false otherwise)
scan.nextLine() // returns the next LINE of input
scan.hasNextLine(); // returns true if there is another line of input
*/
import java.io.*;
import java.util.*;

public class Soln{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World." );
        System.out.println(myString);
        
            
    }
}

Day 1: Data Types
/*Theory:
Java has 8 primitive data types: 
byte, short, int, long, float, double, boolean, and char
String class objects are immutable.
nextLine methods reads from the Scanner's current location until the beginning of the next line. For example, nextInt() will scan the next token of input as an int, 
and nextDouble() will scan the next token of input as a double. 
 When you use Scanner functions that read tokens (e.g.: next(), nextInt(), etc.), the Scanner reads and returns the next token.
 When you read an entire line (i.e.: readLine()), it reads from the current position until the beginning of the next line. 
Because of this, a call to nextLine() may return an empty string if there are no characters between the end of the last read and the beginning of the next line. 
For example, given the following input:
a b c
d e
f
g
Steps for evaluating are:
1. A call to scan.next(); returns the next token, a
2. A call to scan.next(); returns the next token, b.
3. A call to scan.nextLine(); returns the next token, c. Note that the scanner returns a space and a letter, 
because it's reading from the end of the last token until the beginning of the next line
4. A call to scan.nextLine(); returns the contents of the next line, d e.
5. A call to scan.next(); returns the next token, f.
6. A call to scan.nextLine(); returns everything after f until the beginning of the next line; 
because there are no characters there, it returns an empty String.
7. A call to scan.nextLine(); returns g.

Note: In C++,To consume the whitespace or newline between the end of a token and the beginning of the next line:
// eat whitespace
getline(cin >> ws, s2);
#include <iostream>
#include <iomanip>

using namespace std;
int main(int argc, char *argv[]) {
    double pi = 3.14159;
	
    // Let's say we wanted to scale this to 2 decimal places:
    cout << fixed << setprecision(2) << pi << endl;
    printf("%.2f", pi);
}
which produces this output:
3.14
3.14
*/
public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";		
        Scanner scan = new Scanner(System.in);
    	int i2;
    	double d2;
    	String s2;
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s + s2);
        scan.close();
    }
}

/*Day 2: Operators
Task:
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
Theory
&&, ||: These are the respective binary operators used to perform logical AND and logical OR operations on two boolean (i.e.: true or false) statements.*/

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double tot = mealCost + tip + tax;
        int totalCost = (int) Math.round(tot);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}

/*Day 3: Intro to Conditional Statements
Task 
Given an integer,n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Theory:
Logical Operators:
Customize your condition checks by using logical operators. Here are the three to know: 
|| is the OR operator, also known as logical disjunction.
&& is the AND operator, also known as logical conjunction.
! is the NOT operator, also known as negation. 
if(A && B){ 
    C;	
}
    
// if A is true or B is true, then C
if(A || B){
    C;
}
    
// if A is false (i.e.: not true), then B
if(!A){
    B;
}
*/
public class Solution {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        scan.close();

        System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
    }
}
// Alternative solution
import java.util.*;

public class Solution {
    private static String weird = "Weird";
    private static String notWeird = "Not Weird";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = weird;
        }
        // 'n' must be even; proceed if 'n' >= 2
        else if(n >= 2){ 
            if(n > 20){ 
                ans = notWeird;
            }
            else if(n >= 6){ 
                ans = weird;
            }
            else if(n >= 2){
                ans = notWeird;
            }
        }
        System.out.println(ans);
    }
}

/*Day 4: Class vs. Instance
 Task 
Write a Person class with an instance variable,age, and a constructor that takes an integer,initialAge, as a parameter. The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

1. yearPasses() should increase the age instance variable by 1.
2. amIOld() should perform the following conditional actions:
	i)  If age  < 13, print You are young..
	ii) If age >= 13 and age < 18, print You are a teenager..
	iii)Otherwise, print You are old..

Input Format
The first line contains an integer,  T(the number of test cases), and the T subsequent lines each contain an integer denoting the age of a Person instance.

Sample Input

4
-1
10
16
18

Sample Output

Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.*/
public class Person {
    private int age;	
  
    public Person(int initialAge) {
        if(initialAge < 0){ // initial age is invalid
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else{ // set age to valid initial age
            this.age = initialAge;
        }
    }

    public void amIOld() {
        String result = "";
        if(age >= 18){
            result = "You are old.";
        }
        else if(age >=13){
            result = "You are a teenager.";
        }
        else{
            result = "You are young.";
        }
        System.out.println(result);
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
/*Day 5: Loops
Task 
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: n x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
/*Day 6: Let's Review
Theory:
char myChar = 'c'; // create char c
System.out.println("The ASCII value of " + myChar + " is: " + (int) myChar);

Output:
The ASCII value of c is: 99

(int) before the variable name is called explicit casting. 
Casting only works for certain types of relationships, such as between primitives or objects that inherit from another class. 

To break a String down into its component characters, you can use the String.toCharArray method

String myString = "This is String example.";
char[] myCharArray = myString.toCharArray();
for(int i = 0; i < myString.length(); i++){
    // Print each sequential character on the same line
    System.out.print(myCharArray[i]); 
}
// Print a newline
System.out.println(); 

produces this output:

This is String example.

Task 
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line 

Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String str = "";
        for(int t=0; t<T; t++)
        {
            str = sc.nextLine();
            char arr[]  = str.toCharArray();
            for(int i=0; i<str.length(); i+=2)
                System.out.print(arr[i]);
            System.out.print(" ");
            for(int i=1; i<str.length(); i+=2)
                System.out.print(arr[i]);
            System.out.println();
                
        }
        sc.close();
    }
}
/*Another approach would be to use a StringBuilder object to hold the even and odd Strings 8*/
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++){
            char[] inputString = scan.next().toCharArray();
            StringBuilder oddString = new StringBuilder();
            StringBuilder evenString = new StringBuilder();
			
            for(int j = 0; j < inputString.length; j++) {
                if( (j & 1) == 0) {
                    evenString.append(inputString[j]);
                }
                else {
                    oddString.append(inputString[j]);
                }
            }
            
            System.out.println(evenString + " " + oddString);
        }
        scan.close();
    }
}
/*Theory
Consider
String a = "Hacker";
String b = "Rank";
a = a + b;

Here, the reference to the String pointed to by  is changed from "Hacker" to a new String "HackerRank" 
(and "Hacker" is subsequently garbage-collected and destroyed). 
For this reason, StringBuilder, which allows you to create a mutable string of characters, is a better choice.*/

/*Day 7: Arrays
Theory:
final int _arraySize = 4; 
String[] stringArray = new String[_arraySize]; 
for(int i = 0; i < _arraySize; i++) {
    stringArray[i] = "This is stored in index " + i; 
    System.out.println(stringArray[i]); 
}
Note: The final keyword used in the code above is a means of protecting the variable's value by locking it to its initialized value. 
Any attempt to reassign (overwrite) the value of a final variable will generate an error.
Note on Arrays in C++:
int n; 
cin >> n;
DataType* arrayName = new DataType[n]; 

Task 
Given an array,A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
Input:
Size of array
Elements of array
Output:
Array in reverse order*/
public class Solution {
    
    public static void print(ArrayList<Integer> arr){
        String res = "";
        for(int i=arr.size() - 1 ; i>=0; i--)
            res += arr.get(i) + " ";
        System.out.println(res);
    }  

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            arr.add(in.nextInt());
        print(arr);
        in.close();
    }
}

public class Solution {

    public static void print(String[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        in.close();
        print(arr);
    }
}

public class Solution {

    	public static void main(String[] args) {
        	// Get the input
        	Scanner sc = new Scanner(System.in);
        	int length = sc.nextInt();
        	int[] array = new int[length];
        
       		for (int i = 0; i < length; i++) {
            	array[i] = sc.nextInt();
        	}
        
        	String result = "";
        
        	for (int i = array.length - 1; i >= 0; i--) {
            	result = result + array[i] + " ";
        	}
        
        	System.out.println(result);
    	}
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = n-1;i>=0;i--)
            System.out.print(arr[i] + " ");
        in.close();
    }
}

/*Day 8: Dictionaries and Maps
Theory:
Map<String, String> myMap; 
// Initialize it as a new String to String HashMap
myMap = new HashMap<String, String>();  
// Change myMap to be a new (completely different) String to String LinkedHashMap instead
myMap = new LinkedHashMap<String, String>(); 

Map Methods:
containsKey(Object key): Returns true if the map contains a mapping for key; returns false if there is no such mapping.
get(Object key): Returns the value to which the key is mapped; returns null if there is no such mapping.
put(K key, V value): Adds the (Key, Value) mapping to the Map; if the key is already in the map, the value is overwritten.

Example (Java)
// Create a Map of String Keys to String Values, implemented by the HashMap class
Map<String,String> myMap = new HashMap<String,String>(); 
    
// Adds ("Hi","Bye") mapping to myMap
myMap.put("Hi", "Bye");	

// Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi")); 

// Replaces "Bye" mapping from "Hi" with "Bye!" 
myMap.put("Hi", "Bye!"); 

// Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi")); 

produces the following output:

Bye
Bye!

Task 
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.

Sample Input

3 // the number of entries in the phone book. 
sam 99912222
tom 11122222
harry 12299933
//Queries -> continue reading lines until there is no more input.
sam
edward
harry

Sample Output

sam=99912222
Not found
harry=12299933*/
class Solution
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Map <String,Integer> myMap =  new HashMap <String,Integer> ();
        for(int i =0; i < t; i++)
        {
            String name = in.next();
            int ph = in.nextInt();
            myMap.put(name,ph);
           
        } 
        in.nextLine();
        while(in.hasNext())
        {
            String find = in.nextLine();
            Integer phno = myMap.get(find);
            if(phno!=null)
                System.out.println(find + "=" + phno);
            else
                System.out.println("Not found");
        }
        in.close();
    }

}
/*Day 9: Recursion
Theory:
Recursion Example
// Multiply 'n' by 'k' using addition:
private static int nTimesK(int n, int k) {
    System.out.println("n: " + n);
    // Recursive Case
    if(n > 1) { 
        return k + nTimesK(n - 1, k);
    }
    // Base Case n = 1
    else { 
        return k;
    }
}
public static void main(String[] args) {
    int result = nTimesK(4, 4);
    System.out.println("Result: " + result);
}
When executed, this code prints:
n: 4
n: 3
n: 2
n: 1
Result: 16

Task 
Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! 

Sample Input
3

Sample Output
6*/

public class Solution {
    public static int factorial(int n){
        if(n>1)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int res = factorial(n);
        System.out.println(res);
    }
}
/*
 public static int factorial(int n){
        return (n > 1) ? n * factorial(n - 1) : 1;
 }

/*Day 10: Binary Numbers
Theory:
Binary to Decimal Conversion
840 = 8*10^2 + 4 * 10^1 + 0 * 10^0
(1101)B = 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0

Decimal to Binary Conversion:
 To convert an integer, , from decimal to a String of binary numbers
  in Java, you can use the Integer.toBinaryString(n) function.
while(n > 0):
    remainder = n%2;
    n = n/2;
    Insert remainder to front of a list or push onto a stack

Print list or stack

Task 
Given a base-10 integer,n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

Sample Input 1
5   //(101)

Sample Output 1
1

Sample Input 2
13  //(1101)

Sample Output 2
2    */

public class Solution {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int m=0;
        String[] grps = Integer.toBinaryString(n).split("0");
        Arrays.sort(grps);
        System.out.println(grps[grps.length-1].length());
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int m=0;
        String[] grps = Integer.toBinaryString(n).split("0");
        for(String s : grps)
            if(m<s.length())
                m = s.length();
        System.out.println(m);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        char[] bin = Integer.toBinaryString(n).toCharArray();
        int c=0,m=0;
        for(int i=0; i<bin.length; i++)
        {
            if(bin[i]=='1')
                c++;
            else
            {
                if(m<c)
                    m=c;
                c=0;
            }
                
        }
        if(m<c)
            m=c;
        System.out.println(m);
    }
}

