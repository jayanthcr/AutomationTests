package numeric.programs;

public class DigitReverseinString {

	public static void main(String[] args) {

		// li[normalize-space()="Price: 495"]  //xpath for one site
		//https://www.meripustak.com/search?strm=maths
		String str1 = "orange123apple456";
		String result = transformString(str1);

		System.out.println("Transformed String: " + result);
	}

	public static String transformString(String str) {
		StringBuilder result = new StringBuilder();

		int i = 0;
		while (i < str.length()) {
			if (Character.isDigit(str.charAt(i))) {
				StringBuilder digits = new StringBuilder();
				while (i < str.length() && Character.isDigit(str.charAt(i))) {
					digits.append(str.charAt(i));
					i++;
				}
				result.append(digits.reverse());
			} else {
				result.append(str.charAt(i));
				i++;
			}
		}
		return result.toString();

	}

}
