package mafia;

public class HistoryTypeReq {

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
	@Override
	public String toString() {
		return "HistoryTypeReq [limit=" + limit + ", date=" + date + "]";
	}
	
	
}
