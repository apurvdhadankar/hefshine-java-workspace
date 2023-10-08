package oops;

import java.util.Scanner;

public class Calculator {
//	int num1, num2, res;
	int calculateSum(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	int calculateDifference(int num1, int num2) {
		int diff;
		if(num1>num2)
			diff = num1-num2;
		else
			diff = num2-num1;
		return diff;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator obj = new Calculator();
		System.out.println("Enter Two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = obj.calculateSum(num1, num2);
		System.out.println(sum);
		int diff = obj.calculateDifference(num1, num2);
		System.out.println("Difference is "+diff);
		

	}

}
