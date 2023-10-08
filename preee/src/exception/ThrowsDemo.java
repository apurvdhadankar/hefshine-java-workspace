package exception;

public class ThrowsDemo {

	public static void main(String[] args) 
	{
		int result=0;
		try
		{
			Demo.division(5, 0);
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisor cannot be zero");
		}
		finally
		{
			System.out.println(result);
		}
	}
}
