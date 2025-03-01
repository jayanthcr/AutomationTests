package numeric.programs;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class missingElementInArray {
		    public static void main(String[] args) {
		        int[] arr = {1, 2, 4, 5, 7, 10,8}; // Example array with missing elements 3, 6, 9

		        // Find the missing elements
		        Arrays.sort(arr); //if elements are not in sorted order
		        Set<Integer> missingElements = findMissingElements(arr, 1, 10);

		        // Print the missing elements
		        System.out.println("Missing elements: " + missingElements);
		    }

		    public static Set<Integer> findMissingElements(int[] arr, int start, int end) {
		        Set<Integer> missingElements = new HashSet<>();
		        Set<Integer> elementsInArray = new HashSet<>();
		        
		        // Add array elements to the set
		        for (int num : arr) {
		            elementsInArray.add(num);
		        }

		        // Identify missing elements
		        for (int i = start; i <= end; i++) {
		            if (!elementsInArray.contains(i)) {
		                missingElements.add(i);
		            }
		        }

		        return missingElements;
		    }
}
