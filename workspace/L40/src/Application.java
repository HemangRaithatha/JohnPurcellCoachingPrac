class Temp implements AutoCloseable{
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing!!");
		throw new Exception("Oh no!");
	}
	
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Temp temp = new Temp()){
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
