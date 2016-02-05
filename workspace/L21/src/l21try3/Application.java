package l21try3;

class Person {

	private String name;
	private int age;

	public String toString() {

		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * sb.append(age).append(": ").append(name);
		 * 
		 * return sb.toString();
		 */

		return String.format("%s: %d", name, age);
	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Person() {
		System.out.println("hello");
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Hemang", 23);

		System.out.println(person1);

		Person person2 = new Person();

		// System.out.println(person2);

		Person person3 = new Person();
		//System.out.println(person3);

	}

}
