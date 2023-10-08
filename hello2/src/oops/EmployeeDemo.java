package oops;

import java.util.Scanner;

public class EmployeeDemo {
	protected int emp_id;
	public String emp_name;
	private double salary;
	String emp_dept;
	
	static Scanner sc = new Scanner(System.in);
	public void doPublic() {
		System.out.println("Enter emp_id, emp_name, salary, emp_dept");
		emp_id = sc.nextInt();
		emp_name = sc.next();
		salary = sc.nextDouble();
		emp_dept = sc.next();
	}
	void doDefault() {
		System.out.println("Enter emp_id, emp_name, salary, emp_dept");
		emp_id = sc.nextInt();
		emp_name = sc.next();
		salary = sc.nextDouble();
		emp_dept = sc.next();
	}
	protected void doProtected() {
		System.out.println("Enter emp_id, emp_name, salary, emp_dept");
		emp_id = sc.nextInt();
		emp_name = sc.next();
		salary = sc.nextDouble();
		emp_dept = sc.next();
	}
	private void doPrivate(){
		System.out.println("Enter emp_id, emp_name, salary, emp_dept");
		emp_id = sc.nextInt();
		emp_name = sc.next();
		salary = sc.nextDouble();
		emp_dept = sc.next();
	}
	

	public static void main(String[] args) {
		EmployeeDemo obj = new EmployeeDemo();
		obj.doPublic();
		obj.doDefault();
		obj.doProtected();
		obj.doPrivate();
		

	}

}
