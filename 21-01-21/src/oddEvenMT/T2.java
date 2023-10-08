package oddEvenMT;

public class T2 extends Thread {
	OddEven b;
	public T2(OddEven b) 
	{
	this.b = b;// TODO Auto-generated constructor stub
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			b.even();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
