package l9try1;

import java.util.Scanner;

public class MachineStart {

	public void machineStart() {

		Scanner input = new Scanner(System.in);

		int istart;
		do {
			System.out.println("Please, enter code to work on machine: ");

			istart = input.nextInt();
		} while (istart != 558);

		switch (istart) {

		case 558:

			System.out.println("Machine started!");

			break;

		}

	}

}
