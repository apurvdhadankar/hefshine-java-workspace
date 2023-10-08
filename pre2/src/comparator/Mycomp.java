package comparator;

import java.util.Comparator;

public class Mycomp implements Comparator<Student> {

	public int compare(Student x, Student y) {
		if(x.marks==y.marks)
		{
			return x.name.compareToIgnoreCase(y.name);
		}
		else if(x.marks > y.marks)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	
	

}
