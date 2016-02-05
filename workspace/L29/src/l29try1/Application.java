package l29try1;

class Machine {

	public void start() {

		System.out.println("Machine started");
	}
}

class Camera extends Machine {

	public void start() {

		System.out.println("Camera started");
	}

	public void snap() {

		System.out.println("Photo has been taken!!");

	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine mach1 = new Machine();

		mach1.start();

		Camera carm1 = new Camera();
		carm1.start();
		carm1.snap();
		
		//Upcasting
		Machine machine2 = carm1;
		
		machine2.start();
		
		//Downcasting
		Camera carm2 = (Camera) machine2;
		
		carm2.start();
		carm2.snap();
		
		
		
		
		

	}

}
