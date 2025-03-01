package numeric.programs;

public class sumOfDigits {
	public static void main(String[] args) {
int n=5555;
int sum=0;
while(n!=0)
{
	int r=n%10;
	sum=sum+r;
	n/=10;
}
System.out.println("sum of digit is "+sum);
	}
}
