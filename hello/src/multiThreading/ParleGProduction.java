package multiThreading;

public class ParleGProduction 
{
	int stock=0;
	public synchronized void produce()
	{
		if(stock>20)
		{
			notify();
		}
		stock=stock+1;
		System.out.println("From Produce: "+stock);
	}	

	public synchronized void consume()
	{
		if(stock<20)
		{
			try {wait();}catch (Exception e) {}
		}
		stock=stock-1;
		System.out.println("From Consume: "+stock);
	}
	

}
