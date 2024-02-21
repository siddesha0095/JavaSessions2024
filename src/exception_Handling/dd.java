package exception_Handling;

public class dd {
	
	public static void main(String[] args) {
		
		try {
			int i=9/0;
		} 
		catch (ArithmeticException e) 
		{
	
			System.out.println("ex comping");
			e.printStackTrace();
		}
		
		//System.err.println("Bye");
		finally {
			System.out.println("inside finally block...");
		}

		System.err.println("Bye");
	}

}
