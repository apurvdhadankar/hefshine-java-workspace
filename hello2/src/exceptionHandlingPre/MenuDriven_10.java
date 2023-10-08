package exceptionHandlingPre;

import java.util.Scanner;

public class MenuDriven_10 {

	public static void main(String[] args) throws InterruptedException 
	{
		int ch;
		
		do {
			
			System.out.println("1. Try Multi Catch \n 2. Try Finally \n 3. Try Catch Finally \n 4. Throw \n 5. Throws \n 6.Exit");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			int a=0, b=0;
			switch(ch)
			{
				case  1: 
					try {
						System.out.println("Enter First No");
						a=sc.nextInt();
						System.out.println("Second No");
						b=sc.nextInt();
						System.out.println(a/b);
					}
					catch (ArithmeticException e)
					{
						System.out.println("Arithmetic "+e);
					}
					catch (ArrayIndexOutOfBoundsException r)
					{
						System.out.println("Array Index Error"+r);
					}
					catch (Exception e)
					{
						System.out.println("Exceptio ala re bhooo...");
					}
					break;
				case 2:
					try {
						System.out.println("Enter First No");
						a=sc.nextInt();
						System.out.println("Second No");
						b=sc.nextInt();
						System.out.println(a/b);
					}
					finally {
						System.out.println("Always Execute");
					}
					break;
				case 3:
					try {
						System.out.println("Enter First No");
						a=sc.nextInt();
						System.out.println("Second No");
						b=sc.nextInt();
						System.out.println(a/b);
					}
					catch (ArithmeticException e)
					{
						System.out.println("Arithmetic ");
					}
					finally {
						System.out.println("Always Execute");
					}
				case 4:
					System.out.println("Enter First No");
					a=sc.nextInt();
					System.out.println("Second No");
					b=sc.nextInt();
					if(b==0)
					{
						throw new ArithmeticException();
					}
					System.out.println(a/b);
					break;
				case 5:
					
					Thread.sleep(1000);
					break;
				case 6:
					System.out.println("Byyyyy!");
					System.exit(0);
					break;
					default :
						System.out.println("Invalid Input");
						break;
					
			}
		}while(ch!=6);
		
	}

}
