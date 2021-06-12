package com.jaw.suncorp;

import java.util.ArrayList;
import java.util.List;

public class PersonClientExample {
	
	public static void main(String a[]) {
	//List<Person> list = new ArrayList<>();
	Person persons = new Person();
	persons.setName("Jesus");
	persons.setAge(33);
	persons.setAddress("Isreal");
	 
	PersonClientExample.findAge(persons);
	
	
	}

	private static Integer findAge(Person persons) {
		
		return persons.getAge();
		// TODO Auto-generated method stub
		
	}
	
}	


