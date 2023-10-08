package construtorPrePract;

public class Employee {
	int id;
	String name;
	String Address;
	int salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.salary = salary;
	}

	int calculateSal(int a)
	{
	 int salary=50000;
	 return salary;
	}
	void displayEmployeeData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(Address);
		System.out.println(salary);
	}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee(1, "kk", "N-2", 30000);

	}

}
