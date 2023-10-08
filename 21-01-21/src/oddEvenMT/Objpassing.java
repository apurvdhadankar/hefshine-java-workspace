package oddEvenMT;

public class Objpassing {
	int id;
	String name;
	public Objpassing(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public Objpassing(Objpassing ob)
	{
		Objpassing o = ob;
		System.out.println(ob.id+" "+ob.name);
	}

	public static void main(String[] args) {
		Objpassing obj = new Objpassing(8, "ab");
		Objpassing obj1 = new Objpassing(obj);

	}

}
