package mafia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstEx {

	public static void main(String[] args) throws NoDataFoundException {
		// TODO Auto-generated method stub

		List<Students> list = new ArrayList<>();
		list.add(new Students("Monika",27));list.add(new Students("Monika",27));
		list.add(new Students("Sachin",26));
		list.add(new Students("Sachin",26));
		list.add(new Students("Sachin",26));
		list.add(new Students("Sachin",26));
		list.add(new Students("Swathi",29));
		list.add(new Students("Mary",24));
		list.add(new Students("Mary",24));
		list.add(new Students("Mary",24));
		
		List<Address> addList = new ArrayList<>();
		addList.add(new Address("Sachin","Bangalore"));
		addList.add(new Address("Mary","Cuddalore"));
		addList.add(new Address("Monika","NagarKovil"));
		
		
		List<String> strings = addList.stream().map(Address::getName).collect(Collectors.toList());
		System.out.println("strings "+strings);
		
		Map<String, Long> counting = list.stream()
		        .filter(book -> strings.contains(book.getName()))
		        .collect(Collectors.groupingBy(Students::getName, Collectors.counting()));
		System.out.println("Each name counting "+counting);
		
		List<Entry<String, Long>> intVal =  counting.entrySet().stream()
    		  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    		  .limit(3)
    		  .collect(Collectors.toList());
      
      intVal.forEach(System.out::println);
    
        
		
			}

	

}
