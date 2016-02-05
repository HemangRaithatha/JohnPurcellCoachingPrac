package l14try4;

class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void speak() {

		
		StringBuilder sb = new StringBuilder();

		sb.append("Hello. My name is ").append(name).append(". At persent my age is ").append(age);

		for(int i =0; i<3; i++){
			
			System.out.println(sb.toString());
		}
		
		
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person();
		
		personOne.setName("Hemang Raithatha");
		personOne.setAge(23);
		
		personOne.speak();
		
		System.out.println();
		
		////Person Two
		
		Person personTwo = new Person();
		
		personTwo.setName("Neha Raithatha");
		personTwo.setAge(27);
		
		personTwo.speak();

	}

}
