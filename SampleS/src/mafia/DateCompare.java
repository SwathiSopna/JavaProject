package mafia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateCompare {

	public static void main(String a[]) {
		/*JAXBElement<BigDecimal> limit= new JAXBElement( 
		         new QName(HistoryType.class.getSimpleName()), HistoryType.class, null);
        limit.setValue("1200.00");*/
		List<HistoryType> list = new ArrayList<>();
		HistoryType type = new HistoryType();
		type.setDate("2018-12-3");
		type.setLimit("1200");
		HistoryType type1 = new HistoryType();
		type1.setDate("2018-11-4");
		type1.setLimit("1500");
		HistoryType type2 = new HistoryType();
		type2.setDate("2019-11-4");
		type2.setLimit("1500");
		list.add(type);
		list.add(type1);
		list.add(type2);
		
		
		Optional<HistoryType>str=list.stream().collect(Collectors.maxBy(Comparator.comparing(HistoryType::getDate)));
		System.out.println(str);
		
	}
}
