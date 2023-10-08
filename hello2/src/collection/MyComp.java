package collection;

import java.util.Comparator;

public class MyComp implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if(o1.marks == o2.marks)
			return o1.name.compareToIgnoreCase(o2.name);
		else if(o1.marks > o2.marks)
			return 1;
		else
			return -1;
	}

}
