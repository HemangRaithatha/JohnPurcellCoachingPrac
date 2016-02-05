package l29try2;

class Machine {

	public void start() {

		System.out.println("Machine Started..");
	}

}

class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera started...");
	}

	public void snap() {
		System.out.println("Photo has been taken. ");
	}

}

public class Application {
	
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		
		
		Camera cam1 = new Camera();
		cam1.start();
		cam1.snap();
		
		
		///////UPCASTING///////////
		
		Machine mach2 = cam1;
		mach2.start();
		
		
		//////////DOWNCASTING/////////
		System.out.println();
		
		Machine mach3 = new Camera();
		
		Camera cam3 = (Camera)mach3;
		cam3.start();
		cam3.snap();
	}

}
