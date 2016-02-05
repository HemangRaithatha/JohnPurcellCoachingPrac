package l18try3;

public class Machine {

	private String name;
	private int code;

	public Machine() {

		this("Hemang", 23);
		System.out.println("First constructor is running...");

	}

	/*public Machine(String name) {

		this("Hemang", 23);
		System.out.println("Second constructor is running.... ");

		this.name = name;
	}
*/
	public Machine(String name, int code) {

		System.out.println("Third construcor is running...");
		
		this.name = name; 
		this.code = code;
	}
}
