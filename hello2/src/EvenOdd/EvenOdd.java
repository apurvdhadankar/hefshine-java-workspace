package EvenOdd;

public class EvenOdd
{
	int a=1;
	int b=1;
	synchronized public void even()
	{
		//if(a%2==0)
			System.out.println("5 table "+(5*a));
		a=a+1;
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
		
	}
	synchronized public void odd()
	{
		//if(b%2!=0)
			System.out.println("2's table "+(2*b));
		b=b+1;
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
		
	}
}
