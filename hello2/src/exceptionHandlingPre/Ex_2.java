package exceptionHandlingPre;

public class Ex_2 {

	public static void main(String[] args) {
		fun();
		
	}

	private static void fun() {
		morefun();
		System.out.println("Fun");
		
	}

	private static void morefun() {
		try
		{
			System.out.println(10 / 0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		System.out.println("More Fun");
		
	}

}
