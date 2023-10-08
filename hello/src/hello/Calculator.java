package hello;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a= sc.nextInt();
		System.out.println("Enter 2nd no");
		int b = sc.nextInt();
		System.out.println("Enter operation no: 1-Add, 2-Sub, 3-Mul, 4-Div");
		int op=sc.nextInt();
//		if(op==1) {
//			System.out.println("Addition is "+(a+b));
//		}
//		else if(op==2) {
//			System.out.println("Multiplication is " +(a-b));
//		}
//		else if(op==3) {
//			System.out.println("Multiplication is "+ (a*b));
//		}
//		else if(op==4) {
//			System.out.println("Division is "+ (a/b));
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
		
		switch(op) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid Input");
			break;
		
		}
		

	}

}
