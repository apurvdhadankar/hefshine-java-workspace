package exceptionHandlingPre;

public class Demo {
	
	int result=0;
	public int division(int divident, int division)
	{
		if(division==0)
		{
			throw new ArithmeticException("Divisor can not be zero");
		}
		return result;
	}

}
