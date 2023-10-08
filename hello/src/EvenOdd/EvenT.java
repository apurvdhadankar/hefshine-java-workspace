package EvenOdd;

public class EvenT extends Thread
{
	EvenOdd obj;

	public EvenT(EvenOdd obj)
	{
		this.obj = obj;
	}
	
	public void run() 
	{
		for (int i = 0; i < 10; i++)
		{
		  obj.even();	
		}
	}
	
}
