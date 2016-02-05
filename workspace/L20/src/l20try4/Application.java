package l20try4;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price = 55;
		int quantity = 10; 
		

		System.out.println("Hello you are about to see how tab looks when implemented \t And now how a new line commands looks \nI Hope you enjoyed seeing this process");
		
		System.out.println("More text");
		
		System.out.printf("The cost of the product is %-10d. Minimum quantity of order required is %10d. \n", price , quantity);
		
		System.out.printf("%s %d", "The cost of that pc is: ", 700 );
		
		System.out.println("");
		
		for(int i= 0; i < 20; i++){
			
			System.out.printf("Updating..... %2d  \n", i);
		}
		
		
		System.out.printf("The number that is being formatted is %-10.3f hello",556.76575 );
	}

}
