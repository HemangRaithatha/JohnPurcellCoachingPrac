package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("text.text");

		try {
			FileReader reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File named " + file.toString() + " could not be found.");
			// e.printStackTrace();
		}
		System.out.println("finished");

	}

}
