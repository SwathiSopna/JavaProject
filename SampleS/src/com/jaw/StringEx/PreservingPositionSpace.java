package com.jaw.StringEx;

// Q.18.	Write a java program to reverse a given string with preserving the position of spaces?
public class PreservingPositionSpace {

	static void preservingPosition(String str, String string) {
		if (str.equals("Swa ")) {
			reverse(string.substring(10).replace(" ", ""));

		} else if (str.equals("thi ")) {
			reverse(string.substring(6, 10).replace(" ", ""));
		} else if (str.equals("pri ")) {
			reverse(string.substring(2, 6).replace(" ", ""));
		} else if (str.equals("ya ")) {
			reverse(string.substring(0, 2).replace(" ", ""));
		}
	}

	static void reverse(String str) {
		if ((str == null) || (str.length() <= 1))
			System.out.print(str + " ");
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverse(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {

		String string = "Swa thi pri ya ";
		String[] st = string.split(" ");
		for (int i = 0; i < st.length; i++) {
			preservingPosition(st[i] + " ", string);

		}
	}
}
