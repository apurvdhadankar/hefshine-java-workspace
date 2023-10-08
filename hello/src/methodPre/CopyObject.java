package methodPre;

public class CopyObject {
	int a;
	public CopyObject(int a) 
	{
		this.a = a;
	}
	public CopyObject(CopyObject ob) {
		a=ob.a;
	}
	void display()
	{
		System.out.println("a = "+a);
	}
	public static void main(String[] args) 
	{
		CopyObject c1 = new CopyObject(10);
		CopyObject c2 = new CopyObject(c1);
		c1.display();
		c2.display();

	}

}
