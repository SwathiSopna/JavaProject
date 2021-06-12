package com.jaw.suncorp;


class Super {
	/*Super(){
		//System.out.println("Hi");
	} */  //solution
	public Super(String name) {
		System.out.println("Superrrrrrrrrrrrr"+name);
	}
}
class Sub extends Super {
	
	public Sub(String name) {
		// error because a class extends Base canot call super()....there is no no-arg constructor in base.... sol add super(name);
		super(name);
		System.out.println("Subccccccccccc"+name);
	}
}
public class SuperEx {

	public static void main(String[] args) {
		Sub ex = new Sub("Swathi");

	}

}

// Note If we are giving no arg constructor in base it will print only sub constructor value