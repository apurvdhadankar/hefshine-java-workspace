package exceptionHandlingPre;

public class EmptyCatch {

	public static void main(String[] args) {
		try
		{
			System.out.println(10 / 0);
		}
		catch(ArithmeticException e) {
		}
	}

}
