package com.jaw.StringEx;

import java.util.regex.Pattern;

// Q.8.	Write a program to reverse the given string word wise?
public class StringReverseWord {

	static String reverseWord(String st) {
		 /* Pattern pattern = Pattern.compile("\\s"); 
		  String arr[] = pattern.split(st);*/
		 String arr[] = st.split(" ");
		String result="";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				result =arr[i]+result;
			}else {
				result = " "+ arr[i]+result;
			}
			
		}
		
		return result;
		}
	
	public static void main(String[] a) {
		String st = "rotate one char in a given string";
		System.out.println(reverseWord(st));
	}
}
