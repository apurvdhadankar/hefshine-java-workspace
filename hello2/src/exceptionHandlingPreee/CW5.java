package exceptionHandlingPreee;

public class CW5 {
	public static void m1()
	{
		try
		{
			int a=10, b=0;
			int res= a/b;
			System.out.println(res);
			Thread.sleep(1000);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Checked Exception");
		}
	}

	public static void main(String[] args) {
		m1();

	}

}
