package demo12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		openFile();
		

	}

	private static void openFile() {

		File file = new File("text.txt");

		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			
			System.out.println("File could not be found: " + file.toString());
		}
	}

}
