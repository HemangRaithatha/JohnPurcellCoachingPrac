package l18try4;

class Thing {

	private String name;

	private int code;

	public Thing() {

		this("Hem", 23);
		System.out.println("constructor one is running!");

	}

	public Thing(String name) {

		this("Hem", 23);

		System.out.println("Constructor two is running");

		this.name = name;

	}

	public Thing(String name, int code) {

		System.out.println("Constructor three is running");

		this.name = name;
		this.code = code;
	}

}

public class Application {

	public static void main(String[] args) {

		new Thing();

		new Thing("Hemang");

		new Thing("Hem", 23);

	}

}
