package oops;

import java.util.Scanner;

public class CalcUsingMethodWithReturn {
	int add(int a, int b) {
		int res = a+b;
		return res;
	}
	int sub(int a, int b) {
		int res = a-b;
		return res;
	}
	int mul(int a, int b) {
		int res = a*b;
		return res;
	}
	int div(int a, int b) {
		int res = a/b;
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		
		CalcUsingMethodWithReturn obj = new CalcUsingMethodWithReturn();
		do {
			System.out.println("Add-1\nSub-2\nMul-3\nDiv-4\nExit-5");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Two Numbers");
				int num1=sc.nextInt();
				int num2= sc.nextInt();
				int res1 = obj.add(num1, num2);
				System.out.println(res1);
				break;
			case 2:
				System.out.println("Enter Two Numbers");
				num1=sc.nextInt();
					 num2= sc.nextInt();
					int res2 = obj.sub(num1, num2);
					System.out.println(res2);
					break;
			case 3:
				System.out.println("Enter Two Numbers");
				 num1=sc.nextInt();
				num2= sc.nextInt();
				int res3 = obj.mul(num1, num2);
				System.out.println(res3);
				break;
			case 4:
				System.out.println("Enter Two Numbers");
				num1=sc.nextInt();
				num2= sc.nextInt();
				int res4 = obj.div(num1, num2);
				System.out.println(res4);
			case 5:
				System.out.println("Byyyy!");
				System.exit(0);
			}
		}while(ch != 5);
		}
		

	}


