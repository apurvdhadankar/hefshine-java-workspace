package pre1;

public class Buy  extends Thread{
	Stock b;
	Buy(Stock s1)
	{
		b=s1;
	}
	@Override
	public void run() 
	{
		for (int i = 0; i < 100; i++) 
		{
			b.buy();
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		}
	}
}
