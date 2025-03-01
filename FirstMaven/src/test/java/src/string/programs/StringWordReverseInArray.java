package string.programs;


public class StringWordReverseInArray {
	public static void main(String[] args) {
		String str1 = "String Reverse Program";
		String str2 = reverseWords(str1);
		System.out.println(str2); // Output: "gnirtS esreveR margorP"
	}

	public static String reverseWords(String str) {
		String[] words = str.split("\\s");
		StringBuilder reversedString = new StringBuilder();

		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word);
			reversedString.append(reversedWord.reverse().toString());
			reversedString.append(" ");
//			char[] ch=word.toCharArray();
//			for(int i=ch.length-1;i>=0;i--)
//			{
//				res=res+word.charAt(i);
//			}
//			reversedString.append(res);
		}

		return reversedString.toString().trim();
		
	}
}




