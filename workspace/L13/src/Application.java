class Person {

	public String name;

	public int age;

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();

		personOne.name = "Hemang Raithatha";
		personOne.age = 23;

		System.out.println(personOne.name);
		System.out.println(personOne.age);

		Person personTwo = personOne;

		personTwo.name = "Neha Raithatha";
		personTwo.age = 27;

		System.out.println();

		System.out.println(personTwo.name);

		System.out.println(personTwo.age);

		;

	}

}
