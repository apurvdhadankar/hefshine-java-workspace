package controlStatement;

public class Electricty {

	public static void main(String[] args) {
		int unit=105;
		double bill=0, totalBill=0;
		if(unit<50)
		{
			bill = unit*0.50;
		}
		else if(unit<150)
		{
			bill = 50*0.50+(unit-50)*0.75;
		}
		else if(unit < 250)
		{
			bill = 50*0.50+100*0.75+(unit-150)*1.20;
		}
		else 
		{
			bill = 50*0.50+100*0.75+150*1.20+(unit-250)*1.50;
		}
		System.out.println(bill);
		totalBill = bill+bill*0.2;
		System.out.println(totalBill);
	}

}
