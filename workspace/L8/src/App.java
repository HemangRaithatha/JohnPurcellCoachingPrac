import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, set your code: ");
		
		String line = input.nextLine();
		
		System.out.println("Code set by you is: " + line);
	
	
		Scanner digit = new Scanner(System.in);
		
		System.out.println("Please, set your digit number: ");
		
		int value = digit.nextInt();
		
		System.out.println("Digit number set by you is: " + value);
		
		
		Scanner integer = new Scanner(System.in);
		
		int i;
		
		do{
			System.out.println("Please, enter authorized integer to finish your process.");
			
			i = integer.nextInt();
		}while(i != 549);
		
		System.out.println("You have succesfully completed your process. ");
		
		
	}

}
