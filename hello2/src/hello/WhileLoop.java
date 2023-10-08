package hello;

public class WhileLoop {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			i++;
			if(i==3)
				continue;
			
			System.out.println(i);
		}
		System.out.println("__________________________");
		i=0;
		while(i<5) {
			System.out.println(i);
//			i++;
			if(i==3)
				continue;
			
			System.out.println(i);
//			i++;
		}
		System.out.println("Hello");

	}

}
