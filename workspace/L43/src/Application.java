
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot(558);
		
		robot.start();
		
		//Brain brain = new Brain();
		
		Robot.Brain brain = robot.new Brain();
		
		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		
		battery.charge();
		

	}

}
