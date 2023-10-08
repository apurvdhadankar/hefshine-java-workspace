package hw2MT;

public class Fibonacci extends Thread{

	int fib=10;
	public Fibonacci() {
		
	}
	@Override
	public void run() {
		System.out.println("Fibonacci");
		try
		{
			int a=0, b=1, c=0;
			while(fib>0)
			{
				System.out.println(c+" ");
				a=b;
				b=c;
				c=a+b;
				fib=fib-1;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
