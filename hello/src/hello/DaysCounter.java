package hello;

public class DaysCounter {

	public static void main(String[] args) {
		int  a = 365;
		int year = a/365;
		System.out.println(year +" Years");
		int b=a%365;
		int months = b/30;
		System.out.println(months +" MONTHS");
		int c=b%30;
		int weeks=c/7;
		System.out.println(weeks + " Weeks");
		int days = c%7;
		System.out.println(days+" Days");
		
		
	}

}
