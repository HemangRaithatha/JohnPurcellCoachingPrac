class Person {

	String name;

	int age;

	String myName() {

		System.out.println("My name is " + name);

		return name;
	}

	int myInt() {

		System.out.println("My age is: " + age);

		return age;

	}

	String getName() {

		return name;
	}

	int getAge() {

		return age;
	}

	int getting30() {

		int yearsLeft = 30 - age;

		return yearsLeft;

	}
}

public class L15Try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();

		personOne.name = "Hemang Raithatha";
		personOne.age = 23;

		personOne.myName();

		personOne.myInt();

		System.out.println();
		System.out.println(personOne.getName());

		System.out.println(personOne.getAge());

		int yearsLeft = personOne.getting30();

		System.out.println("No of years left to turn 30 is: " + yearsLeft);

	}

}
