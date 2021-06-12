package com.jaw.suncorp;

class Bird{
	public String name() {
		return"bird";
	}
}
class Pelican extends Bird{
	
	public String name() {
		return"Pelican";
	}
	public String name(String race) {
		return race+name();
	}
	//public void name() {} //error duplicate method name rename it
}
public class CheckLegalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelican p = new Pelican();
		System.out.println(p.name()); // method override
		System.out.println(p.name("ertwrew")); // method overload
	}

}
