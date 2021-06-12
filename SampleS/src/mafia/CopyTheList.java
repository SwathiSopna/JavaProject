package mafia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CopyTheList {
	
	public static void main(String[] a) {
		List<ContactDetails> list = new ArrayList<>() ;
		list.add(new ContactDetails("Fax","5656568999"));
		list.add(new ContactDetails("Mobile","3456789098"));
		list.add(new ContactDetails("Fax","6756789098"));
		
		/*List<String> strList = list.stream().filter(e -> Objects.nonNull(e.getContactType()))
				.filter(e -> Objects.nonNull(e.getDetails()))
				.filter(e-> e.getContactType().equalsIgnoreCase("Fax"))
				.map(e-> e.getDetails())
				.collect(Collectors.toList());
		
		System.out.println("strList  "+strList);*/
		
		List<ContactDetails> strList = list.stream().filter(e -> Objects.nonNull(e.getContactType()))
				.filter(e -> Objects.nonNull(e.getDetails()))
				.filter(e-> e.getContactType().equalsIgnoreCase("Fax"))
				//.map(e-> e.getDetails())
				.collect(Collectors.toList());
		strList.forEach(System.out::println);
		
				
		
	}

}
