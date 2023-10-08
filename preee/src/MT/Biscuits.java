package MT;

public class Biscuits {
	int biscuits=10;
	public synchronized void produce()
	{
		biscuits=biscuits+1;
		System.out.println("Produce "+biscuits);
		if(biscuits>19)
		{
			notify();
				
		}
	}
	public synchronized void consume()
	{
		if(biscuits<20)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		biscuits = biscuits-10;
		System.out.println("Consume "+biscuits);
		
		
	}
		
	
}
