package pre1;

public class Sale extends Thread {
	Stock s;
	Sale(Stock s1)
	{
		s = s1;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			s.sell();
			try { Thread.sleep(2000); } catch (Exception e) { }
		}
	}

	

}
