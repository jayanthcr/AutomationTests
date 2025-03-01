package research;

import java.util.HashMap;
import java.util.Set;

public class Testt {

	public static void main(String[] args) {
	//int[] ar={5,7,7,9,4,7,9,7,3,2};
		//elements more than once out should be 7 and 9
		int[] ar={5,7,7,9,4,7,9,7,3,2};
		HashMap<Integer,Integer> hs=new HashMap<>();
		for(int a : ar)
		{
			if(hs.containsKey(a))
			{
				hs.put(a, hs.get(a)+1);
			}
			else {
			hs.put(a, 1);
			}
		}
		System.out.println(hs);
		Set<Integer> s=hs.keySet();
		for(Integer key : s)
		{
			if(hs.get(key)>1)
			{
				System.out.println(key);
			}
		}

	}

}


////a[@data-ved='2ahUKEwiY94r1r_eKAxW36jgGHeQ5BewQmxMoAHoECDEQAg']
