package l33try1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String fileName = "text.txt";

		File textFile = new File(fileName);

		Scanner in = new Scanner(textFile);

		int value = in.nextInt();
		int value1 = in.nextInt();
		
		in.nextLine();
		
		int count = 2;
		System.out.println("Read value: " + value);

		System.out.println("Read value: " + value1);
		
		

		while (in.hasNextLine()) {

			String line = in.nextLine();

			System.out.println(count+ ": " + line);
			count++;
		}

		in.close();
	}

}
