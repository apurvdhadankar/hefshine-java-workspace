package exception;

import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) throws InvalidAgeException, InterruptedException {
		int ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice");
			ch  = sc.nextInt();
			int a=0, b=0, result = 0;
			int[] arr = {1,2,3};
		
		switch(ch)
		{
		case 1:
			try
			{
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Enter array elements");
				for (int i = 0; i < arr.length; i++) 
				{
					arr[i] = sc.nextInt();
				}

				System.out.println(a/b);
				System.out.println(arr[10]);
			}
			catch (ArithmeticException e)
			{
				System.out.println(e);
			}
			catch (ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
		
		case 2:
			try
			{
				a=sc.nextInt();
				b=sc.nextInt();
				result=a/b;
				System.out.println(arr[10]);
			}
			finally {
				System.out.println(result);
			}
		case 3:
			try
			{
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println(a/b);
				System.out.println(arr[10]);
			}
			catch (ArithmeticException e)
			{
				System.out.println(e);
			}
			catch (ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
			finally {
				System.out.println(result);
			}
		case 4:
			throw new InvalidAgeException("Nikkal");
		
		case 5:
			Thread.sleep(500);
		
		case 6:
			System.exit(0);
		}
		}while(ch!=0);
		

	}

}
