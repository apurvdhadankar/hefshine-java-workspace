package arraylist;

public class MainLinkedList {

	public static void main(String[] args) {
		MyLinkedList al = new MyLinkedList<>();
		
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add("apurv");
		al.add("thor");
		al.add("d");
		
		
		System.out.println(al.get(13));
		System.out.println(al.size());
		al.print();
		

	}

}
