package string.programs;

import java.util.Arrays;

public class SeggragateZerosandOnes {

	public static void main(String[] args) {

		int[] ar= {0,1,0,1,0,1,0,1,0};
		int right=ar.length-1;
		int left=0;
		while(left<right)
		{
			if(ar[left]==0)
			{
				left++;
			}
			else if(ar[right]==1)
			{
				right--;
			}
			else
			{
				int temp=ar[left];
				ar[left]=ar[right];
				ar[right]=temp;
			}
		}
		System.out.println(Arrays.toString(ar));
		
		//short cut to print and reverse
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
