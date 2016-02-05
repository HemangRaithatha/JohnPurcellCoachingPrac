class Machine {

	public void start() {

		System.out.println("Machine started!");
	}
}

interface Plant{
	
	public void grow();
}


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machineOne = new Machine(){
			@Override
			public void start(){
				
				System.out.println("Camera snapped");
			}
		};
		
		Plant plantOne = new Plant(){
			
			public void grow(){
				System.out.println("Plant is growing");
			}
		};
		
		
		
		
		
		
		
		///////implementation//////////////////////////////////
		
		machineOne.start();
		
		plantOne.grow();

	}

}
