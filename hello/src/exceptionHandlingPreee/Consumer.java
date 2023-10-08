package exceptionHandlingPreee;

public class Consumer extends Thread{
	Biscuit b;
	public Consumer(Biscuit b) 
	{
		this.b=b;
	}
	@Override
	public void run() {
		while(true)
		{
			b.get();
		}
	}

}
