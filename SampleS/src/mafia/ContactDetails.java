package mafia;

public class ContactDetails {

	private String contactType;
	private String details;
	
	ContactDetails(String contactType,String details){
		this.contactType = contactType;
		this.details = details;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ContactDetails [contactType=" + contactType + ", details=" + details + "]";
	}
	
	
	
}
