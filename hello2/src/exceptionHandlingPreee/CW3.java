package exceptionHandlingPreee;

public class CW3 {
	public static void m1()
	{
		System.out.println("Calling M2");
		m2();
	}

	private static void m2() {
		System.out.println("Calling M3");
		try 
		{
			m3();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Occur "+e);
		}
		
	}

	private static void m3() {
		
			int a=10, b=0;
			int res = a/b;
			System.out.println(res);		
	}

	public static void main(String[] args) {
		System.out.println("Before M3");
		m1();
		System.out.println("After M3");
		

	}

}
