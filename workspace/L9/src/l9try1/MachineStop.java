package l9try1;


import java.util.Scanner;

public class MachineStop {
	

	
	public void machineStop() {

		Scanner insert = new Scanner(System.in);
		
		int istop;
		
		do {
			System.out.println("Please, enter code to work on machine: ");

			istop = insert.nextInt();
		} while (istop != 549);

		switch (istop) {

		case 549:

			System.out.println("Machine stopped!");

			break;

		}

	}

}
