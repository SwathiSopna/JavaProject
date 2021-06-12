package com.jaw.amex;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalExample {
	
	public static void main(String a[]) {
		
        // Assigning value into BigDecimal object       
		BigDecimal bdValue1 = new BigDecimal("400");   
		BigDecimal bdValue2 = new BigDecimal("200");  
		
		BigDecimal finalValue = bdValue1.min(bdValue2);
		
		System.out.println("finalValue"+ finalValue);
		
		 BigDecimal bd = new BigDecimal("12.50");
		 BigDecimal bd1 = new BigDecimal("12.30");
		    // Round to 1 digit using HALF_EVEN
		    BigDecimal roundedDown = bd1
		        .round(new MathContext(2, RoundingMode.HALF_DOWN));
		    
		    BigDecimal roundedUp = bd
			        .round(new MathContext(2, RoundingMode.HALF_UP));
		    
		    
		 
		    System.out.println("rounded Down" + roundedDown ); 
		    
		    System.out.println("rounded Up" + roundedUp ); 

		
	}

}
