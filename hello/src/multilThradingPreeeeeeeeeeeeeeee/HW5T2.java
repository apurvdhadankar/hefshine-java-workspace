package multilThradingPreeeeeeeeeeeeeeee;

public class HW5T2 extends Thread{
	HW5 b;
	public HW5T2(HW5 b) {
		this.b = b;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) 
		{
			b.m1("T2");
		}
	}

}
