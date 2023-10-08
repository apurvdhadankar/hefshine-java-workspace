package newlinkedlist;

public class MyClass {

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList<>();
		ll.add(11);
		ll.add(12);
		ll.add("jchg");
		ll.add(14);
		ll.add(15);
		ll.add("bsvhj");
		ll.add(66);
		
		ll.print();
		System.out.println(ll.find(13));
	}

}
