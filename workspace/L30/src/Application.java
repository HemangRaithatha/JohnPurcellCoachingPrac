import java.util.ArrayList;
import java.util.HashMap;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		list.add("apple");
		list.add("Banna");
		list.add("Coffe");

		String fruit = (String) list.get(1);

		System.out.println(fruit);

		ArrayList<String> string = new ArrayList<String>();
		
		string.add("Hello");
		string.add("hey");
		string.add("bye");
		
		String greetings = (String) string.get(2);
		
		System.out.println(greetings);
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		
		ArrayList<String> somelist = new ArrayList<>();
		

	}

}
