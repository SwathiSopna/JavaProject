package com.jaw.StringEx;

//Q.9.	Rotate the string word wise by one

public class StringWordRotate {

	static void rotateWord(String st) {
	String arr[] = st.split(" ");
	String stp = arr[0];
	String result="";
	for (int i = 0; i < arr.length; i++) {
		if(i!=0) {
			result +=arr[i] +" ";
		}
	}
	System.out.println(result+stp);	 
	}
	public static void main(String[] a) {
		String st = "rotate one char in a given string";
		rotateWord(st);
	}
}
