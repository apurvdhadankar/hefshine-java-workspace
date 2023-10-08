package oddEvenMT;

public class OddEven {

	int i=1;
	synchronized void odd()
	{
		System.out.println(i+" ");
		i++;
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	synchronized void even()
	{
		System.out.println(i+" ");
		i++;
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
