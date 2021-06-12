package mafia;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

public class HistoryType {

	/*private JAXBElement<BigDecimal> limit;
	private JAXBElement<XMLGregorianCalendar> date;*/
	
	private String limit;
	private String date;
	

	public String getLimit() {
		return limit;
	}


	public void setLimit(String limit) {
		this.limit = limit;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	/*public JAXBElement<BigDecimal> getLimit() {
		return limit;
	}

	public void setLimit(JAXBElement<BigDecimal> limit) {
		this.limit = limit;
	}
*/
	@Override
	public String toString() {
		return "HistoryType [limit=" + limit + ", date=" + date + "]";
	}
	
	
}
