package sellBuy;



public class StoreMain {

	public static void main(String[] args) {
		Stock1 s = new Stock1();
		Sale1 s1 = new Sale1(s);
		Buy1  b= new Buy1(s);
		s1.start();
		b.start();
		

	}

}
