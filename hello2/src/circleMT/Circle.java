package circleMT;

public class Circle {

	int radius=0;
	public synchronized void radius(int r)
	{
		radius = r;
		notify();
	}
	public synchronized void area()
	{
		if(radius==0)
		{
			try {
				wait();
				Thread.sleep(100);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(3.14 * radius* radius);
	}
}
