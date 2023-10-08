package test1;

public class ThrowsDemo {

	public static void main(String[] args) {
		Demo obj = new Demo();
		double res=0;
		try {
			 res  = obj.division(0, 5);
			System.out.println(res);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception is Thrown");
			System.out.println("Divisor cannot bezero");
		}
		finally {
			System.out.println("The result is "+ res);
		}
		

	}

}
