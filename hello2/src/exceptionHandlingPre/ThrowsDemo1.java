package exceptionHandlingPre;

public class ThrowsDemo1 
{

	public static void main(String[] args) 
	{
		Demo d=new Demo();
		int result=0;
		try
		{
			result=d.division(8, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("katalyaaa");
		}
		finally
		{
			System.out.println("Kajyaaaa");
		}
	}

}
