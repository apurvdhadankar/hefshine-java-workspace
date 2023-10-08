package gsLab;

//A java program to demonstrate use of
//static keyword with methods and variables

//Student class
class Student1
{
	String name;
	int rollNo;
	
	// static variable
	static String cllgName;
	
	// static counter to set unique roll no
	static int counter = 0;
	
	
	public Student1(String name)
	{
		this.name = name;
		
		this.rollNo = setRollNo();
	}
	
	// getting unique rollNo
	// through static variable(counter)
	static int setRollNo()
	{
		counter++;
		return counter;
	}
	
	// static method
	static void setCllg(String name){
		cllgName = name ;
	}
	
	// instance method
	void getStudentInfo(){
		System.out.println("name : " + this.name);
		System.out.println("rollNo : " + this.rollNo);
		
		// accessing static variable
		System.out.println("cllgName : " + cllgName);
	}
}

//Driver class
public class StaticDemo
{
	
	static int x = 10;
	final int y = 15;
	static final int z = 30;
	public static void main(String[] args)
	{
		// calling static method
		// without instantiating Student class
		Student1.setCllg("XYZ");
	
		Student1 s1 = new Student1("Alice");
		Student1 s2 = new Student1("Bob");
		
		x = 11;
		StaticDemo st = new StaticDemo();
//		st.y=16;
//		z = 46;
		
		s1.getStudentInfo();
		s2.getStudentInfo();
		
	}
}

