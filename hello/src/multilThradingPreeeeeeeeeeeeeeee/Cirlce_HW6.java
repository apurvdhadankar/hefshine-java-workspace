package multilThradingPreeeeeeeeeeeeeeee;

public class Cirlce_HW6 {
	int radius = 0;
	public synchronized void setRadius(int radius)
	{
		this.radius=radius;
		notify();
	}
	public synchronized void setArea()
	{
		if(radius==0)
		{
			try {Thread.sleep(100);wait();} catch (InterruptedException e) {System.out.println("takreeee");}
		}
		double area = 3.14*radius*radius;
		System.out.println(area);
	}

	
}
