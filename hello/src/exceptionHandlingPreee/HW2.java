package exceptionHandlingPreee;

public class HW2 {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Always Execute");
		}

	}

}
