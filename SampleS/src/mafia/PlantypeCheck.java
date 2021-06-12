package mafia;

import java.util.Objects;

public class PlantypeCheck {

	public static void main(String a[]) {
		//String str =new String("Sopna");
		String str ="Success";
		PlanType res =  str.equalsIgnoreCase("Success")? PlanType.valueOf(str.toUpperCase())
				  : null;
				  
		  System.out.println(res);
		  
		  
	}
}
