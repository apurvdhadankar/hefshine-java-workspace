package oopsPre;

public class EmployeeHW_1 {
	int emp_id;
	String name;
	int sal;
	String Dept;
	
	public EmployeeHW_1(int emp_id, String name, int sal, String dept) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.sal = sal;
		Dept = dept;
	}
	int calcluteSal()
	{
		sal = (int) ((int) sal+(sal*0.35));
		return sal;
	}
	void display()
	{
		System.out.println(emp_id+" "+name+" "+sal+" "+Dept);
	}

	public static void main(String[] args) {
		
		EmployeeHW_1 emp = new EmployeeHW_1(1, "Kajuuuu", 15000, "IT");
		EmployeeHW_1 emp1 = new EmployeeHW_1(2, "Apurv", 200000, "Gaming");
		emp.calcluteSal();
		emp.display();
		emp1.calcluteSal();
		emp1.display();
	}

}
