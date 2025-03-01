package numeric.programs;

public class longestIntegerOccurence {

	public static void main(String[] args) {

		int[] a= {4,3,25,6,7,8,9,2,3,10};
		int count=0;
		int max=0;
		for(int i=0;i<a.length-1;i++)
		{
		if(a[i]+1==a[i+1])
			count++;
		else 
			count=0;
		max=Math.max(max, count+1);
		}
		System.out.println(max);
	}

}
