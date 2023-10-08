package MT;

public class Thread2 extends Thread {
	Biscuits b;
	public Thread2(Biscuits b) 
	{
		this.b=b;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			b.consume();
		}
	}
	

}
