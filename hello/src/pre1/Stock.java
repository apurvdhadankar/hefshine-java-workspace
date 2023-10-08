package pre1;

public class Stock {

		int stock=10;
		public synchronized void buy()
		{
			if(stock>10)
			{
				notify();
			}
			stock=stock+10;
			System.out.println("Buy Stock : "+stock);
		}

		public synchronized void sell()
		{
			if(stock<10)
			{
				try { wait(); } catch (Exception e) { }
			}
			stock=stock-8;
			System.out.println("Sell Stock : "+stock);
		}
		

	

}
