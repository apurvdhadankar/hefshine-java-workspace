package cntrlStmt;

public class CopyConstructor {
	int a;
	CopyConstructor b;
	public CopyConstructor(int a)
	{
		this.a=a;
	}
	public CopyConstructor(CopyConstructor b) 
	{
		a=b.a;
	}
	void display()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		CopyConstructor a = new CopyConstructor(10);
		CopyConstructor b = new CopyConstructor(a);
		a.display();
		b.display();
		
	}

}
