package numeric.programs;

public class SwapNumber {

	public static void main(String[] args) {
//swapping without third variable
		int a=12;
		int b=24;
		
		System.out.println("Before Swapping "+a+" And "+b);
		
		a=a+b;//36
		
		b=a-b;//36-24=12
		a=a-b;//36-12=24
		
		System.out.println("After Swapping "+a+" And "+b);
		
	}

}
