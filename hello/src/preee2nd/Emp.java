package preee2nd;

public class Emp {
	int id;
	String name;
	int sal;
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
