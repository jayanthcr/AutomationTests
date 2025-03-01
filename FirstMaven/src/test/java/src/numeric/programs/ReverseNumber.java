package numeric.programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123; // Example number
        int reversedNumber = reverse(number);
        System.out.println("Reversed Number: " + reversedNumber); // Output: 321
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
