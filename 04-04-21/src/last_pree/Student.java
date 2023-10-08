package last_pree;

public class Student {
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\n Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}
