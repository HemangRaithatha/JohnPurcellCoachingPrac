package l22try5;

public class Person implements IInfo {

	private String name; 
	
	
	public void greet(){
		
		System.out.println("Hello, Greetings for the day!");
	}


	Person(String name) {
		
		this.name = name;
	}


	@Override
	public void showInfo() {
		
		System.out.println("The person name is " + name);
		
	}
	
	
	
	
	
}
