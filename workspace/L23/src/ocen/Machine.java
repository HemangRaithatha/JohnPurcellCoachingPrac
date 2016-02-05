package ocen;

public class Machine implements Info {

	private int code = 558;

	
	public void stop() {

		System.out.println("Machine have got stopped.");
	}

	@Override
	public void setInfo() {

		StringBuilder sb = new StringBuilder();

		sb.append("Machine of the code number ").append(code).append(" has been started.");

		System.out.println(sb.toString());

	}
}
