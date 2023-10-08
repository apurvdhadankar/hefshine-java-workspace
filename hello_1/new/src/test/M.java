package test;

class A {
	public int i;
	public int k;
}
class B extends A{
	void disaplay()
	{
		super.k=super.i+1;
		System.out.println(super.i+" "+super.k);
	}
}
public class M
{
	public static void main(String[] args) {
		B a = new B();
		a.i=1;
		a.k=2;
		a.disaplay();
	}

}
