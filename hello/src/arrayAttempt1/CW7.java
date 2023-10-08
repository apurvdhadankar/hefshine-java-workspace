package arrayAttempt1;

public class CW7 {
	public static void main(String[] args)throws ArithmeticException {
	try
	{
		int a=10, b=0, res=0;
		res=a/b;
		System.out.println(res);
	}
	catch (ArithmeticException e) 
	{
		throw new ArithmeticException();
	}
	}

}
