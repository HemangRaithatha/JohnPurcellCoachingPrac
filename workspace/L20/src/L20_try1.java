
public class L20_try1 {

	public static void main(String[] args) {

		// inefficient way

		String info = " ";

		info += "Hello";

		info += " My name is Hemang";

		info += " How are you doing?";

		System.out.println(info);

		// efficient way

		StringBuilder sb = new StringBuilder("");

		sb.append("Hello.");
		sb.append(" My name is Asus.");
		sb.append(" Nice to meet you raj.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder("");

		s.append("Hello. ").append("My name is intell. ").append("You are using my fourth genration processor.");

		System.out.println(s.toString());

		// Formating Strings/////
		
		System.out.println("Hello \t" + "How are you doing? \n" + "I hope everything is fine.");

		System.out.println("Whats up dude?");
		System.out.printf("Your current weight is %d. You are suppose to actual have weight of only %d.", 95, 75);
		
		//Formating Integers///
		
		for(int i =0; i < 20; i++){
			
			System.out.printf("Update: %2d running...\n ", i);
		}
		
		System.out.println("System is updated");
		
		for(double i = 12.33; i < 12.40; i = i + .01){
		System.out.printf("The series numbers are %5.2f \n", i);

	}
	
	}		
			
}
