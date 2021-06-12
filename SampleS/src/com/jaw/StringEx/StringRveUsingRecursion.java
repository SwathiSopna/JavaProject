package com.jaw.StringEx;

// Q.2.	Write a program to reverse a String with recursive algorithm?
public class StringRveUsingRecursion {

	static void reverse(String str) {
		if ((str==null)||(str.length() <= 1)) 
	           System.out.println(str); 
	        else
	        { 
	            System.out.print(str.charAt(str.length()-1)); 
	            reverse(str.substring(0,str.length()-1)); 
	        } 
	}
	public static void main(String[] a) {
		String st = "Java";
		reverse(st);
	}
}
