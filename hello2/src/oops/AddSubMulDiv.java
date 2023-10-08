package oops;

import java.util.Scanner;

public class AddSubMulDiv {
	int num1, num2, result;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter Two Numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	void add() {
		result = num1+num2;
		System.out.println("Addtion "+result);
	}
	void sub() {
		result = num1-num2;
		System.out.println("Substraction "+result);
	}
	void mul() {
		result = num1*num2;
		System.out.println("Multiplication "+result);
	}
	void div() {
		result = num1/num2;
		System.out.println("Division "+result);
	}
//	void display() {
//		System.out.println("Result"+result);
//	}

	public static void main(String[] args) {
		AddSubMulDiv a = new AddSubMulDiv();
		a.input();
		a.add();
		a.sub();
		a.mul();
		a.div();

	}

}
