
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int i = 129;
		 * 
		 * if (i < 10) { System.out.println(
		 * "This number is not allowed. You can only enter number between 20 to 30"
		 * ); } else if (i < 20) { System.out.println(
		 * "You enterd number below or equal to 20");
		 * 
		 * } else if (i < 30) { System.out.println(
		 * "You entered number below or equal to 30");
		 * 
		 * } else { System.out.println(
		 * "This number is not allowed. You can only enter number between 20 to 30"
		 * );
		 * 
		 * }
		 */

		int loop = 0;

		while (loop < 5) {
			System.out.println("Looping: " + loop);

			loop++;
			if (loop == 5) {
				break;
			}

			System.out.println("Running...");

		}

	}

}
