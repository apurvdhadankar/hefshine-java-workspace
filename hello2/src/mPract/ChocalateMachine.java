package mPract;

import java.util.Scanner;

public class ChocalateMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Choice: ");
//		int n=sc.nextInt();
//		System.out.println("Give Me Money: ");
//		String money = sc.next();
//		String[] sa = money.split(",");
//		int m[] = new int[sa.length];
//		for (int i = 0; i < m.length; i++) 
//		{
//			m[i] = Integer.parseInt(sa[i]);
//		}
//		int sum=0;
//		for (int i = 0; i < m.length; i++) 
//		{
//			sum +=m[i];
//		}
//		System.out.println("Sum is: "+sum);
		int rem=0;
		int n;
		do {
			System.out.println("No	Chocalate	Price");
			System.out.println("1.   Melody       25");
			System.out.println("2.   LemonGoli    35");
			System.out.println("3.   AlpenLibbe   150");
			System.out.println("4.   DaryMilk     75");
			System.out.println("	Press 0 For Exit...");
			System.out.println("Enter Choice: ");
			n=sc.nextInt();
			if(n==0)
			{
				System.out.println("Byyyyy!");
				System.exit(0);
			}
			System.out.println("Give Me Money: ");
			String money = sc.next();
			String[] sa = money.split(",");
			int m[] = new int[sa.length];
			for (int i = 0; i < m.length; i++) 
			{
				m[i] = Integer.parseInt(sa[i]);
			}
			int sum=0;
			for (int i = 0; i < m.length; i++) 
			{
				sum +=m[i];
			}
			System.out.println("Sum is: "+sum);
			
		switch(n)
		{
		case 1: 
			if(sum>=25)
			{
				System.out.println("Get Your Chocalate Melody ");
				rem=sum-25;
				System.out.println("Give your money back "+rem);
			}
			break;
		case 2: 
			if(sum>=35)
			{
				System.out.println("Get Your Chocalate LemonGoli");
				rem=sum-35;
			}
			break;
		case 3: 
			if(sum>=150)
			{
				System.out.println("Get Your Chocalate AlpenLibbe");
				rem=sum-150;
			}
			System.out.println("Give your money back "+rem);
		case 4: 
			if(sum>=75)
			{
				System.out.println("Get Your Chocalate DaryMilk ");
				rem=sum-75;
			}
			System.out.println("Give your money back "+rem);
			break;
		case 0: 
			System.exit(0);
			System.out.println("Byyyyyyyyyyyy!");
			default:
				System.out.println("Invalid Choice");
		}
		}while(n!=0);
		
	}

}
