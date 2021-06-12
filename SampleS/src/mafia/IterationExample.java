package mafia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IterationExample {
	public static void main(String[] a) throws IOException {
		
		// 1. Buffered Reader
		/*BufferedReader bc= null;
		try {
			String str;
			bc= new BufferedReader(new FileReader("D:\\SampleTest.txt"));
			while((str=bc.readLine())!=null) {
				System.out.println(str);
			}
		}
		catch(Exception e){
			System.out.println(""+e);
		}
		finally {
			bc.close();
		}
		*/
		
		// 2.Scanner
		/*Scanner sc= null;
		try {
			
			sc= new Scanner(new FileReader("D:\\SampleTest.txt"));
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e){
			System.out.println(""+e);
		}
		finally {
			sc.close();
		}*/
		
		Scanner sc= null;
		try {
			
			sc= new Scanner(new FileReader("D:\\SampleTest.txt"));
			sc.useDelimiter("//Z");   // Note /z-end of the input /Z - end of the I/P but final terminator
			System.out.println(sc.next());
		}
		catch(Exception e){
			System.out.println(""+e);
		}
		finally {
			sc.close();
		}
	}

}
