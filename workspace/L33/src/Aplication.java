import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Aplication {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String fileName = "L33.txt";

		File textFile = new File(fileName);

		Scanner input = new Scanner(textFile);

		int value = input.nextInt();

		System.out.println("Read value is: " + value);

		int count = 2;
		input.nextLine();
		
		while (input.hasNextLine()) {

			String line = input.nextLine();

			System.out.println(count + ": " + line);
			
			count++;

		}

		input.close();

	}

}
