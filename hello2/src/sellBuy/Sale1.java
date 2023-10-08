package sellBuy;

public class Sale1 extends Thread{
	Stock1 s;
	Sale1(Stock1 s1)
	{
		s = s1;
	}

	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			s.sell();
		}
	}

}
