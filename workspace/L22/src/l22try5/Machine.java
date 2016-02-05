package l22try5;



public class Machine implements IInfo{

	private int code = 558; 
	
	public void start(){
		
		System.out.println("Machine Started");
		
	}
	
	
	public void machineCode(){
		
		System.out.println("Machine code is: " + code + ".");
	}


	@Override
	public void showInfo() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Machine that got started is coded number: ").append(code).append(".");
		
		System.out.println(sb.toString());
	}
	
	
}
