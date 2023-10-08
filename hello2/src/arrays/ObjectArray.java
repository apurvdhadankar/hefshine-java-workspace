package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Monu", 40);
		Student s2 = new Student(2, "Mou", 39);
		Student s3 = new Student(3, "Mnu", 40);
		Student s4 = new Student(4, "onu", 24);
		Student s6 = new Student(5, "onu", 40);
		
		
		
		Student[] a = {s1,s2,s3,s4,s6};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i<j && a[i].marks > a[j].marks)
				{
					Student temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
