package exceptionHandle;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception{
		int res = 0;
		Demo d1 = new Demo();
		try {
			  res = d1.division(0, 5);
			System.out.println(res);
		}
			catch (ArithmeticException e)
		{
			System.out.println("Divisor cannot bezero");
		}
		finally {
			
			System.out.println("The result is "+res);
		}

	}

}
