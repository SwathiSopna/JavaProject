package com.jaw.amex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TagListClass {
	
	public static void main( String a[] ) {
		
		List<TagList> list = Arrays.asList(new TagList("Book","1234"),new TagList("Claim No","123"));
		
			
		String strValue = list.stream()
		.filter(e -> Objects.nonNull(e.getName()))
		.filter(e -> Objects.nonNull(e.getValue()))
		.map(e-> String.format("%s : %s", e.getName(), e.getValue()))
		.collect(Collectors.joining(" , "));
		
		System.out.println(strValue);
		
	}

}
