package numeric.programs;

public class Factorial {
	public static int factorialrecursive(int n)
	{
		if(n<=1)
			return 1;
		else
		return n*factorialrecursive(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(factorialrecursive(n));
		
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=result*i;
		}
		System.out.println(result);

	}

}
