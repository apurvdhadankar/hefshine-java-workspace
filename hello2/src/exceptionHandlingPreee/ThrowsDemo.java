package exceptionHandlingPreee;

public class ThrowsDemo {

	public static void main(String[] args) {
		int result=0;
		Demo d = new Demo();
		
		try
		{
			result = d.division(10, 0);
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divosr cannnot be zero");
		}
		finally {
			System.out.println("Result--->"+result);
		}

	}

}
