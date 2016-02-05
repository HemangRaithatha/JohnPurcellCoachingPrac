package l15try2;

class Person {

	private String name;

	private int age = 23;

	int findingRetirmentTime() {

		int yearsLeft = 65 - age;

		System.out.println(yearsLeft);

		return yearsLeft;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
}

public class Applicatiion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();

		personOne.findingRetirmentTime();

	}

}
