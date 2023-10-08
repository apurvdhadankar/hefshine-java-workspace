package comparable;

public class Emp implements Comparable<Emp>{

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
	public int compareTo(Emp o) {
		if(o.sal==sal)
			return 0;
		else if(o.sal<sal)
			return 1;
		else
			return -1;
	}
	

}
