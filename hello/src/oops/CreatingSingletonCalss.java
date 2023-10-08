package oops;

public class CreatingSingletonCalss {
	int rn;
	String name;
	int marks;
	private CreatingSingletonCalss() {}
	static CreatingSingletonCalss s = new CreatingSingletonCalss();
	public static CreatingSingletonCalss getStudent()
	{
		return s;
	}
}
