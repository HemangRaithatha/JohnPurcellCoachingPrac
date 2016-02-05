package l16Try2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Robot robotOne = new Robot();
		
		//robotOne.setName("Hemang Raithatha");
		
		//robotOne.setCode(23);
		
		//robotOne.robotInfo();
		
		robotOne.robotInfo2("Hemang Raithatha", 23);
		
		robotOne.speak("Hello. My name is robotOne." );
		
		String greetings = "Hello. How are you?";
		
		robotOne.speak(greetings);
		
		int myAge = 23; 
		
		robotOne.yearsLeft2Tr50(23);

	}

}
