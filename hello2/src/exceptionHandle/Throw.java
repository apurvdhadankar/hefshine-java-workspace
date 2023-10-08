package exceptionHandle;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcy = 2020;
		if(gcy<=2020)
		{
			System.out.println("You can take admission");
		}
		else
		{
			throw new ArithmeticException();
		}

	}

}
