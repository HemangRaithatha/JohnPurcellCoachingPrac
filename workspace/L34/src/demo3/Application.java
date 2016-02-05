package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}

	}

	public static void openFile() throws FileNotFoundException {

		File file = new File("Text.txt");

		FileReader reader = new FileReader(file);
	}

}
