package mafia;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Samples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeePojo> list = Arrays.asList(
				new EmployeePojo("Swathi","Mettur"), 
				new EmployeePojo("Mary","Cuddalore"));
		list.sort(Comparator.comparing(EmployeePojo::getEmpName).reversed());
		
		list.forEach(System.out::println);
		
	}

}
