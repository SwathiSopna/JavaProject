package com.jaw.suncorp;

import java.util.concurrent.CompletableFuture;

import javax.management.RuntimeErrorException;
import javax.xml.bind.ValidationException;

public class AsynchroExample {
	
	public static void main(String a[]) {
	Person persons = new Person();
	persons.setName("Jesus");
	persons.setAge(33);
	persons.setAddress("Isreal");
	 
	 CompletableFuture.supplyAsync(()->
		 AsynchroExample.findAge(persons))
	 .exceptionally(AsynchroExample::processError)
	 .thenApply(per ->AsynchroExample.sumAge(per.getAge()))
		
	 .thenAccept(data ->printIt(data));
	 
		
	/* .whenComplete((result,ex)-> {
		 if(ex != null) {
			 throw new RuntimeException("fgdgfh");
		 }
	 });
	*/
	// .thenApply(per ->AsynchroExample.sumAge(per.getAge()))
	 //.thenAccept(data ->printIt(data));
	
	
	}

	private static Person findAge(Person persons) {
		throw new RuntimeException("Something went wrong ");
		//return persons;
		// TODO Auto-generated method stub
		
	}
	
public static Person processError(Throwable th) {
	
		System.out.println("Error "+th.getMessage());
		throw new RuntimeException("OOPS!");
		// TODO Auto-generated method stub
	
	}
private static Integer sumAge(Integer age) {
		
		return age*2;
		// TODO Auto-generated method stub
		
	}
public static void printIt(Integer age) {
	
	System.out.println("Ages : " +age );
	// TODO Auto-generated method stub
	
}
}

