package test1;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  = 0;
		int b =0;
		int ch=0;
		int res=0;
		
		do {
			System.out.println("Welcome!!!!!");
			System.out.println("Enter Option :\n1.Add-1\n2.Sub-2\n3.Multiply-3\n4.Quit-4");
			ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter Two Numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
				res = a+b;
				System.out.println("The Result is "+res);
				break;
			case 2:
				System.out.println("Enter Two Numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
				res = a-b;
				System.out.println("The Result is "+res);
				break;
			case 3:
				System.out.println("Enter Two Numbers:");
				a = sc.nextInt();
				b = sc.nextInt();
				res = a*b;
				System.out.println("The Result is "+res);
				break;
			case 4:
				System.out.println("By!!!!!!!");
				System.exit(0);
				default:
					System.out.println("Invalid Choice");
				
				
		}
		}while(ch!=4);
	}

}
