package ocen;

public class Person implements Info {

	private String name;

	public Person(String name) {

		this.name = name;
	}

	public void greeting() {

		System.out.println("Hello there.");
	}

	@Override
	public void setInfo() {
		StringBuilder personSb = new StringBuilder();

		personSb.append("The name of the user of this laptop is ").append(name).append(".");

		System.out.println(personSb.toString());

	}

}
