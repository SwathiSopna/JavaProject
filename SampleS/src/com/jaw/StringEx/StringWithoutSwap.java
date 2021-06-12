package com.jaw.StringEx;

//Q.22.	How do you swap two string variables without using third or temp variable in java?
public class StringWithoutSwap {
	
	public static void main(String[] a) {
		String str = "Swathi";
		String str1 = "Sopna";
		
	
		str=str+str1;
		
		str1 = str.substring(0, str.length()-str1.length());
		
		str = str.substring(str1.length());
		
		System.out.println(str+"  "+str1);
		
	}

}
