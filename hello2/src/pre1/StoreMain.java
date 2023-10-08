package pre1;

public class StoreMain {

	public static void main(String[] args) {
		Stock s = new Stock();
		Buy b = new Buy(s);
		Sale c=new Sale(s);
		b.start();
		c.start();

	}

}
