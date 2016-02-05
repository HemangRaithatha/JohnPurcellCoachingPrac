class Machine{
	
	private String name;
	
	private int code;
	
	public Machine(){
		this("Berttie", 559);
		System.out.println("First constructor is running");
		
	}
	
	public Machine(String name){
		this("Berttie", 559);
		System.out.println("second constructor is running");
		
		this.name = name;
		
	}
	
	public Machine(String Name,int code ){
		
		System.out.println("Third constructor is running");
	}
	
}
public class L18try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Machine();
		new Machine("Hemang");
		
		new Machine("Hemang", 23);

	}

}
