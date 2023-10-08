package kajal;

public class Q5 {

	public static void main(String[] args) {
		int a=8114;
		int year = a/365;
		System.out.println(year +" Year");
		int b = a%365;
		int months = b/30;
		System.out.println(months+" Months");
		int c=b%30;
		int weeks=c/7;
		System.out.println(weeks + " Weeks");
		int days = c%7;
		System.out.println(days+" Days");

	}

}
