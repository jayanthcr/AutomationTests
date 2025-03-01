package string.programs;

public class StringTest {

	public static void main(String[] args) {

		String s1="abc";
		String s2=new String("abc");
		String s3="abc";
		String s4=new String("abc");
		
		if(s1==s2)
			System.out.println("true");
		else
			System.out.println("false");
		if(s1==s3)
			System.out.println("true");
		else
			System.out.println("false");
		if(s2==s4)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		
		System.out.println(s1.compareTo(s4));
		
		
		
	}

}
