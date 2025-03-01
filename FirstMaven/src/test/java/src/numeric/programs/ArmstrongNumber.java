package numeric.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=2431;//153 371 -> Armstrong 
		int temp=n;
		double res=0;
		while(n!=0)
		{
			int r=n%10;
			int q=n/10;
			n=q;
			res=res+Math.pow(r,4);
		}
		System.out.println(res);
		if(temp==res) {
			System.out.println(res+" is a Arm number");
		}
		else
			System.out.println(res+" is not a Arm Number");
	}
}
