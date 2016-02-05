package l21try1;

class Person {

	private String name;

	private int age;

	public Person(String name, int age){
		
		this.name= name; 
		this.age = age;
		
	}

	public String toString() {

		return String.format(" %-5d %s",age , name);
		
		/*StringBuilder sb = new StringBuilder();

		sb.append(age).append(" ").append(name);

		return sb.toString();*/
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person("Hemang",23);

		System.out.println(personOne);
		
		Person personTwo = new Person("Neha", 27);
		
		System.out.println(personTwo);
		
		

	}

}
