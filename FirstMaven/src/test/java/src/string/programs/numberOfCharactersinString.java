package string.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class numberOfCharactersinString{
	public static void characterCount(String s)
	{
		//converting string to character
//		char[] c=s.toCharArray();
		HashMap<Character,Integer> hs=new HashMap<>();
		char[] c=s.toCharArray();
		for(char str : c)
		{
			if(hs.containsKey(str))
			{
				hs.put(str, hs.get(str)+1);
			}
			else
			{
				hs.put(str, 1);
			}
		}
		System.out.print(Collections.max(hs.values()));
System.out.println(hs.toString());
Set<Character> k=hs.keySet();
for(char key : k)
{
	
	System.out.println(key+"-->"+hs.get(key));
}

		
	}
	public static void main(String[] args) {

		characterCount("RahulShettyacademy");
	}

}
