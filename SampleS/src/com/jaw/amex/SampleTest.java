package com.jaw.amex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str1 = Arrays.asList("ban","che", "kol","","del");
	    
		
		KcdbList kcdbList = new KcdbList();
		
		str1.stream().sorted(Comparator.reverseOrder()).forEach(e -> {
			if( e.equals("kol")) {
				String kolValue = e.concat("-del");
				kcdbList.setKolValue(kolValue);
			} else if ( e.equals("del")) {
				String delValue = e.concat("-che");
				 kcdbList.setDelValue(delValue);
				
				}
			else if( e.equals("che")) {
				String banValue = e.concat("-ban");
				kcdbList.setCheValue(banValue);
			}
		});
		
	
	System.out.println(String.format("%s %s %s", kcdbList.getKolValue(), kcdbList.getDelValue(), kcdbList.getCheValue()));
		
			

	}

}



