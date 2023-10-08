package exceptionHandlingPreee;

public class Demo  {
	int result;
	public int division(int divident, int divisor)
	{
		result=divident/divisor;
		if(divisor==0)
			throw new ArithmeticException("Arithmetic Exception Occur");
		return result;
	}
	
}
