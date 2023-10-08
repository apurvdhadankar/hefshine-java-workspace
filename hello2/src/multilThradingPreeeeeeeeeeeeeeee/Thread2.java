package multilThradingPreeeeeeeeeeeeeeee;

public class Thread2 extends Thread
{
Cirlce_HW6 c;
public Thread2(Cirlce_HW6 c)
{
	this.c=c;
}
	@Override
		public void run() {
			c.setArea();
		}
}
	


