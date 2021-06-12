package mafia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderRepeat {

	public static void main(String[] a) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("D:\\SampleTest.txt"));
		List<String> list = new ArrayList<>();
		
		String line = reader.readLine();
		List<String> lists=new ArrayList<>();
		while(line !=null) {
		List<String> str=method(line);	
		for(String st : str) {
			lists.add(st);
		}
		
		for (int i = 0; i<lists.size();i++) {
			for(int j = i+1;j<lists.size();j++) {
				if(lists.get(i).equals(lists.get(j))) {
					list.add(lists.get(i));
				}
			}
		}
		line = reader.readLine();
		}
		System.out.println(list);
		reader.close();
	}
	private static  List<String> method(String line) {
		String[] str = line.split(" ");
		List<String> lst = Arrays.asList(str);
		return lst;
		
	}
}
