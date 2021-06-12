package com.jaw.StringEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepeatedChar {
	
	public static void main(String[] a) {
		String str = "hi Swathi";

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for (char val : arr) {
			if (Character.isAlphabetic(val)) {
				if (charMap.containsKey(val)) {
					if(val==1)
						System.out.println(val);
					charMap.put(val, charMap.get(val) + 1);
				} else {
					charMap.put(val, 1);
				}
			}

		}
	
	}

}
