package buySellBidirectonal;

public class T2 extends Thread{
	Item  b;
	public T2(Item b) 
	{
		this.b=b;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			b.sell();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
