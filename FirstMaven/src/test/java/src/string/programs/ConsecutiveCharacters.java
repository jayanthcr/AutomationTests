package string.programs;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String str = "gfaaaaakl";
        //String str="10000110";
        findMaxConsecutiveChars(str);
    }

    public static void findMaxConsecutiveChars(String str) {
        int maxCount = 0;
        int currentCount = 1;
        char maxChar = str.charAt(0);
        char currentChar = str.charAt(0);
        int maxStartIndex = 0;
        int currentStartIndex = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } 
            else 
            { 
            	if (currentCount > maxCount) 
            	{
                    maxCount = currentCount;
                    maxChar = currentChar;
                    maxStartIndex = currentStartIndex;
                }
                currentChar = str.charAt(i);
                currentCount = 1;
                currentStartIndex = i;
            }
        }
        
        // Check last segment
        
        if (currentCount > maxCount) 
        {
            maxCount = currentCount;
            maxChar = currentChar;
            maxStartIndex = currentStartIndex;
        }

        System.out.println("Character: " + maxChar);
        System.out.println("Start Index: " + maxStartIndex);
        System.out.println("Maximum Repetitions: " + maxCount);
    }
}
