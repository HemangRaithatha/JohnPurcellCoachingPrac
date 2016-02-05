package l14try2;

class Person {

	String name;

	int age;

	public void Intro() {

		System.out.println("Hello. My name is " + name + " and my age is " + age + ".");
	}

	public void SayHello() {

		System.out.println("Hello. How do you do?");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();
		
		personOne.name = "Hemang Raithatha";
		
		personOne.age = 23;

		personOne.Intro();

		personOne.SayHello();

		Person personTwo = new Person();
		
		personTwo.name ="Neha Raithatha";
		personTwo.age = 27;

		personTwo.SayHello();

		personTwo.Intro();

	}

}
