package methodPre;

import java.util.Scanner;

public class BankMngnt {

	int acc_id;
	String name;
	double balance;
	static Scanner sc = new Scanner(System.in);
	static int ch;
	
	public void inserData()
	{
		System.out.println("Enter Details: 1.acc id 2. Name 3. Balance");
		acc_id = sc.nextInt();
		name  = sc.next();
		balance = sc.nextDouble();
	}
	 public void displayData()
	 {
		 System.out.println(acc_id);
		 System.out.println(name);
		 System.out.println(balance);
	 }
	 public void depositAmount() 
	 {
		System.out.println("Enter Amount");
		int depAmount = sc.nextInt();
		balance = balance+depAmount;
		System.out.println("Balance is "+balance);
	 }
	 public void withdrawAmount()
	 {
		 System.out.println("Enter Withdraw Amount");
		 int wamount = sc.nextInt();
		 if(wamount<balance)
		 {
			 balance = balance-wamount;
			 System.out.println("SuccessFully Withrawed");
			 System.out.println("Balance is "+balance);
		 }
		 else
		 {
			 System.out.println("Insufficient Balance");
		 }
	 }
	 public void accountBalance()
	 {
		 System.out.println("Amount is "+balance);
	 }
	public static void main(String[] args) 
	{
		BankMngnt ob = new BankMngnt();
		do {
			System.out.println(" 1.Insert Data\n id 2. Deposit Amount \n 3. Display Data\n 4. Withdraw Amount\n 5.Exit-5");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				ob.inserData();
				break;
			case 2:
				ob.depositAmount();
				break;
			case 3:
				ob.displayData();
				break;
			case 4:
				ob.withdrawAmount();
				break;
			case 5:
				System.out.println("Byyyyyy!");
				System.exit(0);
				default:
					System.out.println("INVALID OPTION");
			}
		}while(ch!=0);
	}

}
