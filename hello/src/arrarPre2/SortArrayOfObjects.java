package arrarPre2;

public class SortArrayOfObjects {

	public static void main(String[] args) {
		Student s1 = new Student(1, "aqua", 10);
		Student s2 = new Student(2, "kajya", 101);
		Student s3 = new Student(3, "dhegya", 102);
		Student s4 = new Student(4, "mansi", 103);
		Student s5 = new Student(5, "bahunbali", 410);
		Student s6 = new Student(6, "ambulance", 510);
		
		Student[] s = {s1,s2,s3,s4,s5,s6};
		for (int i = 0; i < s.length; i++)
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].marks < s[j].marks)
				{
					Student temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]);
		}
		

	}

}
