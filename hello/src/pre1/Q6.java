package pre1;

public class Q6 {

	public static void main(String[] args) {
		int unit=300;
		double totalBill=0, bill=0;
		if(unit<=50)
		{
			bill =  unit*0.5;
		}
		else if(unit <= 150)
		{
			
			bill = 50*0.5+(unit-50)*0.75;
		}
		else if(unit <= 250)
		{
			
			bill = 50*0.5+100*0.75+(unit-150)*1.20;
		}
		else if(unit > 250)
		{
			bill = 50*0.5+100*0.75+150*1.20+(unit-250)*1.50;
		}
		totalBill = bill+bill*0.2;
		System.out.println("Bill is : " +bill);
		System.out.println("Total Bill is : "+totalBill);

	}

}
