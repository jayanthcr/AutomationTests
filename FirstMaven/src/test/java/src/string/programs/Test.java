package string.programs;

public class Test {
	/*
	 * Given a sentence, a. Move 1st word to last, 2nd word to 2nd last, 3rd word to
	 * 3rd last and so on. b. Then after each word, add as many asterisk as the
	 * index position of the word assuming the starting index is 1. c. Convert all
	 * space to underscore.
	 * 
	 * Example: Input: A computer is a machine that can be programmed to carry out
	 * sequences of arithmetic or logical operations automatically
	 * 
	 * Output:
	 * automatically*_operations**_logical***_or****_arithmetic*****_of******
	 * _sequences*******_out********_carry*********_to**********_programmed*********
	 * **_be************_can*************_that**************_machine***************
	 * _a****************_is****************_computer*****************_A************
	 * ******
	 */
	public static void main(String[] args)
	{
		String input="A computer is a machine that can be programmed to carry out sequences of arithmetic or logical operations automatically";

		StringBuilder sb2=new StringBuilder(input);
		//StringBuilder sss=sb2.reverse();
	
		String input1=sb2.reverse().toString();
		String[] st=input1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<st.length;i++)
		{
			StringBuilder ss=new StringBuilder(st[i]);
			sb.append(ss);
			for(int j=0;j<=i;j++)
			{
				sb.append("*");
			}
//			sb.append("*",i);
			sb.append("_");
			
			
		}
System.out.print(sb.toString().trim());		
		
		
	
	}
}
