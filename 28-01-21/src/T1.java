
public class T1 extends Thread {
	Q4 q;
	public T1(Q4 q) 
	{
		this.q=q;
	}
	@Override
	public void run() {
		for(int i=0; i<100; i++)
		{
			try {
				q.produde();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
