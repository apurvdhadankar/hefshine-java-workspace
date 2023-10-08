package arrayPre;

import java.util.Scanner;

import collection.Student;

public class student 
{		
	int rollno;
	public student(int rollno, String name, int marks ) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		
	}
	

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}


	String name;
	int marks;
	Scanner sc=new Scanner(System.in);

//	public student(int rno,String N,int Mark ) 
//	{
//		System.out.println("Enter rollNo , name and marks");
//		int rollno = sc.nextInt();
//		String name = sc.next();
//		int marks=sc.nextInt();
//	}

	public static void main(String[] args) 
	{
		
		student obj=new student(1,"mahi",50);		
		student obj1=new student(2,"gahi",40);
		student obj2=new student(3,"yahi",70);
		student obj3=new student(4,"tahi",30);
		student st[]= {obj,obj1,obj2,obj3};
//		System.out.println(obj.marks);
		for (int i = 0; i < st.length; i++) 
		{
			for (int j = i+1; j < st.length; j++) 
			{
				if(st[i].marks>st[j].marks)
				{
					student temp = st[i];
					st[i]=st[j];
					st[j]=temp;
							
					
				}
			}
			
		}
		for (int j = 0; j < st.length; j++) {
			System.out.println(st[j]+" ");
		}
		
		
	}

}
