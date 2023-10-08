package multilThradingPreeeeeeeeeeeeeeee;

public class T1HW5 extends Thread{
	HW5 b;
	public T1HW5(HW5 b) 
	{
		this.b=b;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) 
		{
			b.m1("T1");
		}
	}

}
