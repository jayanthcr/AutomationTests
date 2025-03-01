package string.programs;

public class StringReverse {

	public static void main(String[] args) {

		String str1="String Reverse Program";
		String str2="";
		
		int size=str1.length();
		System.out.println(size);
		for(int i=size-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
	}

}
