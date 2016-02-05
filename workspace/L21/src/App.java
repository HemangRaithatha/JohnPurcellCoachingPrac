class Frog {

	private String name;

	private int code;

	public Frog(String name, int code) {

		this.name = name;

		this.code = code;
	}

	public String toString() {

		return String.format("%s: %d", name, code);

		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * sb.append(name).append(":" ).append(code);
		 * 
		 * return sb.toString();
		 */ // return name + "; " + code;
	}
}

public class App {
	public static void main(String[] args) {

		Frog frogOne = new Frog("Hemang", 33);

		System.out.println(frogOne);

	}

}
