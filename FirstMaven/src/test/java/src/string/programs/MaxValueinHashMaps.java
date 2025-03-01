package string.programs;


import java.util.*;

public class MaxValueinHashMaps {
	
	public static void pri(int[] a)
	{
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int b:a)
		{
			if(hs.containsKey(b))
			{
				hs.put(b, hs.get(b)+1);
			}else {
				hs.put(b, 1);
			}
		}
		System.out.println("maximum price is : "+ Collections.max(hs.values()));
		
		System.out.println(hs.toString());
	}
	public static void main(String args[]) {
		Map<String, Integer> coursePrice = new HashMap<>();
		coursePrice.put("Java", 9000);
		coursePrice.put("Python", 3000);
		coursePrice.put("CPP", 4000);
		coursePrice.put("Android", 8000);
		System.out.println("maximum price is : "+ Collections.max(coursePrice.values()));
		System.out.println(Collections.min(coursePrice.values()));
		int[] a= {1,2,2,3,3,3,4,4,4,4};
		MaxValueinHashMaps.pri(a);
		
	}
}
