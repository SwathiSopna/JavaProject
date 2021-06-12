package com.jaw.StringEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Q.7.	Write a java program to find the duplicate words and their number of occurrences in a string?
public class DupllicateWordsOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi Swathi Swathi";

		Map<String, Integer> charMap = new HashMap<String, Integer>();
		String[] arr = str.split(" ");
		for (String val : arr) {
			//if (String.contains(val)) {
				if (charMap.containsKey(val)) {
					charMap.put(val, charMap.get(val) + 1);
				} else {
					charMap.put(val, 1);
				}
			

		}
		for (Entry<String, Integer> entry : charMap.entrySet()) {
			if(entry.getValue()>1) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " - " + value);
			}
		}
	}

}
