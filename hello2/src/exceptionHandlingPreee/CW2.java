package exceptionHandlingPreee;

public class CW2 {
	public void m1()
	{
		System.out.println("Calling M2");
		m2();
	}

	private void m2() {
		try
		{
			int a=10, b=0;
			int res=a/b;
			System.out.println(res);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		CW2 ob = new CW2();
		ob.m1();
		

	}

}
