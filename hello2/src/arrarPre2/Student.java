package arrarPre2;

public class Student {

	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\n Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
