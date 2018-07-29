Day 25: Running Time and Complexity

Primality Algorithms

isPrimeWorst performed 2147483646 checks, determined 2147483647 is PRIME.
isPrimeLessWorst performed 1073741823 checks, determined 2147483647 is PRIME.
isPrimeGood performed 46341 checks, determined 2147483647 is PRIME.
isPrimeBest performed 23170 checks, determined 2147483647 is PRIME.


import java.util.*;

class Primality{
    private static void printStats(int count, int n, boolean isPrime){
        String caller = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.err.println( caller + " performed " + count + " checks, determined " + n
        + ( (isPrime) ? " is PRIME." : " is NOT PRIME." ) );
    }
    /**
    *   Worst: O(n) algorithm
    *     Checks if n is divisible by any number from 4 to n.
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeWorst(int n){
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }
        
        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < n - 1 ){
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }
    
    /**
    *   Better: O(n) algorithm
    *    Checks if n is divisible by any number from 2 to n/2,
    *    but is asymptotically the same as isPrimeWorst
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeLessWorst(int n){
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }

        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < n/2 ){
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }
    
    /**
    *   O(n^(1/2)) Algorithm
    *    Checks if n is divisible by any number from 2 to sqrt(n).
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeGood(int n){
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }
        else if( n == 2 ){
            printStats(++count, n, true);
            return true;
        }

        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < Math.sqrt(n) ){
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }

    /**
    *   Improved O( n^(1/2)) ) Algorithm
    *    Checks if n is divisible by 2 or any odd number from 3 to sqrt(n).
    *    The only way to improve on this is to check if n is divisible by 
    *   all KNOWN PRIMES from 2 to sqrt(n).
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeBest(int n){
        int count = 0;
        // check lower boundaries on primality
        if( n == 2 ){ 
            printStats(++count, n, true);
            return true;
        } // 1 is not prime, even numbers > 2 are not prime
        else if( n == 1 || (n & 1) == 0){
            printStats(++count, n, false);
            return false;
        }

        // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            count++;
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){ 
                printStats(++count, n, false);
                return false;
            }
        }
        // n is prime
        printStats(++count, n, true);
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            isPrimeWorst(n);
            isPrimeLessWorst(n);
            isPrimeGood(n);
            isPrimeBest(n);
            System.out.println();
        }
        scan.close();
    }
}

import java.util.*;

public class Solution {

    static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTests = sc.nextInt();
        for (int i = 0; i < numOfTests; i++) {
            int x = sc.nextInt();
            String s;
            if (x >= 2 && isPrime(x)) {
                s = "Prime";
            } else {
                s = "Not prime";
            } 
            System.out.println(s);
        }
    }
}

System.out.println( 
                (isPrime(scan.nextInt()) ? "Prime" : "Not prime") );

Day 26: Nested Logic

Task 
Your local library needs your help! Given the expected and actual return dates for a library 
book, create a program that calculates the fine (if any). The fee structure is as follows:

1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine =0.
2. If the book is returned after the expected return day but still within the same calendar month
 and year as the expected return date, 
 fine = 15(no of day late).
3. If the book is returned after the expected return month but still within the same calendar
 year as the expected return date, the 
 fine =  500 * (no of months late).
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
10000 hackos

import java.util.*;

class BookReturnDate{
    public int day;
    public int month; 
    public int year;
    
    BookReturnDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookReturnDate actual = new BookReturnDate(scan.nextInt(), scan.nextInt(),scan.nextInt());
        BookReturnDate expected = new BookReturnDate(scan.nextInt(), scan.nextInt(),scan.nextInt());
        scan.close();
        
        int fine = 0;
        
        // Returned within the current year:
        if(expected.year == actual.year){
            // Returned 1+ months late in current year
            if(expected.month < actual.month){
                fine = (actual.month - expected.month) * 500;
            }
            // Returned 1+ days late within the current month
            else if( (expected.month == actual.month) 
                    && (expected.day < actual.day) ){
                fine = (actual.day - expected.day) * 15;
            }
            // Else it is implied that the book was returned early
        }
        else if(expected.year < actual.year){
            // Returned 1+ years late
            fine = 10000;
        }
        // Else it is implied that the book was returned 1+ years early

        System.out.println(fine);
        
    }
}

Day 29: Bitwise AND

Example
The code below converts a word and an integer to binary strings:

class BinaryString {
    
    BinaryString(String string){
        for( byte b : string.getBytes() ){
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }
    
    BinaryString(Integer integer){
        System.out.println(Integer.toBinaryString(integer));
    }
    
    public static void main(String[] args) {
        new BinaryString("HackerRank");
        new BinaryString(8675309);
    }
}
When run, it prints the following output:

1001000 1100001 1100011 1101011 1100101 1110010 1010010 1100001 1101110 1101011 // Binary for "H a c k e r R a n k"
100001000101111111101101 // Binary for the integer 8675309
Next, lets modify the above class to find and print the OR of each character in the string with  8675309

class BinaryString {

    BinaryString(String string, Integer integer){
        String binaryInteger = Integer.toBinaryString(integer);
        
        for( byte b : string.getBytes() ){
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b | integer; 
            System.out.println( Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer) 
                + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
        }
    }
    
    public static void main(String[] args) {
        new BinaryString("HackerRank", 8675309);
    }
}

1001000 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
1100001 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
1100011 OR 100001000101111111101101 = 100001000101111111101111 = 8675311
1101011 OR 100001000101111111101101 = 100001000101111111101111 = 8675311
1100101 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
1110010 OR 100001000101111111101101 = 100001000101111111111111 = 8675327
1010010 OR 100001000101111111101101 = 100001000101111111111111 = 8675327
1100001 OR 100001000101111111101101 = 100001000101111111101101 = 8675309
1101110 OR 100001000101111111101101 = 100001000101111111101111 = 8675311
1101011 OR 100001000101111111101101 = 100001000101111111101111 = 8675311

import java.util.*;

public class Solution {
    public static int findMaximum(int n, int k){
        int max = 0;
        int a = n - 1; // we are constrained by a < b
        while(a-- > 0) {
            for(int b = a + 1; b <= n; b++){
                int test = a & b;
                if( 	test < k 
                	&& 	test > max ){
                    max = test;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println( findMaximum(n, k) );
        }
        in.close();
    }
}

for _ in xrange(int(raw_input())):
    n, k = map(int, raw_input().split())
    a = k - 1
    b = ~a & -~a
    if a | b > n:
        print a - 1
    else:
        print a



 public static int Findmax(int n,int k){
        int a = n-1;
        int max=0;
        while(a-- > 0){
            for(int b=a+1;b<=n;b++){
                if((a&b) <k && (a&b)>max)
                    max = (a&b);
            }
            
        }
        return max;
    }

    