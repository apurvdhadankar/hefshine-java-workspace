package buySellBidirectonal;
public class Item {
 boolean flag = true;
 public synchronized void buy()
 {
	 if(flag)
	 {
		 try
		 {
			 wait();
		 }
		 catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 System.out.println("buy");
	 flag=true;
	 notify();
 }
 public synchronized void sell()
 {
	 if(!flag)
	 {
		 try
		 {
			 wait();
		 }
		 catch (InterruptedException e) {
			 e.printStackTrace();
		}
		
	 }
	 System.out.println("sell");
	 flag=false;
	 notify();
 }
}
