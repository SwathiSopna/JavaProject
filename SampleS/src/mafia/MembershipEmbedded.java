package mafia;

import java.util.List;

public class MembershipEmbedded {
	private String id;
	private List<ArCards> arCards;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ArCards> getArCards() {
		return arCards;
	}
	public void setArCards(List<ArCards> arCards) {
		this.arCards = arCards;
	}

	
}
