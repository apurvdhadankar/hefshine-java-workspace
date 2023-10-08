package oops;

public class CopyConstructor {
	int a,b;
	public CopyConstructor(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}
	public CopyConstructor(CopyConstructor ob) 
	{
		a=ob.a;
		b=ob.b;
		
	}
	void display()
	{
		System.out.println("a  "+a);
		System.out.println("b  "+b);
	}

	public static void main(String[] args) {
		CopyConstructor ob1 = new CopyConstructor(10, 20);
		CopyConstructor ob2 = new CopyConstructor(ob1);
		ob1.display();
		ob2.display();
		
	}

}
