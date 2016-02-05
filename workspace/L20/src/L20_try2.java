
public class L20_try2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inefficient way
		String info = "";

		info += "I am hemang";
		info += " ";
		info += "Whats your name?";

		System.out.println(info);

		// Efficient way

		StringBuilder aa = new StringBuilder();

		aa.append("I am Asus").append(" ").append("Whats your name?");

		System.out.println(aa);

		//// Formating/////

		System.out.println(
				"Hello I am xyz \n" + "What does your mind say on this topic?? \t" + "I am still confused about it.");

		System.out.println("Hello");

		System.out.printf("The cost for xyz product unity %d. While the cost for the abc product is %d \n", 30, 40);

		System.out.println("Heyy");

		for (int i = 0; i < 15; i++) {

			System.out.printf("%2d %s \n", i, "program running...");

		}
		System.out.printf("Total value of the thing % 5.1f", 12346783335.667);

	}

}
