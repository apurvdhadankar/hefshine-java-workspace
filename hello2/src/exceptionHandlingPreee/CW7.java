package exceptionHandlingPreee;
public class CW7 {

	public static void main(String[] args) throws InterruptedException {
		int a=10, b=0;
		int res=a/b;
		Thread.sleep(1000);
		System.out.println(res);
		
		throw new ArithmeticException("Divide By Zero");
		

	}

}
