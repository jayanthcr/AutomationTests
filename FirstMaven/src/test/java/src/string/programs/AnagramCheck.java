package string.programs;

import java.util.Arrays;

public class AnagramCheck {
	    public static void main(String[] args) {
	        String s1 = "spot";
	        String s2 = "pots";

	        if (areAnagrams(s1, s2)) {
	            System.out.println(s1 + " and " + s2 + " are anagrams.");
	        } else {
	            System.out.println(s1 + " and " + s2 + " are not anagrams.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove any whitespace and convert strings to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Check if lengths are different
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to char arrays
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        // Sort the char arrays
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare the sorted arrays
	        return Arrays.equals(charArray1, charArray2);
	    }

}
