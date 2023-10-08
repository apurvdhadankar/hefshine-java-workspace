package exceptionHandlingPreee;

public class HW6 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
		
			e.printStackTrace();
			System.out.println("Exception in Main Method");
		}

	}

}
