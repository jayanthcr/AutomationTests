package numeric.programs;

import java.util.Arrays;
import java.util.HashSet;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {1, 4, 6, 8,1};
        Arrays.sort(arr2);
        
        int[] mergedArray = mergeArrays(arr1, arr2);
        HashSet<Integer> hs=new HashSet<>(Arrays.stream(mergedArray).boxed().toList()); //to remove duplicates
        System.out.println(hs.toString());

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : hs) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 if any
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 if any
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}

