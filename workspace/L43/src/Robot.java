
public class Robot {

	private int id;
	
	public class Brain{
		public void think(){
			System.out.println("robot " + id + " is thinking..." );
		}
	}
	
	
	static class Battery{
		
		public void charge(){
			
			System.out.println("Battery is charging.....");
		}
	}

	Robot(int id) {

		this.id = id;
	}
	
	public void start(){
		
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		
		brain.think();
		
		String name = "Robert";
		
		class Temp{
			
			public void doSomething(){
				System.out.println("Id is " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		
		temp.doSomething();
	}
	
	

}
