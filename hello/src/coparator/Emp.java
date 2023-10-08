package coparator;
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
		return "\n Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
