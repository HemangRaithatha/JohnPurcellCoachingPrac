package l13try1;

class Person{
	String name; 
	
	int age;
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		
		person1.name = "Hemang Raithatha";
		person1.age = 23;
		

		System.out.println(person1.name);
		System.out.println(person1.age);
		
		Person person2 = person1; 
		
		person2.name = "Neha Raithatha";
		person2.age = 27;
		
		
		
		System.out.println();
		
		System.out.println(person2.name);
		System.out.println(person2.age);
		
		
		

	}

}
