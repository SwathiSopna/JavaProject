package com.jaw.StringEx;

// Q.5.	Find out length of the string without length() method of a String?

public class StringWithoutLengthOf {

	public static void main(String[] a) {
		String st = "Pulkoria Mary";
		int i = 0;
		
		for(char ch:st.toCharArray()) {
			i++;
		}
		System.out.println(i);
			}
}
