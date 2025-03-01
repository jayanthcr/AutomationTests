package Drivers;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TestNGSimpleTest {
		 @Test
		 public void testAdd() {
		 String str = "TestNG is working fine";
		 assertEquals("TestNG is working fine", str);
		 System.out.println("Running first Test");
		 System.out.println(str1);
		 System.out.println(Arrays.toString(ar1));
		 }
		 String[] ar= {"abc","ss","uwiw"};
		 String[] ar1= {"abc","ss","yeh","uwiw"};
		 String str1=String.join(" ", ar);
		 
		 
}
