package numeric.programs;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(7));

	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		else
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					return false;
			}
		return true;
	}
}
