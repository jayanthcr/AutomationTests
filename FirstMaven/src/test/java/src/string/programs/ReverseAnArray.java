package string.programs;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		String str="HustleOn";
		char[] ch=str.toCharArray();
		int len=ch.length;
		int right=len-1;
		int left=0;
		while(left<right)
		{
			char c =ch[left];
			ch[left]=ch[right];
			ch[right]=c;
			left++;
			right--;
		}
		//		String r="";
		//		for(int i=ch.length-1;i>=0;i--)
		//		{
		//			
		//			r=r+ch[i];
		//		}
		//		System.out.println(r);
		System.out.println(ch);
		
		
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}

	}

}
