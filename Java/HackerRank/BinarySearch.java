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
            int midIndex = left + ((right - left) / 2);

            // If value is found
            if(value.equals(array[midIndex])) {
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