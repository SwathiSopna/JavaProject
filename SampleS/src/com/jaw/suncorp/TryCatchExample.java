package com.jaw.suncorp;

public class TryCatchExample {

	private static void aMethod() throws Exception{
		try {
			throw new Exception();
		}finally {
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			aMethod();
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("Outer Exception");
	}

}// no error o/p it will print three also
