package l8try1_1scanner;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please, set your code: ");

		String line = input.nextLine();

		System.out.println("Code set by you is: " + line);

		System.out.println("Please, set your digit number: ");

		int value = input.nextInt();

		System.out.println("Digit number set by you is: " + value);

		int i;

		do {
			System.out.println("Please, enter authorized integer to finish your process.");

			i = input.nextInt();
		} while (i != 549);

		System.out.println("You have succesfully completed your process. ");
	}

}
