package gh;

public class MyClass {
public static void main(String[] args) {
	MyLinkList list = new MyLinkList();
	list.add( new Student(1, "sahnj"));
	list.add( new Student(2, "sadvdv"));
	list.add( new Student(3, "sdd"));
	
	System.out.println(list.getName(1));
	list.addAtIndex(1, new Student(5, "suresh"));
	list.addAtIndex(2, new Student(9, "mahesh"));
	list.addAtIndex(0, new Student(10, "mahesh babu"));
	list.print();
	System.out.println("----");
	list.delete(1);
	list.print();
	
}
}