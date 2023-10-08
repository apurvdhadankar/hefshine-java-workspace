package oopsPre;

import java.util.Scanner;

public class LaptopManufacure {
	static int ch=0;
	int num1,num2,result;
	static Scanner sc = new Scanner(System.in);
	void initialize()
	{
		
		System.out.println("Enter number1");
		num1 = sc.nextInt();
		System.out.println("Enter num2");
		num2 = sc.nextInt();
	}
	void addition()
	{
		result = num1+num2;
		System.out.println(result);
	}
    void substraction()
	{
		result = num1-num2;
		System.out.println(result);
	}
	void multiplication()
	{
		result = num1*num2;
		System.out.println(result);
	}
	

	public static void main(String[] args) {

		LaptopManufacure ob = new LaptopManufacure();
		System.out.println("WELCOME");
		
		do
		{
			
			System.out.println("Enter Option\n 1.Add\n 2.Sub\n 3.Mul\n 4Quit");
			ch = sc.nextInt();

		switch(ch)
		{
		case 1:
			ob.initialize();
			ob.addition();
			break;
		case 2:
			ob.initialize();
			ob.substraction();
			break;
		case 3:
			ob.initialize();
			ob.multiplication();
			break;
		case 4:
			System.out.println("Byyyy");
			System.exit(0);
			break;
			default:
				System.out.println("INVALID CHOICE");
		}
		}while(ch!=4);
	}
}
