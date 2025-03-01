package numeric.programs;

import java.util.Arrays;

public class SeggregateEvenandOdd {

	public static void main(String[] args) {

		int[] ar= {4,7,1,55,134,35,7,8,6,10};
		int left=0;
		int right=ar.length-1;
		Arrays.sort(ar);
		while(left<right)
		{
			if(ar[left]%2==0)
			{
				left++;
			}
			else if(ar[right]%2==1)
			{
				right--;
			}else {
				int temp=ar[left];
				ar[left]=ar[right];
				ar[right]=temp;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
