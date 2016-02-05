package l36try1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();

		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("hello");
		}
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
}
