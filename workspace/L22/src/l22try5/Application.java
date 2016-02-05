package l22try5;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///////////// MACHINE///////////////////

		Machine mach1 = new Machine();

		mach1.start();
		mach1.machineCode();

		///////////// PERSON///////////////////

		Person person1 = new Person("Hemang");

		person1.greet();

		////////////// Using interface method/////////////

		IInfo personInfo = person1;

		personInfo.showInfo();

		IInfo machineInfo = mach1;

		machineInfo.showInfo();
		
		System.out.println();
		
		outputInfo(mach1);
		
		outputInfo(person1);

	}
	
	private static void outputInfo(IInfo info){
		
		info.showInfo();
	}

}
