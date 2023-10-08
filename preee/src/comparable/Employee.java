package comparable;

public class Employee implements Comparable<Employee> {

	String name;
	String age;
	int salary;
	public Employee(String name, String age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String toString() {
		return " \n Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public int compareTo(Employee o) {
		if(this.salary==o.salary)
		{
//			o.name.compareToIgnoreCase(this.name);
			 if(this.name.compareToIgnoreCase(o.name)==0)
			
				return this.age.compareTo(o.age);
			return 0;
		}
		else if(o.salary > this.salary)
			return 1;
		else
			return -1;
	}
	
	
	}
