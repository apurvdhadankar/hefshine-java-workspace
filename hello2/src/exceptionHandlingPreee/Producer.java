package exceptionHandlingPreee;

public class Producer extends Thread{
	Biscuit b;
	
	public Producer(Biscuit b) 
	{
		this.b=b;
	}
	@Override
	public void run() {
		int i=1;
		while(i<5)
		{
			b.put(i);
			i++;
		}
	}

}
