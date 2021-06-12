package com.jaw.StringEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Q.16.	Write a java program to find duplicate characters in a string?
public class DuplicateChar {
	
	public static void main(String[] args) {
		String str = "hi Swathi";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for (char val : arr) {
			if (Character.isAlphabetic(val)) {
				if (charMap.containsKey(val)) {
					charMap.put(val, charMap.get(val) + 1);
				} else {
					charMap.put(val, 1);
				}
			}
		}
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			if(entry.getValue()>1)	
			System.out.println(entry.getKey());
		}
	}

}
