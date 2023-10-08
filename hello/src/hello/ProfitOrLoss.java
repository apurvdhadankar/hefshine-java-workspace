package hello;

public class ProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int purchase = 800;
		int sale = 700;
		if(sale > purchase) {
			System.out.println("Profit "+ (sale-purchase) );
		}
		else {
			System.out.println("Loss  "+ (purchase-sale));
		}

	}

}
