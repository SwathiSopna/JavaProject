package mafia;

import java.util.ArrayList;
import java.util.List;
class RiskType{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
public class EmployeePojo {

	private String empName;
	private String empPlace;
	private List<RiskType> riskTypes;
	/*private String address;
	private String date;
	List<ContactDetails> contact = new ArrayList<>();*/

	//private String newName;

	public EmployeePojo(String empName, String empPlace) {
		super();
		this.empName = empName;
		this.empPlace = empPlace;
		
		//this.contact=contact;
				//this.newName=newName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPlace() {
		return empPlace;
	}

	public void setEmpPlace(String empPlace) {
		this.empPlace = empPlace;
	}

	@Override
	public String toString() {
		return "EmployeePojo [empName=" + empName + ", empPlace=" + empPlace + "]";
	}

	public List<RiskType> getRiskTypes() {
		return riskTypes;
	}

	public void setRiskTypes(List<RiskType> riskTypes) {
		this.riskTypes = riskTypes;
	}

	


	
	
	/*public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}
*/
	
	
	

}
