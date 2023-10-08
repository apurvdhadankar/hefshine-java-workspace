package oops;

import java.util.Scanner;

public class AddMulQuit {
	static int num1, num2, result;
	
	
	void add() {
		result=num1+num2;
		System.out.println("Result - "+result);
	}
	void sub() {
		result=num1-num2;
		System.out.println("Result - "+result);
	}
	void mul() {
		result = num1*num2;
		System.out.println("Result - "+result);
	}	
	void div() {
		result = num1/num2;
		System.out.println("Result - "+result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		AddMulQuit a1 = new AddMulQuit();
		do {
			System.out.println("WELCOME\n Add-1 \n Substract-2 \n Multiply-3 \n Quit-4");
			ch = sc.nextInt();	
			switch(ch){
			case 1:
				System.out.println("Enter First Number");
				num1 = sc.nextInt(); 
				System.out.println("Enter Second Number");
				num2 = sc.nextInt();
				a1.add();
				break;
			case 2:
				System.out.println("Enter First Number");
				num1 = sc.nextInt(); 
				System.out.println("Enter Second Number");
				num2 = sc.nextInt();
				a1.sub();
				break;
			case 3:
				System.out.println("Enter First Number");
				num1 = sc.nextInt(); 
				System.out.println("Enter Second Number");
				num2 = sc.nextInt();
				a1.mul();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("INVALID CHOICE");
			}
			
			
		}while(ch != 4);
		

	}

}
