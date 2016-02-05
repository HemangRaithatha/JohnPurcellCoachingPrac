
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = Animal.MOUSE;

		switch (animal) {
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
			break;

		}

		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.MOUSE.getName());
		System.out.println("Enum name as a String: " + Animal.MOUSE.name());
		

		Animal animal2 = Animal.valueOf("CAT");
		
		System.out.println(animal2);
	}

}
