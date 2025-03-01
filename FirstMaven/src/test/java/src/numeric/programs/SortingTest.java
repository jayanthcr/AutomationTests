package numeric.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,1,3,6,7,8};
		//converting to array to list
		//if you declared it as int a[]= {2,4,1,3,6,7,8};
		// Convert the int array to Integer array - because Arrays.asList method works only on non primitive type
		Integer[] integerArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
		List ls=new ArrayList(Arrays.asList(integerArray));
		System.out.println(ls.toString());
		

		Collections.sort(ls);
		System.out.println(ls);
		Collections.reverse(ls);
		
		System.out.println(ls.toString());
	}

}
