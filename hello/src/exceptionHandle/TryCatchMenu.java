package exceptionHandle;

import java.util.Scanner;

public class TryCatchMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			try {
				System.out.println("I'm in try block");
			}catch(ArithmeticException e)
			{
				System.out.println("I'm in catch block 1");
			}catch(Exception e) {
				System.out.println("I'm in catch block 2");
			}
			break;
		case 2:
			try {
				System.out.println("I'm in try block");
			}finally {
				System.out.println("I'm in finally");
			}
			break;
		case 3:
			try {
				System.out.println("I'm in try block 3");
			}catch(ArithmeticException e)
			{
				System.out.println("I'm in catch block 3");
			}finally {
				System.out.println("I'm in finally 3");
			}
			break;
			
		}

	}

}
