package com.jaw.StringEx;

//Q.13.	Write a program to check whether given string is a palindrome or not?
public class CheckPalindromeOrNot {
	
	static boolean isPalindrome(String string) {
		String reverse = reverseMethod(string);
		if(reverse.equals(string)) {
			return true;
		}
		return false;
	}
static String reverseMethod(String str) {
	if(str == null || str.isEmpty()) {
		return str;
	}
	return str.charAt(str.length()-1)+reverseMethod(str.substring(0,str.length()-1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("malayalam"));
	}

}
