package EvenOdd;

public class OddT extends Thread
{
	EvenOdd obj;
	
	public OddT(EvenOdd obj)
	{
		this.obj=obj;
	}
	
	public void run() 
	{
		for (int i = 0; i < 10; i++)
		{
			obj.odd();
		}

	}

}
