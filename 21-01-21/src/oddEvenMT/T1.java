package oddEvenMT;

public class T1 extends Thread{
	OddEven b;
	public T1(OddEven b) 
	{
		this.b=b;
	}
	public void run() {
		for (int i = 0; i < 10; i++) 
		{
			b.odd();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
