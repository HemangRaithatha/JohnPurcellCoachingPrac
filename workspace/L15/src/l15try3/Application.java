package l15try3;

class Person {

	private String name;

	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	public void speak() {
		StringBuilder sb = new StringBuilder();

		sb.append("Hello. My name is ").append(name).append("and my age is ").append(age);

		System.out.println(sb.toString());
	}

	int calRetAge() {

		int yearsLeft = 65 - age;

		System.out.println(yearsLeft);

		return yearsLeft;
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();

		person1.setName("Hemang Raithatha");
		person1.setAge(23);

		person1.speak();

		System.out.println();

		String name = person1.getName();

		int age = person1.getAge();

		System.out.println(age);

		System.out.println(name);

		System.out.println();

		Person person2 = person1;

		person2.setName("Neha Raithatha");
		person2.setAge(27);

		person2.speak();

		System.out.println();

		person2.calRetAge();

	}

}
