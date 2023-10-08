package Q3;

public class Thread2 extends Thread {
	Stock s;
	public Thread2(Stock s) {
		this.s=s;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			s.consume();
		}
	}

}
