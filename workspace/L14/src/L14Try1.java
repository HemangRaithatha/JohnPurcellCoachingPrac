class Person{
	
	String name;
	
	int age;
	
	public void speak() {
		
		System.out.println("My name is " + name);
	}
	
	public void myAge(){
		
		System.out.println("My age is: " + age);
	}
}
public class L14Try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personOne = new Person();
		
		personOne.name = "Hemang Raithatha";
		
		personOne.age = 23;
		
		personOne.speak();
		
		personOne.myAge();
		
		
		Person personTwo = new Person();
		
		personTwo.name = "Neha Raithatha";
		
		personTwo.age = 27;
		
		personTwo.speak();
		
		personTwo.myAge();
	}

}
