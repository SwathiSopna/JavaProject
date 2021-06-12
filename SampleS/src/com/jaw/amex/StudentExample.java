package com.jaw.amex;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList( new Student("Monika", 25),new Student("Mary", 26), new Student("Swathi", 30), new Student("Sachin",27),
				new Student("Sagar",29));
		//Student stu = new Student();
		list.stream().filter( e-> Objects.nonNull(e.getAge()))
		.filter(e -> e.getAge() <= 30).map(Student :: getName).findFirst().isPresent();
		//collect(Collectors.toList()).forEach(System.out::println);
      
	}

}
