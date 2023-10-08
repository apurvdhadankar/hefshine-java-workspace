package Q3;

public class Stock {
	int biscuits=10;
	public synchronized void produce()
	{
		if(biscuits<20)
		{
	
			biscuits=biscuits+1;
			System.out.println("Produce "+biscuits);
		}
		else
			notify();
		
		
	}
	public synchronized void consume()
	{
		if(biscuits>10)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		biscuits=biscuits-1;
		System.out.println("Consume "+biscuits);
		
	}

}
