package test1;

public class MyClass {
	

	public static void main(String[] args) {
		Address obj = new Address(1, "Aura", "Maha", "india");
		Person p = new Person("Juli", 555555, "SDE", 25, "California", obj );
		p.displayPersonDetails();
	}

}
