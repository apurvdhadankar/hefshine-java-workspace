package exceptionHandlingPre;

public class UncheckedThrowThrows {

	public static void main(String[] args) throws InterruptedException {
		int a=10, b=0;
		int[] arr = {1,2,3,4,5,6,7,8,9};
		try {
		System.out.println(a/b);
		System.out.println(arr[90]);
		Thread.sleep(1000);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic");
			
		}
		catch (ArrayIndexOutOfBoundsException w)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
			throw new ArithmeticException();
		}
		

	}

}
