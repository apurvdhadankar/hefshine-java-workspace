package cntrlStmt;

public class DaysCounter {

	public static void main(String[] args) {
		int num=373;
		int year =0, months=0,week=0,days=0;
		year=num/365;
		System.out.println(year);
		months =num%365/30;
		System.out.println(months);
		week=num%365%30/7;
		System.out.println(week);
		days=num%365%30%7;
		System.out.println(days);
		//		int years = days/365;
//		System.out.println(years);
//		int months = years%365;
//		 months = years/30;m
//		System.out.println(months);
//		int weeks = days%30;
//		weeks = weeks/7;
//		System.out.println(weeks);
//		
		
	}

}
