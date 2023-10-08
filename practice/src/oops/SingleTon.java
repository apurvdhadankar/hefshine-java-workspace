package oops;

public class SingleTon {
	int rn;
	String name;
	public SingleTon() {}
	
	 static SingleTon obj = new SingleTon();
	public static SingleTon getSingleton()
	{
		return obj;
	}
	
	
	public static void main(String[] args) {
		SingleTon s = new SingleTon().getSingleton();
		SingleTon s1 = new SingleTon().getSingleton();
		SingleTon s2 = new SingleTon().getSingleton();
		SingleTon s3 = new SingleTon().getSingleton();
		s.rn=1;
		s1.rn=2;
		s3.rn=5;
		s.rn=6;
		s.name="sahj";
		s1.name="sdlfknsdlk";
		
		
		System.out.println(s.rn);
		System.out.println(s1.rn);
		System.out.println(s3.rn);
		System.out.println(s.rn);
		System.out.println(s.name);
		System.out.println(s1.name);
		
		
		
		
	}

}
class Child {
	public static void main(String[] args) {
		SingleTon s1 = new SingleTon();
		SingleTon s2 = new SingleTon();
		s1.name="apurv";
		s2.name="dddd";
		System.out.println(s1);
		System.out.println(s2);
	}
}
