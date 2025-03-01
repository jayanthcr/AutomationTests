package numeric.programs;
public class PrintPrimeNumbers {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Printing prime numbers up to 20
        for (int number = 1; number <= 20; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
}
