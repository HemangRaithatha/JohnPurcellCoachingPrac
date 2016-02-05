package l44try1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = Animal.DOG;

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
			System.out.println("This input is not accepted. ");
			break;

		}

		System.out.println(Animal.CAT.name());
		System.out.println(Animal.CAT.getClass());
		System.out.println(Animal.CAT.getName());
		System.out.println(Animal.CAT);
		System.out.println(Animal.CAT instanceof Enum);
		
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
		
	}

}
