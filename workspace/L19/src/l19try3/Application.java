package l19try3;

class Person {

	public String name;

	public static String description;

	public final static int NEW_CONSTANT = 558;

	public static int count;

	public int id;

	public static void javaJoy() {

		StringBuilder jj = new StringBuilder();

		jj.append(description).append("I hope that this joy will presist till end.");

		System.out.println(jj.toString());

	}

	public void instantExp() {

		System.out.println("My feeling about java is: " + Person.description);
	}

	public static void sayHello() {
		System.out.println("Hello");
	}

	public Person() {
		id = count;
		count++;
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder ct = new StringBuilder();

		Person personOne = new Person();

		ct.append("Number of the objects created in this application  is ").append(Person.count).append(".");

		System.out.println(ct.toString());
		personOne.name = "My name is Hemang Raithatha";

		Person.description = "Learning java is a happy process.";

		StringBuilder sb = new StringBuilder();

		sb.append("My id is: ").append(personOne.id).append(" ").append(personOne.name).append(".\n").append(Person.description);

		System.out.println(sb.toString());

		Person.javaJoy();

		personOne.instantExp();

		personOne.sayHello();

		System.out.println(Math.PI);

		System.out.println(Person.NEW_CONSTANT);

	}

}
