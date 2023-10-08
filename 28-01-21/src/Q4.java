
public class Q4 {
	int biscuits=0;
	public synchronized void produde() throws InterruptedException
	{
		biscuits = biscuits+20;
		if(biscuits>100)
		{
			notify();
		}
		
		System.out.println("produce "+biscuits);
	}
	
	public synchronized void consume()
	{
		if(biscuits>100)
		{
			biscuits=biscuits-20;
			System.out.println("Consume "+biscuits);
		}
		if(biscuits<20)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
