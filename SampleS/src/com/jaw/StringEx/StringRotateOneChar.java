package com.jaw.StringEx;

// Q.4.	Write a program to rotate one char in a given string
public class StringRotateOneChar {
	static void rotate(String input) {
		
			String string= input.substring(1)+input.substring(0,1);
			System.out.println(string);
		}
	public static void main(String[] a) {
		String st = "Pulkoria Mary";
		rotate(st);
		
	/*	int i = 0;
		
		for(char ch:st.toCharArray()) {
			i++;
		}
		System.out.println(i);*/
			}

}
