package com.jaw.StringEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Q.11.	Write a java program to count the number of occurrences of each character in a string?
public class CountOccurenceEachChar {

	public static void main(String[] args) {
		String str = "hi Swathi";

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		 
		
		
		//char[] arr = str.toCharArray();
		
		for (char val : str.toCharArray()) {
			if (Character.isAlphabetic(val)) {
				if (charMap.containsKey(val)) {
					charMap.put(val, charMap.get(val) + 1);
				} else {
					charMap.put(val, 1);
				}
			}

		}
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " - " + value);
		}
	}
}
