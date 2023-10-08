package construcorPre;

public class CopyConstructor {
	int a;
	public CopyConstructor(int a) 
	{
		this.a=a;
	}
	public CopyConstructor(CopyConstructor ob) 
	{
		a = ob.a;
	}
	void display()
	{
		System.out.println(a);
	}
		

	public static void main(String[] args) {
		CopyConstructor obj = new CopyConstructor(5);
		CopyConstructor obj1 = new CopyConstructor(obj);
		obj.display();
		obj1.display();

	}

}
