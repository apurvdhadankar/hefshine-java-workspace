package multilThradingPreeeeeeeeeeeeeeee;

public class Box 
{
	int biscuit=0;
	public synchronized void produce()
	{
		biscuit = biscuit+1;
		System.out.println("Produce-> "+biscuit);
		if(biscuit>20)
		{
			notify();
		}
	}
	public synchronized void consume()
	{
		if(biscuit<=20)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		biscuit=biscuit-1;
		System.out.println("Counsume-> "+biscuit);	
	}
}
class Thread1 extends Thread
{
	Box b;
	public Thread1(Box b) 
	{
		this.b=b;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
		{
			
			try {
				b.produce();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thrad2 extends Thread
{
	Box b;
	public Thrad2(Box b)
	{
		this.b=b;
	}
	@Override
	public void run() 
	{
		for (int i = 0; i < 100; i++) 
		{
			b.consume();
		}
	}
}
class Main
{
	public static void main(String[] args) {
		Box b1 = new Box();
		Thread1 t1 = new Thread1(b1);
		Thrad2 t2 = new Thrad2(b1);
		t1.start();
		t2.start();
	}
}
