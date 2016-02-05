package l44try1;

public enum Animal {
	CAT("TOM"),DOG("JACK"),MOUSE("JERRY");
	
	private String name;
	
	Animal(String name){
		this.name = name;
		
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return "The name of the animal is: " + name;
	}

}
