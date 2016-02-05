package ocen;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machineOne = new Machine();
		
		//machineOne.start();
		machineOne.stop();
		
		
		Person personOne = new Person("Hemang Raithatha");
		
		personOne.greeting();
		
		Info info1 = machineOne;
		
		info1.setInfo();
		
		Info info2 = personOne;
		
		info2.setInfo();
		
		System.out.println();
		
		outputInfo(machineOne);
		outputInfo(personOne);
		
	}
	
	private static void outputInfo(Info info){
		info.setInfo();
	}

}
