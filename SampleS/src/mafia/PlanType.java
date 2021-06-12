package mafia;

public enum PlanType {

	 SUCCESS("SUCCESS"),
	    MOBILE("MOBILE"),
	    WEB("WEB");
	
	  private final String value;

	    private PlanType(String value) {
	        this.value = value;
	    }
	/*public static PlanType valueOfIgnoreCase(String value) {
		// = value.toUpperCase();
        return valueOf(value);
    }*/
	 @Override 
	 public String toString() {
	        return value;
	    }


}
