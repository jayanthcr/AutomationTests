package string.programs;

public class CharacterForm {
	    public static void main(String[] args) {
	        String input = "aabbbccccdddddc";
	        String output = "";
	        int count = 1;
	        
	        for (int i = 1; i < input.length(); i++)
	        {
	            if (input.charAt(i) == input.charAt(i - 1)) {
	                count++;
	            } else {
	                output =output+ input.charAt(i - 1) + Integer.toString(count);
	                count = 1;
	            }
	        }
	        
	        // Append the last character and its count
	        output =output+ input.charAt(input.length() - 1) + Integer.toString(count);

	        System.out.println(output);
	    }
	}

