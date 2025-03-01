package string.programs;
//program to count the capitalized word in a string
public class CapitalizedWordsCount {

	public static void main(String[] args) {

		String s="Hello MyWorld SmartWork";
		//char[] c=s.toCharArray();
		/*
		 * String s1="abc"; String s2=new String("abc"); if(s1==s2)
		 * System.out.println("true"); else System.out.println("false");
		 * if(s1.equals(s2)) System.out.println("true"); else
		 * System.out.println("false");
		 */
		//int s11=Integer.parseInt(s);
		
		int counter=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				counter++;
			}
		}
		
		/*
		 * int j=s.length(); int i=0; while(i<j) {
		 * if(s.charAt(i)>='A'&&s.charAt(i)<='Z') { counter++; } i++; }
		 */
		
		System.out.println(counter);
	}

}
