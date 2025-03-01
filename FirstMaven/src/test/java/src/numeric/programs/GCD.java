package numeric.programs;

public class GCD {
	public static void main(String[] args) {
		int num1 = 2; // Example number 1
		int num2 = 4; // Example number 2
		int num3 = 6; // Example number 3
		int gcd = findGCD(num1, num2, num3);
		
		System.out.println("GCD of " + num1 + ", " + num2 + ", and " + num3 + " is: " + gcd);
	}

	public static int findGCD(int a, int b) {
		while (a != 0) {
			int temp = a;
			a = b % a;
			b = temp;
		}
		return b;
	}
	public static int findGCD(int a, int b, int c) {
		return findGCD(findGCD(a, b), c);
	}
}



