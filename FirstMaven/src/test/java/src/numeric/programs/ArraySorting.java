package numeric.programs;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int [] arr= {2,3,1,6,9,4,7,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	
//		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(arr[i]+" ");
			System.out.print(arr[i]+" ");
		}
	}
}
