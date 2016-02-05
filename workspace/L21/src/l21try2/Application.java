package l21try2;

class Person{
	private String name; 
	
	private int age;
	
	public Person(int age,  String name){
		
		this.age = age; 
		this.name = name; 
	}
	public String toString(){
		
		 return String.format("%d : %s", age, name);
		
		/*StringBuilder sb = new StringBuilder();
		
		sb.append(age).append(": ").append(name);
		
		return sb.toString();*/ 
		
		
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person(23, "Hemang Raithatha");
		
		System.out.println(personOne);
	}

}
