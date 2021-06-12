package com.jaw.suncorp;

public class VarArgsEx {

	public static void main(String[] args) {

		VarArgsEx ex = new VarArgsEx();
		
		System.out.println(ex.buildingMsg("Moni","Dhana","Mary"));
		
	}
	private String buildingMsg(String...val) {
		String st ="";
		for(String stt:val) {
			st+=stt+" ";
		}
		return st;
	}
}
