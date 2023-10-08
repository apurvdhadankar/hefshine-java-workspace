package buySellBidirectonal;

public class T1 extends Thread{
	Item i1;
	public T1(Item i1) {
		this.i1=i1;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			i1.buy();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
