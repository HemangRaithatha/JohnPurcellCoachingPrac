package L18try2;

class Person {

	private String name;

	private int age;

	public Person() {

		this(23, null);

		System.out.println("First constructor is running");

	}

	public Person(String name, int age) {

		this(23, null);

		System.out.println("Second constructor is running");

	}

	public Person(int age, String name) {

		System.out.println("Third constructor is running");
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();

		new Person("PersonTwo", 23);

		new Person(0, null);

	}

}
