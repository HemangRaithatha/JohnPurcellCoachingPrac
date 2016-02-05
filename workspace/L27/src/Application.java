class Plant{
	
	private String name;
	
	public static final int ID = 7; 
	
	private String getData(){
		
		String data = "The some stuff you are looking for is " + getIDx7();
		
		return data;
		
	}
	
	public int getIDx7(){
		
		int ID7 = ID * 7;
		
		return ID7;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	
	
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
