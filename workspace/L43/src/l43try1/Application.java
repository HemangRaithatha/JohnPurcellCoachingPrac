package l43try1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot(558);
		
		robot.start();
		
		Robot.Brain brain = robot.new Brain();
		System.out.println();
		brain.think();
		
		
		Robot.Battery battery = new Robot.Battery();
		
		battery.charging();
		
		System.out.println();
		
		
		

	}

}
