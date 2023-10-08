package oopsPre;

public class Bank {
	int amount=5000;
	Bank()
	{
//		amount=5000;	
	}
	Bank(int addAmount)
	{
		amount = amount+addAmount;
		System.out.println(amount);
	}

	public static void main(String[] args) {
		Bank b = new Bank(1500);
		
		

	}

}
