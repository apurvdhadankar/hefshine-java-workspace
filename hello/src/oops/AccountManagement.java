package oops;

import java.util.Scanner;

public class AccountManagement 
{
	int accid;
	String name;
	double balance, wamount, deposit;
	static int ch=0;
	static Scanner sc = new Scanner(System.in);
	void insertData() {
		
		System.out.println("Enter accid, name, balance");
		accid = sc.nextInt();
		name = sc.next();
		balance = sc.nextDouble();
	}
	
	void wAmount() {
		System.out.println("Enter Amount To Withdraw");
		wamount = sc.nextDouble();
		if(wamount <= balance-1000) {
			balance = balance-wamount;
			System.out.println("Successfully Withdraw.. Balance is "+balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void Deposit() {
		System.out.println("Enter Amount To Deposit");
		deposit = sc.nextDouble();
		deposit =balance+deposit;
		System.out.println("Balance is "+balance);
	}
	void dispalyDetails() {
		System.out.println("accid "+accid+" name "+name+" balance "+balance);
	}
	

	public static void main(String[] args) {
		AccountManagement b1 = new AccountManagement();
		
		do
		{
			System.out.println("1-Inster Details\n 2-Withdraw Amoount\n 3-Deposit\n 4-Display Acc. Details\n 5-EXIT");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				b1.insertData();
				break;
			case 2:
				b1.wAmount();
				break;
			case 3:
				b1.dispalyDetails();
				break;
			case 4: 
				b1.Deposit();
				break;
			case 5:
				System.out.println("Thank u Byyyy!");
				System.exit(0);
				
			}
			
			
		}while(ch != 5);
//		b1.insertData();
//		b1.wAmount();
//		b1.dispalyDetails();
//		b1.Deposit();

	}

}
