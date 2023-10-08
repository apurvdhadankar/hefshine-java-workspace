package exception;

public class Demo extends Exception {
	 public static int division(int divident, int divisor)
	{
		int result = divident/divisor;
		if(divisor==0)
		{
			throw new ArithmeticException("Arithmetic Error");
		}
		return result;
	}
}
