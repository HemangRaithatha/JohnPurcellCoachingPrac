class Dext {

	private String name;

	private int code;
	
	public Dext(String name, int code){
		
		this.name = name; 
		
		this.code = code;
	}

	public String toString() {
 
		StringBuilder bb = new StringBuilder();
		
		bb.append(name ).append("; ").append(code);
		
		return bb.toString();
	}
}

public class L21_try1 {

	public static void main(String[] args) {

		Dext dextOne = new Dext("Hemang", 23);

		System.out.println(dextOne);

	}

}
