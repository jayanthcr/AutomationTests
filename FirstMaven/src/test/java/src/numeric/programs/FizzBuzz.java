package numeric.programs;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Enter Num");
		int n=s.nextInt();
		if(n%3==0&&n%5==0)
		{
			System.out.println("FizzzBuzz");
		}else if(n%3==0)
		{
			System.out.println("Fizz");
		}else if(n%5==0)
		{
			System.out.println("Buzz");
		}
		s.close();
	}

}
