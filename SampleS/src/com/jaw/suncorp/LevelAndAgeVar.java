package com.jaw.suncorp;

import java.math.BigDecimal;

public class LevelAndAgeVar {
	
	public static void main(String[] args) {
		
		LevelAndAgeVar la=new LevelAndAgeVar();
		la.setup();
		
		
		
	}

	public void setup() {
		String age="50";
		BigDecimal leval=new BigDecimal(age);
		changeValues(leval,age);
		System.out.println(leval);
		System.out.println(age);
	}
	public void changeValues(BigDecimal lev,String age) {
		age="100";
		lev=new BigDecimal(age);
	}
}

//BigDecimal is Immutable
