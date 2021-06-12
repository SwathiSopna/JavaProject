package com.jaw.StringEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RepeatCharInFileRead {
	
	public static void main(String a[]) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("D:\\SampleTest.txt"));
		String str = bf.readLine();
		Map<Character,Integer> map = new HashMap<>();
		while(str!=null) {
			char[] ch = str.toCharArray();
			for(char c: ch) {
				if(Character.isAlphabetic(c)) {
					if(map.containsKey(c)) {
						map.put(c, map.get(c)+1);
					}else {
						map.put(c, 1);
					}
				}
			}
			str = bf.readLine();
		}
		if(!map.isEmpty()) {
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(" "+entry.getKey()+"-"+entry.getValue());
			}
		}
		}
		bf.close();
	}

}
