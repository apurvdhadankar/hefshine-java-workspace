
public class T2 extends Thread{
	Q4 q;
	T2(Q4 q)
	{
		this.q=q;
	}
	@Override
	public void run() {
		for(int i=0; i<100; i++)
		{
			q.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
