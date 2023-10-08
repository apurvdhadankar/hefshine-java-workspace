package linkedlist1;

public class MyClass {

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList<>();
		
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add("svhj");
		
		ll.print();
		ll.delete(1);

		ll.print();
		
		System.out.println(ll.find(12));

	}

}
