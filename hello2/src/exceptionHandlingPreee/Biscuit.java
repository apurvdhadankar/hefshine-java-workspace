package exceptionHandlingPreee;

public class Biscuit {
	boolean flag=false;
	int n;
	synchronized void put(int n)
	{
		if(flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Put:"+this.n);
		notify();
		flag = true;
	}
	synchronized void get()
	{
		if(!flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("get:"+n);
		notify();
		flag=false;
	}
	
}
