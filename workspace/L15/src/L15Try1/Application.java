package L15Try1;

class Person {

	 String name;

	 int age;

	public void hey() {

		StringBuilder sb = new StringBuilder();
		sb.append("Hello. ").append("My name is ").append(name)
				.append(". You are about to see my getter and return practice section. I hope I will get it right.");

		System.out.println(sb.toString());

	}

	int yearsLeftForretirment() {

		int yearsLeft = 65 - age;

		return yearsLeft;
	}

	String getName() {

		//String name = "Hemang";
		
		return name;
	}

	int getAge() {

		//int age = 23;
		
		return age;
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();

		personOne.name = "Hemang";

		personOne.age = 23;

		int retirmentAgeCalculation = personOne.yearsLeftForretirment();
		
		String name = personOne.getName();
		
		int age = personOne.getAge();
		
		StringBuilder nameAge = new StringBuilder();
		
		nameAge.append(name).append(" ").append(age).append(".");
		
		System.out.println(nameAge.toString());

		System.out.println(retirmentAgeCalculation);

		personOne.hey();

	}

}
