package l17try3;

class Person {

	private String name;

	int age;

	public void setName(String name) {

		this.name = name;
	}

	public void setAge(int age) {

		this.age = age;
	}

	String getName() {
		return name;
	}
	
	int getAge(){
		return age;
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();

		person1.setName("Hemang Raithatha");

		String nm = person1.getName();
		
		System.out.println(nm);
		
		person1.setAge(23);
		
		int age = person1.getAge();
		
		System.out.println(age);

	}

}
