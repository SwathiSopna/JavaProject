package mafia;

public class NoDataFoundException extends Exception{
	
	String message = "No Record Found";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoDataFoundException() {

    }

    public NoDataFoundException(final String message) {
        super(message);
    }

}
