package numeric.programs;
import java.util.*;
import java.util.stream.Collectors;

public class SecondLargetUniqueNumber {


	public static void main(String[] args) {
		int[] a = {1, 2, 4, 5, 1, 2, 3, 4, 6, 2, 5};

		// Convert the array to a List
		List list = new ArrayList();
		list=Arrays.stream(a).boxed().collect(Collectors.toList());
//		for (int num : a) {
//			list.add(num);
//		}

		// Use a Set to remove duplicates
		Set<Integer> uniqueNumbers = new HashSet<>(list);

		// Convert the Set, back to a List for sorting
		List<Integer> sortedList = new ArrayList<>(uniqueNumbers);

		// Sort in descending order
		Collections.sort(sortedList, Collections.reverseOrder());

		// Get the second largest element
		if (sortedList.size() >= 2) {
			System.out.println("Second largest number is: " + sortedList.get(1));
		} else {
			System.out.println("Array doesn't have enough distinct elements.");
		}
	}
}

