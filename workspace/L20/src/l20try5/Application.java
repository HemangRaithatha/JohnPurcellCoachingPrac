package l20try5;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();

		sb.append("Hello").append(" Do you know anything about xyz? ")
				.append(" If yes, can you please help with a task in that subject?");
		
		System.out.println(sb.toString());
		
		
		for(double i = 1.0; i < 2.0; i = i + 0.1){
			
			System.out.printf(" %s %1.1f \n", "Updating......", i);
		}

		System.out.println();
		
		System.out.println("This is an tab \t and this is enter \n .....");
		
		System.out.println("Update is succesfully completed");
		
		System.out.printf("Giving it %d%% is physically impossible.", 100);
		
		String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
		
		System.out.println(formatted);
	}

}
