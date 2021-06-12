package com.jaw.StringEx;

// Q.6.	Find out how many words are there in a given string?
public class CheckWordsCount {
	
	static void checkWords(String st) {
	String arr[] = st.split(" ");
	int result = 0; 
	
	for (String string : arr) {
		if(!string.equals("")) {
			result++;
		}
	}
	System.out.println(result);	 
	}
	public static void main(String[] args) {
		
		String string = "how many words are there in a given string";
		checkWords(string);
	}
}
