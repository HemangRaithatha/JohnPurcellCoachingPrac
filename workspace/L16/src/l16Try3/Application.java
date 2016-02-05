package l16Try3;

class Person {

	public void sayName(String name) {

		System.out.println("Hello. My name is " + name);
	}

	public void sayAge(int age) {

		System.out.println("My age at this moment is " + age);
	}

	public void orderThing(String supplier, String stuffName, int quanty, String unit) {

		StringBuilder sb = new StringBuilder();

		sb.append("I want to buy ").append(stuffName).append(" from the ").append(supplier)
				.append(". Can you please order ").append(quanty).append(unit).append(" for me- please?");

		System.out.println(sb.toString());
	}

	public void greetings(String greet) {
		System.out.println(greet);
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();

		personOne.sayName("Hemang Raithatha");

		personOne.sayAge(23);

		personOne.orderThing("Amazon", "Apple handsfree", 20, " unit");

		System.out.println();
		String sayHello = "Helloooooo";
		
		personOne.greetings(sayHello);

	}

}
