package L16Try1;

class Robot{
	
	public void speak(String text, String textTwo , String textThree){
		
		StringBuilder  sb= new StringBuilder();
		
		sb.append(text).append(textTwo).append(textThree);
		
		System.out.println(sb.toString());
	}
	
	public void followDirection(String d1, int m1){
		
		StringBuilder dm = new StringBuilder();
		
		dm.append("Proceed to your upcoming " + d1 + " then travel " + m1 + " meters before getting next command");
		
		System.out.println(dm.toString());
		
	}
	
	public void saySingleLine(String text){
		
		System.out.println(text);
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robotOne = new Robot();
		
		robotOne.speak("Hello. My name is hemang. ","Yes, I am about to turn 23. ", "I hope I turn to be a good programmer");
	
		robotOne.followDirection(" straight", 10 );

		robotOne.saySingleLine("Hey any one there? Why am i not getting any feedback?");
		
		
	}

}
