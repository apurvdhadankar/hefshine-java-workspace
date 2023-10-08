package sellBuy;

public class Buy1 extends Thread{
	Stock1 s;
	Buy1(Stock1 s1)
	{
		s=s1;
	}
	@Override
	public void run() 
	{
		for (int i = 0; i < 100; i++) 
		{
			try {Thread.sleep(100);} catch(InterruptedException e) {}
			s.buy();
		}
	}

}
