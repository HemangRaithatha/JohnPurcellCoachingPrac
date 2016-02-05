
public class Application {
	
	public final static int CAT = 0; 
	public final static int DOG = 1; 
	public final static int MOUSE = 2; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int animal = -100; 
		
		switch(animal){
		
		case CAT:
			System.out.println("CAT");
			break;
		
		case DOG:
			System.out.println("DOG");
			break;
		
		case MOUSE:
			System.out.println("MOUSE");
			break;
		
		default:
			System.out.println("Input isn't acceptable.");
			break;
			
		}
		
		

	}

}
