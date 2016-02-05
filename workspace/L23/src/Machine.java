
public class Machine implements Info {

	
	public String machineName = "Asus"; 
	private int code = 8; 
	
	public void start(){
		
		System.out.println("Machine got started.");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("Machine code is " + code);
		
	}
	
}
