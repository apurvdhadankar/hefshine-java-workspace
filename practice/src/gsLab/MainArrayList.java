package gsLab;

public class MainArrayList {

	public static void main(String[] args) {
		MyArrayList<Student> al = new MyArrayList();
//		al.add(10);
//		al.add(11);
//		al.add(12);
//		al.add(13);
//		al.add(14);
//		al.add(15);
//		al.add(16);
//		al.add(17);
//		al.add(10);
//		al.add(11);
//		al.add(12);
//		al.add(13);
		al.add(new Student(1, "apurv"));
		al.add(new Student(1, "gian"));
	
		
		al.print();
		

	}

}
