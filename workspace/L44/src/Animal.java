
public enum Animal {
	CAT("Tom"), DOG("Jack"), MOUSE("Jerry");

	private String name;

	Animal(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return "This animal is called " + name; 
	}
	

}
