package multilThradingPreeeeeeeeeeeeeeee;

public class Thrad1 extends Thread {
	Cirlce_HW6 c;
	public Thrad1(Cirlce_HW6 c) 
	{
		this.c=c;
	}
	@Override
	public void run()
	{
		c.setRadius(5);
	}
		

}
