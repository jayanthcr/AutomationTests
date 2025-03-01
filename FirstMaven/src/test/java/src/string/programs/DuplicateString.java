package string.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
//program gives duplicate character
public class DuplicateString {
		public static void Duplicate(String s)
		{
			//converting string to character
//			char[] c=s.toCharArray();
			HashMap<Character,Integer> hs=new HashMap<>();
			HashMap<Character,Integer> hs1=new HashMap<>();
			hs1.put('c',1);
			hs1.put('c',2);
			hs1.put('c',3);
			System.out.println(hs1.get('c'));
			
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
			
			Set<Character> key=hs.keySet();
			for(char k:key)
			{
				if(hs.get(k)>1)
				{
					System.out.println(k +"-->"+hs.get(k));
//					System.out.println(k +"-->"+Collections.max(hs.values()));
				}else {
					System.out.println(k +"-->"+hs.get(k));
				}
			}
	System.out.println(hs);
			
		}
		public static void main(String[] args) {

			Duplicate("RahulShettyacademy");
		}

	}
