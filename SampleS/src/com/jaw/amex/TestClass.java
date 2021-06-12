package com.jaw.amex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value = {1,2,5,5};
		
		String op1 = "ABC";
		String opt2= "BC";
		
		op1.chars().distinct().mapToObj(ch -> String.valueOf((char) ch)).filter(opt2::equals)
		.forEach(System.out::println);
		
		char[] tochar = op1.toCharArray();
		char[] tochar1 = opt2.toCharArray();
		
		List<Character> list = new ArrayList<>();
		for( char s : op1.toCharArray() ) {
			list.add(s);
		}
		List<Character> list2 = new ArrayList<>();
		for( char s : opt2.toCharArray() ) {
			list2.add(s);
		}
		/*Optional<Character> s = list.stream().filter(e -> .contains(e)).distinct().findAny();
		System.out.println("Option1 Value : " + s);*/
		
		list.forEach(lst -> {
			list2.forEach(lst2 -> {
				if(lst.compareTo(lst2) != 0) {
					//System.out.println("Option1 Value : " + lst);
					
				}
			});
		});
		/*for( int i = 0; i<opt2.length(); i++) {
			if(list.contains(opt2.charAt(i))) {
				System.out.println("Jesus"+ i);
			}
		}*/
		
		/*for(Character ch1 : tochar) {
			for(Character ch2 : tochar1) {
				if(!ch1.equals(ch2)) {
					System.out.println("Option 1 " + ch1 );
				} 
				
				
			}*/
			
		//}
		
		//reverse (tochar,opt2);
		

	}
	
	static void reverse(char[] ch,String str) {
		 for(Character chs : ch) {
			 if (!chs.equals(str.charAt(str.length()-1)))
				 System.out.println(str); 
		 } /*else {
			 reverse(str.substring(0,str.length()-1)); 
		 }
		
		if ( ( str==null )||(  str.length() <= 1) ) 
	           System.out.println(str); 
	        else
	        { 
	            System.out.print(str.charAt(str.length()-1)); 
	            reverse(str.substring(0,str.length()-1)); 
	        } */
	}

}
