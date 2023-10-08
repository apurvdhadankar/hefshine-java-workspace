package linkedList;

public class Student {
	int rn;
	String name;
	Student next;
	public Student(int rn, String name) {
		super();
		this.rn = rn;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", next=" + next + "]";
	}
	
	

}
