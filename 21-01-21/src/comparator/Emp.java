package comparator;

public class Emp {
	int id;
	String name;
	String age;
	int sal;
	public Emp(int id, String name, String age, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
	

}
