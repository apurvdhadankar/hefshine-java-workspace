package hello;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Unit ");
		int unit = sc.nextInt();
		float totalBill;
		float bill;
		if(unit < 50)
		{
			bill = unit * 0.5f;
		}
		else if(unit <= 150)
		{
			bill = 50*0.5f + (unit-50)*0.75f;
		}
		else if(unit <= 250) {
			bill = 50*0.5f+100*0.75f+(unit - 150)*1.20f;
		}
		else {
			bill = 50*0.5f+100*0.75f+150*1.20f+(unit-250)*1.50f;
		}
		totalBill = bill+bill*0.2f;
		System.out.println("Bill - "+ bill+ " TotalBill - "+totalBill );
		
	}

}
