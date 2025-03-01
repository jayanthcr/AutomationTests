package numeric.programs;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8};
        findCommonElements(arr1, arr2);
    }

    public static void findCommonElements(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common Element: " + arr1[i] + " at Index " + i + " in arr1 and Index " + j + " in arr2");
                }
            }
        }
    }
}

