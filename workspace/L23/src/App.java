
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person("Hemang");

		personOne.greet();

		Machine machineOne = new Machine();
		machineOne.start();

		Info infoOne = new Machine();

		infoOne.showInfo();

		Info infoTwo = personOne;

		infoTwo.showInfo();
		
		outputInfo(personOne);
		
		outputInfo(machineOne);

	}
	
	private static void outputInfo(Info info){
		
		info.showInfo();
	}

}
