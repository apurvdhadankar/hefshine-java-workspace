package oopsPre;

import java.util.Scanner;

import comparable.Emp;

public class Employee {
	int year_of_service;
	double bonus, sal, totalsal;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter sal");
		sal = sc.nextFloat();
		System.out.println("Year Of Service");
		year_of_service = sc.nextInt();
	}
	void calsal()
	{
		if(year_of_service<5)
		{
			bonus = sal*0.15;
			totalsal = sal+bonus;
		}
		else
		{
			bonus = sal*0.35;
			totalsal = sal+bonus;
		}
	}
	void display()
	{
		System.out.println("Year Of Service "+year_of_service);
		System.out.println("Sal "+sal);
		System.out.println("Bonus "+bonus);
		System.out.println("TotalSal "+totalsal);
	}
	

	public static void main(String[] args) {
		Employee ob = new Employee();
		ob.input();
		ob.calsal();
		ob.display();

	}

}
