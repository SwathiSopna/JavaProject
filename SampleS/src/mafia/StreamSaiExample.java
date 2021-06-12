package mafia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamSaiExample {

	public static void main(String a[]) {
		List<StreamCancelEx> list = new ArrayList<>();
		StreamCancelEx exam = new StreamCancelEx();
		MembershipEmbedded member = new MembershipEmbedded();
		
		List<ArCards> arCards = new ArrayList<>();
		ArCards card = new ArCards();
		card.setCardCancellationSts("Y");
		card.setCardNumber("1234");
		arCards.add(card);
		
		ArCards card1 = new ArCards();
		card1.setCardCancellationSts(null);
		card1.setCardNumber("123456");
		arCards.add(card1);
		
		ArCards card2 = new ArCards();
		card2.setCardCancellationSts(null);
		card2.setCardNumber("1234599");
		arCards.add(card2);
		member.setId("iddd");
		member.setArCards(arCards);
		exam.setMembershipEmbedded(member);
		list.add(exam);
		
		/*Optional<ArCards> arCardss =list.stream().filter(e-> Objects.nonNull(e.getMembershipEmbedded())	)
				.filter(e -> Objects.nonNull(e.getArCards))
				.flatMap(e -> e.getMembershipEmbedded().getArCards())
				.collect(Collectors.toList());
		
*/		List<String> str =list.get(0).getMembershipEmbedded().getArCards().stream()
				.filter(e -> Objects.isNull(e.getCardCancellationSts() ))
				.map(ArCards::getCardNumber)
				.collect(Collectors.toList());
		str.forEach(System.out::println);
		
		
	}
}
