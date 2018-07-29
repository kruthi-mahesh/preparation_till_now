import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
 /*
     * Complete the rollingString function below.
     */
    static String rollingString(String s, String[] operations) {
        /*
         * Write your code here.
         */

    }

 private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int operationsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String[] operations = new String[operationsCount];

        for (int operationsItr = 0; operationsItr < operationsCount; operationsItr++) {
            String operationsItem = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            operations[operationsItr] = operationsItem;
        }

        String res = rollingString(s, operations);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}