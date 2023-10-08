package sellBuy;

public class Stock1 {
	int stock=10;
	boolean flag = true;
	public synchronized void buy()
	{
		if(flag)
		{
			try {wait();} catch (InterruptedException e) {}
		}
		stock = stock+5;
		System.out.println("Buy "+stock);
		flag=true;
		notify();
	}
	public synchronized void sell()
	{
		if(!flag)
		{
			try {wait();} catch (InterruptedException e) {}
		}
		stock = stock-5;
		System.out.println("Sale "+stock);
		notify();
	}

}
