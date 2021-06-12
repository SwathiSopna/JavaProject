package com.jaw.StringEx;


// Q.1 1.	Write a program to reverse a String
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Swathipriya";
		char[] ch = str.toCharArray();
		for(int i =ch.length-1; i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		//2. String Buffer
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		System.out.println(sb.reverse());
		}
	}


