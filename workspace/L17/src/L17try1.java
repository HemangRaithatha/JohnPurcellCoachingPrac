class Laptop {

	private String name;

	private int code;

	public String getName() {

		return name;
	}

	public int getCode() {

		return code;
	}

	public void setName(String name) {

		this.name = name;
	}
	
	public void setCode(int code){
		
		this.code = code;
	}
	
	public void setInfo(String name, int code){
		
		setName(name);

		setCode(code);
		
	}

}

public class L17try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop laptopOne = new Laptop();
		
		//laptopOne.name = "Asus";

		//laptopOne.code = 5559;
		
		
		
		System.out.println(laptopOne.getName());
		System.out.println(laptopOne.getCode());

	}

}
