package demo11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "C:\\Users\\heman\\Desktop\\text.txt";

		File file = new File(fileName);

		try {
			FileReader fr = new FileReader(file);

			System.out.println("Continuing......");
		} catch (FileNotFoundException e) {

			System.out.println("File not found: " + file.toString());
		}

		System.out.println("Finished.");

	}

}
