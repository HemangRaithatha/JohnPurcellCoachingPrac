package l39try1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("test.txt");

		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);

			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {

				System.out.println(line);

			}

		} catch (FileNotFoundException e) {

			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to find the file " + file.toString());
		}

		try {
			br.close();
		} catch (IOException e) {

			System.out.println("Unable to close the file " + file.toString());
		} catch (NullPointerException ex) {

			// File probably didn't ever opened

		}

	}

}
