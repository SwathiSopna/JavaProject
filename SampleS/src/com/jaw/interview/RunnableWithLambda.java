package com.jaw.interview;

import java.time.Year;
import java.util.Collection;
import java.util.function.Predicate;

public class RunnableWithLambda {
	public static void m1() {
		for(int i=0; i<10; i++) { 
			System.out.println("Child Thread");
			}
	}
	public static void main(String a[]) {
		
		/*Runnable r = () -> {
			for(int i=0; i<10; i++) { 
			System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread();
		t.start();
		for(int i=0; i<10; i++) { 
			System.out.println(" Main Thread"); // this code gives only Main thread
		}*/
		
		Thread t = new Thread(new Runnable() { 
			 public void run() { 
			 for(int i=0; i<10; i++) { 
			 System.out.println("Child Thread"); 
			 } 
			 } 
			 }); 
		 t.start(); 
		  for(int i=0; i<10; i++) 
		 System.out.println("Main thread"); 
	}
	
	
	
	
		
		//3.method reference
		/*Runnable r = RunnableWithLambda:: m1;
		Thread t = new Thread();
		
		t.start();
		for(int i=0; i<10; i++) { 
			System.out.println(" Main Thread"); // this code gives only Main thread
		}*/
			

	}
	
	// Predicate<Collection> p = c-> c.isEmpty(); // it gives compile time error
	
	


 

// Note
// () -> { System.out.println("Child Thread");} ---> Compilation Error left hand side must be a variable
	
	
	
