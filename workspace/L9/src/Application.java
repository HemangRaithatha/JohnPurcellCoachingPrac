import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, eneter your command: ");
		
		String text = input.nextLine();
		
		switch(text){
		
		case "start":
			System.out.println("Machine sarted!!");
			break;
			
		case "stop":
			System.out.println("Machine Stopped!!");
			break;
			
			default:
				System.out.println("Command not found.");
				
		
		}

	}

}
