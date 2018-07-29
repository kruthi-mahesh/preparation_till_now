/*Making Anagrams

We consider two strings to be anagrams of each other if the first strings letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice is taking a cryptography class and finding anagrams to be very useful. She decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

Input Format

The first line contains a single string, . 
The second line contains a single string, .

Constraints

It is guaranteed that  and  consist of lowercase English letters, ascii[a-z].
Output Format

Print a single integer denoting the minimum number of characters which must be deleted to make the two strings anagrams of each other.

Sample Input

cde
abc
Sample Output

4

Explanation

We delete the following characters from our two strings to turn them into anagrams of each other:

1. Remove d and e from cde to get c.
2. Remove a and b from abc to get c.
We had to delete 4 characters to make both strings anagrams.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. 
        Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        String src = (in.nextLine());
        String tar = in.nextLine();
        int length = 0;       
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
            
      }
    
}
 /*
 public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
*/