package oops;

import java.util.Scanner;

public class SalaryOfEmployee {
	Scanner sc = new Scanner(System.in);
	int salary, bonus, total_salary, years;
	void input() {
		System.out.println("Enter Salary");
		salary = sc.nextInt();
		System.out.println("Enter Years");
		years = sc.nextInt();
	}
	void calsal() {
		if(years >= 5) {
			bonus = salary * 35/100;
		}
		else {
			bonus = salary * 15/100;
		}
		total_salary = salary + bonus;
		System.out.println(total_salary);
	}
	

	public static void main(String[] args) {
		SalaryOfEmployee e1 = new SalaryOfEmployee();
		e1.input();
		e1.calsal();

	}

}
