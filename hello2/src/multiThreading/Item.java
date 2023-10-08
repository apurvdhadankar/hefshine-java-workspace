package multiThreading;

public class Item 
{
	int stock=0;
	public void buy()
	{
		for(int i=0; i<100; i++)
		{
			stock +=1;
		}
		System.out.println("Buy is "+stock);
	}
	public void sell()
	{
		for(int i=0; i<100; i++)
		{
			stock -=1;
		}
		System.out.println("Sell is "+stock);
	}
	public static void main(String[] args) 
	{
		

	}

}
