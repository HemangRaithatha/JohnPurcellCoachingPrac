class Machine {

	public void start() {

		System.out.println("Machine got started");
	}

}

class Camera extends Machine {

	public void start() {

		System.out.println("Camera got started");
	}

	public void snap() {

		System.out.println("Photo has be taken.");
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machineOne = new Machine();

		Camera cameraOne = new Camera();

		machineOne.start();

		cameraOne.start();
		
		//Upcasting....
		
		Machine machineTwo = cameraOne;
		
		machineTwo.start();
		
		//Downcasting.....
		
		Machine machineThree = new Camera();
		
		Camera cameraTwo = (Camera) machineThree;
		
		cameraTwo.snap();
		
		
		Machine machine4 = new Machine();
		
		//Camera cameraThree = (Camera)machine4;
		
		//ameraThree.snap();
		

	}

}
