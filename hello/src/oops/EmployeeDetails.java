package oops;

import java.util.Scanner;

public class EmployeeDetails {
	int eid;
	String name;
	double salary;
	
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID, Name, Salary");
		eid = sc.nextInt();
		name = sc.next();
		salary = sc.nextDouble();
	}
	void dispaly() {
		System.out.println("eid "+eid+"\n"+"name "+name+"\n"+"Salary "+salary);
	}

	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails();
		EmployeeDetails e2 = new EmployeeDetails();
		
		e1.setData();
		e1.setData();
		System.out.println();
		e2.dispaly();
		e2.dispaly();

	}

}
