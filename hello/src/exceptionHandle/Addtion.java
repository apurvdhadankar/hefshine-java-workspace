package exceptionHandle;

public class Addtion {
	static int i=0;
	public synchronized static void add()
	{
		i=i+1;
	}
}
