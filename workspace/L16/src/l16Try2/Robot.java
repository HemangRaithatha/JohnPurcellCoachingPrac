package l16Try2;

public class Robot {

	/*private String name;

	private int code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	public void robotInfo() {
		
		StringBuilder sb = new StringBuilder();
		
	
		sb.append("The robot that I am looking for is ").append(getName()).append(". Yeah, the code number of that robot is ").append(getCode());
	
		System.out.println(sb.toString());
	
	}*/
	
	public void robotInfo2(String name, int code){
		
		System.out.println("The robot that I am looking for is " + name + ". Yeah, the code number of that robot is "+ code +".");
	}
	
	public void speak(String text){
		
		System.out.println(text);
	}
	
	public void yearsLeft2Tr50(int age){
		
		int yearsLeft= 50 - age;
		
		System.out.println(yearsLeft);
		
	}

}
