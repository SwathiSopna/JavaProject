package com.jaw.amex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test1 {

	public static void main(String a[]) {
		List<Integer> list = Arrays.asList(1,3,5,7,9,10);
		
	Optional<Integer> intValue =	list.stream().sorted(Comparator.naturalOrder()).findFirst();
	
	if(intValue.isPresent() ){
		System.out.println("Minimum Value : " + intValue.get());
	}
	}
}
