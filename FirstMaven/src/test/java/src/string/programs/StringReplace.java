package string.programs;

import java.util.HashMap;
import java.util.Map;

public class StringReplace {
	public static void main(String[] args) {
		String s = "Jayanth is working at Broadridge";
		String output = replaceSecondRepeats(s);
		System.out.println(output);
	}

	public static String replaceSecondRepeats(String s) {
		Map<Character, Integer> mp = new HashMap<>();
		StringBuilder output = new StringBuilder();

		for (char ch : s.toCharArray()) 
		{
			mp.put(ch, mp.getOrDefault(ch, 0) + 1);
			if(mp.get(ch)>=2 && ch==' ')
				output.append(" ");
			if(mp.get(ch)>=2 && ch!=' ')
			{
				output.append("@");
			}
			else {
				output.append(ch);
			}
		}
		return output.toString();
	}
}
