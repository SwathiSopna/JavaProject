package com.jaw.suncorp;

import java.math.BigDecimal;

public class BigDecimalHighPrecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigDecimalHighPrecision bg = new BigDecimalHighPrecision();
		String com="500";
		String eq="300";
		String fsl="200";
		String gst="1.5";
		BigDecimal b1 = new BigDecimal(com);
		BigDecimal b2 = new BigDecimal(eq);
		BigDecimal b3 = new BigDecimal(fsl);
		BigDecimal b4 = new BigDecimal(gst);
		bg.sum(b1,b2,b3,b4);
		
		
	}
private BigDecimal sum(BigDecimal com , BigDecimal eq, BigDecimal fsl, BigDecimal gst) {
	com.add(eq).add(fsl); // here we eill get only 500. because BigDecimal Objects are Immutable.
	return com;
	
}
/*private BigDecimal sum(BigDecimal com , BigDecimal eq, BigDecimal fsl, BigDecimal gst) {
	BigDecimal cd=com.add(eq).add(fsl).multiply(gst); // Note:  if you want to calculate with BigDecimal->use return value...o/p 1500.
	
	return cd;
	
}*/
}
