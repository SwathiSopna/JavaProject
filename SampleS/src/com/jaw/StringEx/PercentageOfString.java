package com.jaw.StringEx;

public class PercentageOfString {
	
	public static void main(String[] a) {
		String str= "Percentage1- Of2- Uppercase3& Letters9";
		char[] ch = str.toCharArray();
		int total= ch.length;
		int upper =0;
		int lower = 0;
		int others = 0;
		int numbers = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(Character.isUpperCase(ch[i])) {
				upper++;
			}else if(Character.isLowerCase(ch[i])) {
				lower++;
			}else if(Character.isDigit(ch[i])) {
				numbers++;
			}
			else {
				others++;
			}
		}
		System.out.println("UpperCase Percentage : "+(upper*100)/total);
		System.out.println("LowerCase Percentage : "+(lower*100)/total);
		System.out.println("Others Percentage : "+(others*100)/total);
		System.out.println("Number Percentage : "+(numbers*100)/total);
	}

}
