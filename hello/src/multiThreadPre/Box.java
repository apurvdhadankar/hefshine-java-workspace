package multiThreadPre;

public class Box {
	int bicuits=0;
	public synchronized void produce()
	{
		if(bicuits>20)
		{
			notify();
		}
		bicuits = bicuits+20;
		System.out.println("Produce "+bicuits);
	}
	public synchronized void consume()
	{
		if(bicuits<100)
		{
			try {wait();}catch (Exception e) {}
		}
		bicuits = bicuits-20;
		System.out.println("Consume "+bicuits);
	}
}
