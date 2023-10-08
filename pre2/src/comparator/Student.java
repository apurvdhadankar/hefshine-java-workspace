package comparator;

public class Student {
	String name;
	int rollNo;
	int marks;
	
	public Student(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	

}
