
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = new String[3];

		words[0] = "Hello ";
		words[1] = "How are ";
		words[2] = "you?";

		for (int i = 0; i < words.length; i++) {

			System.out.print(words[i]);
		}

		System.out.println();

		String[] texts = { "Hello", "Hey", "Hi", "whats up?" };

		for (String text : texts) {

			System.out.println(text);
		}

		
	}

}
