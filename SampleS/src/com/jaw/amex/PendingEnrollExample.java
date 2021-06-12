package com.jaw.amex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class PendingEnrollExample {
	
	 static class SortByDate implements Comparator<PendingEnroll> {
	        @Override
	        public int compare(PendingEnroll a, PendingEnroll b) {
	            return a.getInsetDate().compareTo(b.getInsetDate());
	        }
	    }
	

	public static void main(String a[]) {
		List<PendingEnroll> list = new ArrayList<>();
		PendingEnroll penEnroll = new PendingEnroll("11","2020-03-25","Payment-Device","Enrolled");
		PendingEnroll penEnroll2 = new PendingEnroll("11","2019-01-27","Payment-Device","Enrolled");
		PendingEnroll penEnroll3 = new PendingEnroll("11","2019-01-26","Payment-Device","Pending");
		PendingEnroll penEnroll4 = new PendingEnroll("11","2020-01-27","Payment-Device","Enrolled");
		PendingEnroll penEnroll5 = new PendingEnroll("11","2020-06-22","Payment-Device","Enrolled");
		PendingEnroll penEnroll6 = new PendingEnroll("11","2020-06-22","Payment-Device","Enrolled");
		PendingEnroll penEnroll7 = new PendingEnroll("11","2020-06-22","Payment-Device","Pending");
		PendingEnroll penEnroll8 = new PendingEnroll("11","2020-06-22","Payment-Device","Enrolled");
		PendingEnroll penEnroll9 = new PendingEnroll("11","2020-06-20","Payment-Device","Pending");
		PendingEnroll penEnroll10 = new PendingEnroll("11","2018-02-28","Payment-Device","Pending");
		list.add(penEnroll);
		list.add(penEnroll2);
		list.add(penEnroll3);
		list.add(penEnroll4);
		list.add(penEnroll5);
		list.add(penEnroll6);
		list.add(penEnroll7);
		list.add(penEnroll8);
		list.add(penEnroll9);
		list.add(penEnroll10);
		
		
		//String str = String.join("/",list.get(0).getStatus());
		
		String str = list.stream()
				.filter(e-> e.getStatus().equalsIgnoreCase("Pending"))
				.map(PendingEnroll::getStatus).collect(Collectors.joining("/"));
		
		System.out.println(""+str);
		
		
		List<PendingEnroll> sortedUsers = list.stream()
				  .sorted(Comparator.comparing(PendingEnroll::getInsetDate).reversed())
				  .collect(Collectors.toList());
		
			/*Collections.sort(sortedUsers, new Comparator<PendingEnroll>() {
		    public int compare(PendingEnroll m1, PendingEnroll m2) {
		        return m1.getInsetDate().compareTo(m2.getInsetDate());
		    }
		});*/
		
	
	/*	Collections.sort(datestring, (s1, s2) -> LocalDateTime.parse(s1, formatter).
	            compareTo(LocalDateTime.parse(s2, formatter)));*/
		
		List<PendingEnroll> penList = list.stream().filter(e->Objects.nonNull(e.getFeatureName()))
		.filter(e->e.getFeatureName().equalsIgnoreCase("Payment-Device"))
		.filter(e->Objects.nonNull(e.getStatus()))
		.filter(e->e.getStatus().equalsIgnoreCase("Pending"))
		.filter(e -> Objects.nonNull(e.getInsetDate()))
		.collect(Collectors.toList());
		
		Collections.sort(penList, new SortByDate());
		//penList.sort((PendingEnroll s1, PendingEnroll s2)->s2.getInsetDate()-s1.getInsetDate());
		
		//.max(Comparator.comparing(PendingEnroll::getInsetDate)).get();
		//.collect(Collectors.toList());
		
		//.collect(maxBy(getLastestDateComparator));
		
		/*PendingEnroll pen = penList.stream().max(Comparator.comparing(PendingEnroll::getInsetDate)).get();*/
		/*penList.forEach(date -> {
	            System.out.println(date.getInsetDate());
	        });
		*/
		
		/* List<PendingEnroll> sortedLis = list.stream()
					.sorted(Comparator.comparing(PendingEnroll::getInsetDate)
					.reversed())
					 .filter(e->e.getFeatureName().equalsIgnoreCase("Payment-Device"))
					.collect(Collectors.toList());*/
		 
		Optional<PendingEnroll> sortedLis = list.stream()
					.sorted(Comparator.comparing(PendingEnroll::getInsetDate)
					.reversed())
					 .filter(e->e.getFeatureName().equalsIgnoreCase("Payment-Device"))
					 .filter(e->Objects.nonNull(e.getStatus()))
					 .filter(e->e.getStatus().equalsIgnoreCase("Pending"))
					 .filter(e -> Objects.nonNull(e.getInsetDate())).findFirst();
		 
		 /*Optional<PendingEnroll> pen = sortedLis.stream()
				 .filter(e->e.getFeatureName().equalsIgnoreCase("Payment-Device"))
					.filter(e->Objects.nonNull(e.getStatus()))
					.filter(e->e.getStatus().equalsIgnoreCase("Pending"))
					.filter(e -> Objects.nonNull(e.getInsetDate())).findFirst();*/
		
		 
		System.out.println(sortedLis.get().getInsetDate());
		
	}
	
}
