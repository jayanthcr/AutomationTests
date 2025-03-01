package numeric.programs;

import java.util.Scanner;

public class FibonecciSeries {
	public static void main(String[] args) {
		int a=0,b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("---Enter the Number----");
		int num=s.nextInt();
		while(a<num)
		{
			System.out.println("Fibonecci series is "+a);
			int c=a+b;
			a=b;
			b=c;
		}
			s.close();
	}
}
