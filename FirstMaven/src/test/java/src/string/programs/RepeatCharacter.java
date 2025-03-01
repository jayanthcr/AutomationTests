package string.programs;

public class RepeatCharacter {
    public static void main(String[] args) {
        String input = "a2b3c4d5";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i =i+2) {
            char ch = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                output.append(ch);
            }
        }
        System.out.println(output.toString());
    }
}

